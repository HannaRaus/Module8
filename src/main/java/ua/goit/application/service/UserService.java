package ua.goit.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ua.goit.application.exceptions.UserAlreadyExistException;
import ua.goit.application.model.entity.Role;
import ua.goit.application.model.entity.User;
import ua.goit.application.model.repository.GenericRepository;
import ua.goit.application.model.repository.UserRepository;


@Service
public class UserService extends GenericService<User> {

    @Autowired
    UserRepository repository;
    @Autowired
    BCryptPasswordEncoder encoder;

    @Override
    protected GenericRepository<User> getRepository() {
        return repository;
    }

    public void register(User user) {
        if (repository.findByEmail(user.getEmail()).isPresent()) {
            throw new UserAlreadyExistException("Account with provided email already exists");
        }

        user.setUserRole(Role.ROLE_USER);
        user.setPassword(encoder.encode(user.getPassword()));
        repository.save(user);
    }

    @Override
    public User save(User entity) {
        if (repository.findByEmail(entity.getEmail()).isPresent()) {
            throw new UserAlreadyExistException(String.format("User with specified email [%s] already exists",
                    entity.getEmail()));
        }
        entity.setPassword(encoder.encode(entity.getPassword()));
        return super.save(entity);
    }
}
