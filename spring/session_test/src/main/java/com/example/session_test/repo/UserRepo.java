package com.example.session_test.repo;

import com.example.session_test.domain.model.Role;
import com.example.session_test.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class UserRepo {

    @Autowired
    PasswordEncoder passwordEncoder;

    private Map<String, User> userRepo = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        userRepo.put("user", new User("user", passwordEncoder.encode("Abc123")).addRole(Role.USER));
        userRepo.put("admin", new User("admin", passwordEncoder.encode("Abc123")).addRole(Role.ADMIN));
    }

    public Optional<User> findByUsername(String username) {
        if (this.userRepo.containsKey(username))
            return Optional.of(this.userRepo.get(username));
        else
            return Optional.empty();
    }
}
