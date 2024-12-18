package com.ems.fyp_ems.repository;

import com.ems.fyp_ems.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    /*
    Optional<User> findByIDNum(String idNum);

    User findUserById(Long userId);

    List<User> findByRoles(Role role);

    void deleteById(Long id);*/
}
