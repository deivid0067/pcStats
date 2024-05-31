package com.example.LojaPc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LojaPc.Repository.UserRepository;
import com.example.LojaPc.models.User;



@Service

public class UserService {
    @Autowired
    private UserRepository repository;

    public User save(User user) {
        return repository.save(user);
    }
}
