package com.ems.fyp_ems.service;

import com.ems.fyp_ems.entity.User;
import java.util.List;

public interface UserDetailService {
    List<User> findAll();
    User findById(Long id);
    User save(User user);
    void deleteById(Long id);
}