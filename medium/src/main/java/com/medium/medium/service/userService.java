package com.medium.medium.service;

import com.medium.medium.entities.User;

/**
 * Created by permmy on 17/05/17.
 */

public interface userService {

    User findUserByEmail(String email);

    void saveUser(User user);
}
