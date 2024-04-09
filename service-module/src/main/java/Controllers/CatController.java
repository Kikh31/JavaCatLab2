package Controllers;

import Entities.Cat;
import Servicies.CatService;

import java.util.List;

public class CatController {
    private final CatService catService;

    public CatController(CatService _catService) {
        catService = _catService;
    }

    public Cat getCatById(Integer id) {
        return catService.getCatById(id);
    }

    public List<Cat> getAllCats() {
        return catService.getAllCats();
    }

    public Long getCatAmount() {
        return catService.getCatAmount();
    }

    public void addCat(Cat cat) {
        catService.addCat(cat);
    }

    public void deleteCat(Cat cat) {
        catService.deleteCat(cat);
    }

    public void deleteCatById(Integer id) {
        catService.deleteCatById(id);
    }
}
