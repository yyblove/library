package com.thymeleaf.library.controller;

import com.thymeleaf.library.biz.UserService;
import com.thymeleaf.library.domain.User;
import com.thymeleaf.library.mybatis.BookInfo;
import com.thymeleaf.library.mybatis.BookInfoMapper;
import com.thymeleaf.library.vo.Msg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("")
public class LoginController {

    private static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    UserService userService;

    @Autowired
    BookInfoMapper bookInfoMapper;

    @GetMapping("/dashboard")
    public ModelAndView dashboard() {
        ModelAndView view = new ModelAndView("index");
        view.addObject("view", "dashboard");
        List<BookInfo> list = bookInfoMapper.selectAll();
        view.addObject("content", list);
        return view;
    }

    @GetMapping("/login")
    public ModelAndView doGetLogin() {
        ModelAndView view = new ModelAndView("login");
        view.addObject("user", new User());
        view.addObject("msg", new Msg(true, ""));
        return view;
    }

    @PostMapping("/login")
    public ModelAndView doPostLogin(@ModelAttribute(value = "user") User user, HttpServletRequest request) throws IOException {
        ModelAndView model = new ModelAndView("login");
        if (userService.checkUser(user)) {
            HttpSession session = request.getSession(true);
            session.setAttribute("userId", user.getId());
            session.setAttribute("username", user.getUsername());
            model.setViewName("redirect:/dashboard");
        } else {
            model.addObject("user", user);
            model.addObject("msg", new Msg(false, "用户名或密码错误！"));
        }
        return model;
    }


}
