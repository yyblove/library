package com.cz.library.controller;

import com.cz.library.dao.UserDao;
import com.cz.library.entiry.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class LoginController {
    @Autowired
    private UserDao userDao;

    @GetMapping("/tologin.do")
    public ModelAndView tologin(){
        return new ModelAndView("login");
    }
    //判断登录
    @GetMapping(name = "/login")
    public ModelAndView login(HttpServletRequest req, HttpSession session){
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        User user=userDao.findUserByName(username);
        ModelAndView view=new ModelAndView();
        if(username==""){
            view.addObject("login_failed","请先填写用户名");
        }
        if(user==null){
            //用户名错误
            view.addObject("login_failed","用户名错误");
            return view;
        }
        if(!(user.getPassword().equals(password))){
            //密码错误
            view.addObject("login_failed","密码错误");
            return view;
        }else{
            return new ModelAndView("index");
        }
    }
}
