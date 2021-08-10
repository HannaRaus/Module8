package ua.goit.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.goit.application.model.entity.Product;
import ua.goit.application.model.repository.GenericRepository;
import ua.goit.application.model.repository.ProductRepository;

@Service
public class ProductService extends GenericService<Product> {

    @Autowired
    ProductRepository repository;

    @Override
    protected GenericRepository<Product> getRepository() {
        return repository;
    }

}
