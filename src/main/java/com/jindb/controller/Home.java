package com.jindb.controller;

import com.jindb.model.PubUserInfo;
import com.jindb.model.User;
import com.jindb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by jindb on 2017/5/23.
 */
@Controller
public class Home {
    @Autowired
    private UserService userService;
    @RequestMapping("/")
    public String index(Model model){
        PubUserInfo user= userService.GetUserInfo();
        model.addAttribute("name",user.getUser_name());
        return "index";
    }
}
