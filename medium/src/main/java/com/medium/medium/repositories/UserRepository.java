package com.medium.medium.repositories;

import com.medium.medium.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by permmy on 17/05/17.
 */


public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
