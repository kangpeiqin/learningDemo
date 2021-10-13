package com.example.userService.repository;

import com.example.userService.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author KPQ
 * @date 2021/10/13
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
