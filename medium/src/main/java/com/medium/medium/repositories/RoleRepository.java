package com.medium.medium.repositories;

import com.medium.medium.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by permmy on 17/05/17.
 */

public interface RoleRepository extends JpaRepository <Role, Long> {

    Role findByRole(String role);

}
