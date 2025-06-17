package com.arenz.budgetbunker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.arenz.budgetbunker.model.User;
import com.arenz.budgetbunker.repository.UserRepository;

@Service
public class UserService {
    
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public Optional<User> findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

}
