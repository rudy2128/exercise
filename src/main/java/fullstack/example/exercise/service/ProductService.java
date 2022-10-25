package fullstack.example.exercise.service;

import fullstack.example.exercise.entity.Product;
import fullstack.example.exercise.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;


    public Iterable<Product> findAll(){
        return repo.findAll();
    }
    public void addProduct(Product product){
       repo.save(product);
    }
    public void deleteById(Long id){
        repo.deleteById(id);
    }
    public Optional<Product>findById(Long id){
        return repo.findById(id);
    }
    public void updateById(Product product){
        repo.save(product);
    }
    public List<Product>findByName(String keyword){
        return repo.findByNameContains(keyword);
    }


}
