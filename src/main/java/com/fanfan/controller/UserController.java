package com.fanfan.controller;
import com.fanfan.service.UserService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController implements Controller {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView model = new ModelAndView();
        System.out.println("***************************进入方法");
        model.addObject("list",userService.list());
        model.setViewName("index.jsp");
        System.out.println("***************************进入方法" + userService.list().size());
        return model;
    }
}
