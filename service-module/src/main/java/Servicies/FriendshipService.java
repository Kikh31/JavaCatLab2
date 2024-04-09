package Servicies;

import DAOs.FriendshipDAO;
import Entities.Cat;
import Entities.Friendship;

import java.util.List;

public class FriendshipService {
    private final FriendshipDAO friendshipDAO;

    public FriendshipService(FriendshipDAO _friendshipDAO) {
        friendshipDAO = _friendshipDAO;
    }

    public Friendship getFriendshipById(Integer id) {
        return friendshipDAO.getById(id);
    }

    public Friendship getFriendshipByCats(Cat cat, Cat friend) {
        List<Friendship> friendships = friendshipDAO.getAll();
        return friendships.stream()
                .filter(e -> e.getCat().getCatId().equals(cat.getCatId()))
                .filter(e -> e.getFriend().getCatId().equals(friend.getCatId()))
                .toList().getFirst();
    }

    public Friendship getFriendshipByCatsId(Integer catId, Integer friendId) {
        List<Friendship> friendships = friendshipDAO.getAll();
        return friendships.stream()
                .filter(e -> e.getCat().getCatId().equals(catId))
                .filter(e -> e.getFriend().getCatId().equals(friendId))
                .toList().getFirst();
    }

    public List<Friendship> getAllFriendships() {
        return friendshipDAO.getAll();
    }

    public List<Friendship> getFriendshipsOfCat(Cat cat) {
        //return friendshipDAO.getFriendshipsOfCat(cat);
        List<Friendship> friendships = friendshipDAO.getAll();
        return friendships.stream()
                .filter(e -> e.getCat().getCatId().equals(cat.getCatId()))
                .toList();
    }

    public Long getFriendshipAmount() {
        return friendshipDAO.getCount();
    }

    public void addFriendship(Friendship friendship) {
        friendshipDAO.save(friendship);
    }

    public void deleteFriendship(Friendship friendship) {
        friendshipDAO.delete(friendship);
    }

    public void deleteFriendshipById(Integer id) {
        Friendship friendship = friendshipDAO.getById(id);
        friendshipDAO.delete(friendship);
    }

    public void deleteFriendshipByCats(Cat cat, Cat friend) {
        Friendship friendship = getFriendshipByCats(cat, friend);
        friendshipDAO.delete(friendship);
    }

    public void deleteFriendshipByCatsId(Integer catId, Integer friendId) {
        Friendship friendship = getFriendshipByCatsId(catId, friendId);
        friendshipDAO.delete(friendship);
    }
}
