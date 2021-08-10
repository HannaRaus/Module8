package ua.goit.application.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ua.goit.application.model.repository.GenericRepository;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public abstract class GenericService<T> {

    protected abstract GenericRepository<T> getRepository();

    public T save(T entity) {
        log.info("save.");
        return getRepository().save(entity);
    }

    public T read(UUID uuid) {
        return getRepository().getById(uuid);
    }

    public List<T> readAll() {
        return getRepository().findAll();
    }

    public void delete(UUID uuid) {
        getRepository().deleteById(uuid);
    }
}
