package ua.goit.application.authorization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ua.goit.application.model.entity.User;
import ua.goit.application.model.repository.UserRepository;

@Service(value = "userServiceDetails")
public class LibraryUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public LibraryUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final User user = userRepository.findByEmail(username).orElseThrow(() ->
                new UsernameNotFoundException(String.format("User with username %s doesn't exist", username)));
        return new UserPrincipal(user);
    }
}
