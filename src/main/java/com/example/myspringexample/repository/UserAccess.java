package com.example.myspringexample.repository;

import com.example.myspringexample.domain.User;

import java.util.List;

public interface UserAccess {

    List<User> readAllUser();
}
