package com.cz.library.dao;

import com.cz.library.entiry.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    public User findUserByName(String username);
    public User findUserByPwd(String password);
}
