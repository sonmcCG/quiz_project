package com.quiz.services.user;

import com.quiz.entities.User;
import com.quiz.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService implements IUserService{
    @Autowired
    private IUserRepository userRepository;
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(int id) {
        return userRepository.findOne(id);
    }

    @Override
    public User create(User product) {
        User p = userRepository.save(product);
        return p;
    }

    @Override
    public boolean remove(int id) {
        boolean  isDeleted = false;
        try {
            userRepository.delete(id);
            isDeleted = true;
        }catch (Exception ex) {
            isDeleted = false;
        }
        return isDeleted;
    }

    @Override
    public User update(User product) {
        User p = userRepository.save(product);
        return p;
    }

    public User login(String username, String password){
        return null;
    }
}
