package com.techstore.techstore.DAO;

import com.techstore.techstore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmailUser(String emailUser);
}
