package com.kaz.springSecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kaz.springSecurity.model.User;
import com.kaz.springSecurity.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User findByUsernameAndPassword(User user) {
        return this.userRepository
                .findByUsernameAndPassword(user.getUsername(), user.getPassword())
                .orElseThrow(() -> new UsernameNotFoundException(user.getUsername()));
    }
}
