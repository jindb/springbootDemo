package com.jindb.controller;

import com.jindb.model.PubUserInfo;
import com.jindb.model.User;
import com.jindb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jindb on 2017/5/23.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String index(Model model){
        PubUserInfo user= userService.GetUserInfo();
        model.addAttribute("name","kkk");
        return "/user/index";
    }
}
