package com.example.LojaPc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LojaPc.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
