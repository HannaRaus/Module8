package ua.goit.application.model.repository;

import org.springframework.stereotype.Repository;
import ua.goit.application.model.entity.Product;

@Repository
public interface ProductRepository extends GenericRepository<Product> {
}
