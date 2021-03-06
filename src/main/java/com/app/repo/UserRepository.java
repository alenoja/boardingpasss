package com.app.repo;

import com.app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Integer> {
    User findByEmail(String email);
}
