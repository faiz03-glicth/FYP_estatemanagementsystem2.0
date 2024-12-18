package com.ems.fyp_ems.service.impl;

import com.ems.fyp_ems.entity.User;
import com.ems.fyp_ems.repository.UserRepository;
import com.ems.fyp_ems.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserDetailService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
    /* 
     //?edit
     User findUserById(Long userId);

     void updateUser(User user);
 
     void initAdmin();
 
     List<User> findAllPewaris();
 
     List<User> findAllAdmins();
 
     void deleteUserById(Long id);
     */
}