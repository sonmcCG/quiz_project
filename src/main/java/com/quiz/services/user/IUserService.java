package com.quiz.services.user;

import com.quiz.entities.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
    User findById(int id);
    User create(User product);
    boolean remove(int id);
    User update(User product);
}
