package com.app.service;

import com.app.model.User;
import com.app.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public boolean isEmailAvailable(String email){
        return userRepository.findByEmail(email) == null ? true : false;
    }

    public boolean createUser(User user){
        return userRepository.save(user) != null ? true : false;
    }

    public User getUser(Integer id){
        return userRepository.getOne(id);
    }
}
