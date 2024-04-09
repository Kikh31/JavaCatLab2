package Servicies;

import DAOs.OwnerDAO;
import Entities.Owner;

import java.util.List;

public class OwnerService {
    private final OwnerDAO ownerDAO;

    public OwnerService(OwnerDAO _ownerDAO) {
        ownerDAO = _ownerDAO;
    }

    public Owner getOwnerById(Integer id) {
        return ownerDAO.getById(id);
    }

    public List<Owner> getAllOwners() {
        return ownerDAO.getAll();
    }

    public Long getOwnerAmount() {
        return ownerDAO.getCount();
    }

    public void addOwner(Owner owner) {
        ownerDAO.save(owner);
    }

    public void deleteOwner(Owner owner) {
        ownerDAO.delete(owner);
    }
    public void deleteOwnerById(Integer id) {
        Owner owner = ownerDAO.getById(id);
        ownerDAO.delete(owner);
    }
}
