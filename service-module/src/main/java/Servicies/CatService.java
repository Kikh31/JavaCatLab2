package Servicies;

import DAOs.CatDAO;
import Entities.Cat;

import java.util.List;

public class CatService {
    private final CatDAO catDAO;

    public CatService(CatDAO _catDAO) {
        catDAO = _catDAO;
    }

    public Cat getCatById(Integer id) {
        return catDAO.getById(id);
    }

    public List<Cat> getAllCats() {
        return catDAO.getAll();
    }

    public Long getCatAmount() {
        return catDAO.getCount();
    }

    public void addCat(Cat cat) {
        catDAO.save(cat);
    }

    public void deleteCat(Cat cat) {
        catDAO.delete(cat);
    }
    public void deleteCatById(Integer id) {
        Cat cat = catDAO.getById(id);
        catDAO.delete(cat);
    }
}
