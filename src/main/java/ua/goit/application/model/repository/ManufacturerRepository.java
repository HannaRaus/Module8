package ua.goit.application.model.repository;

import org.springframework.stereotype.Repository;
import ua.goit.application.model.entity.Manufacturer;

@Repository
public interface ManufacturerRepository extends GenericRepository<Manufacturer> {
}
