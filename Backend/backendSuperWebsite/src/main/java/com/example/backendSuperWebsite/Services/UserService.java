package com.example.backendSuperWebsite.Services;

import com.example.backendSuperWebsite.Entities.User;
import com.example.backendSuperWebsite.InterfaceRepositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    public void updateUser(User user) {
        userRepository.save(user);
    }
}
