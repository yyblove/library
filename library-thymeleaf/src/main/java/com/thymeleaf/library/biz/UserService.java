package com.thymeleaf.library.biz;

import com.thymeleaf.library.domain.User;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public boolean checkUser(User user) {
        if (StringUtils.equals("yyb", user.getUsername())) {
            return true;
        }
        return false;
    }

}
