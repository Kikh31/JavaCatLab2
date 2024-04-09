package Controllers;

import Entities.Owner;
import Servicies.OwnerService;

import java.util.List;

public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService _ownerService) {
        ownerService = _ownerService;
    }

    public Owner getOwnerById(Integer id) {
        return ownerService.getOwnerById(id);
    }

    public List<Owner> getAllOwners() {
        return ownerService.getAllOwners();
    }

    public Long getOwnerAmount() {
        return ownerService.getOwnerAmount();
    }

    public void addOwner(Owner owner) {
        ownerService.addOwner(owner);
    }

    public void deleteOwner(Owner owner) {
        ownerService.deleteOwner(owner);
    }

    public void deleteOwnerById(Integer id) {
        ownerService.deleteOwnerById(id);
    }
}
