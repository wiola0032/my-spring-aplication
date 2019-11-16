package com.example.myspringexample.service;

import com.example.myspringexample.domain.User;
import com.example.myspringexample.repository.FakeRepo;
import com.example.myspringexample.repository.UserAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserService {

    private UserAccess userRepository;

    @Autowired
    public UserService(UserAccess userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return userRepository.readAllUser();
    }
}
