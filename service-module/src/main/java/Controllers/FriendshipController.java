package Controllers;

import Entities.Cat;
import Entities.Friendship;
import Servicies.FriendshipService;

import java.util.List;

public class FriendshipController {
    private final FriendshipService friendshipService;

    public FriendshipController(FriendshipService _friendshipService) {
        friendshipService = _friendshipService;
    }

    public Friendship getFriendshipById(Integer id) {
        return friendshipService.getFriendshipById(id);
    }

    public Friendship getFriendshipByCats(Cat cat, Cat friend) {
        return friendshipService.getFriendshipByCats(cat, friend);
    }

    public Friendship getFriendshipByCatsId(Integer catId, Integer friendId) {
        return friendshipService.getFriendshipByCatsId(catId, friendId);
    }

    public List<Friendship> getAllFriendships() {
        return friendshipService.getAllFriendships();
    }

    public List<Friendship> getFriendshipsOfCat(Cat cat) {
        return friendshipService.getFriendshipsOfCat(cat);
    }

    public Long getFriendshipAmount() {
        return friendshipService.getFriendshipAmount();
    }

    public void addFriendship(Friendship friendship) {
        friendshipService.addFriendship(friendship);
    }

    public void deleteFriendship(Friendship friendship) {
        friendshipService.deleteFriendship(friendship);
    }

    public void deleteFriendshipById(Integer id) {
        friendshipService.deleteFriendshipById(id);
    }

    public void deleteFriendshipByCats(Cat cat, Cat friend) {
        friendshipService.deleteFriendshipByCats(cat, friend);
    }

    public void deleteFriendshipByCatsId(Integer catId, Integer friendId) {
        friendshipService.deleteFriendshipByCatsId(catId, friendId);
    }
}
