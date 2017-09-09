package com.thymeleaf.library.controller;

import com.thymeleaf.library.biz.UserService;
import com.thymeleaf.library.domain.User;
import com.thymeleaf.library.mybatis.BookInfo;
import com.thymeleaf.library.mybatis.BookInfoMapper;
import com.thymeleaf.library.mybatis.Library;
import com.thymeleaf.library.mybatis.LibraryMapper;
import com.thymeleaf.library.vo.Msg;
import com.thymeleaf.library.vo.MyModeView;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
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

    @Autowired
    LibraryMapper libraryMapper;

    @GetMapping("/")
    public void loading(@SessionAttribute(name = "username") String username, HttpServletResponse response) throws IOException {
        if (StringUtils.isEmpty(username)) {
            response.sendRedirect("/login");
        } else {
            response.sendRedirect("/index");
        }
    }

    @GetMapping("/index")
    public ModelAndView index() {
        ModelAndView view = new ModelAndView("index");
        view.addObject("view", "dashboard");
        List<BookInfo> list = bookInfoMapper.selectAll();
        view.addObject("content", list);
        return view;
    }

    @GetMapping("/login")
    public ModelAndView doGetLogin() {
        MyModeView modeView = new MyModeView("login", "login");
        modeView.addObject("user", new User());
        return modeView;
    }

    @PostMapping("/login")
    public MyModeView doPostLogin(@ModelAttribute(value = "user") User user, MyModeView model) throws IOException {
        if (userService.checkUser(user)) {
            model.setViewName("redirect:/index");
        } else {
            model.addObject("user", user);
            model.setMsg(new Msg(false, "用户名或密码错误！！！"));
        }
        return model;

    }

    @GetMapping("/library")
    public ModelAndView doGetLibrary(){
        ModelAndView view = new ModelAndView("index");
        view.addObject("view", "library");
        Library library = libraryMapper.selectAll().get(0);
        view.addObject("content", library);
        return view;
    }
}
