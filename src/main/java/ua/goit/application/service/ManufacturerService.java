package ua.goit.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.goit.application.model.entity.Manufacturer;
import ua.goit.application.model.repository.GenericRepository;
import ua.goit.application.model.repository.ManufacturerRepository;

@Service
public class ManufacturerService extends GenericService<Manufacturer> {

    @Autowired
    ManufacturerRepository repository;

    @Override
    protected GenericRepository<Manufacturer> getRepository() {
        return repository;
    }
}
