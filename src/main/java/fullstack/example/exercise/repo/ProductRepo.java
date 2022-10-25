package fullstack.example.exercise.repo;

import fullstack.example.exercise.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepo extends CrudRepository<Product,Long> {
    List<Product>findByNameContains(String keyword);
}
