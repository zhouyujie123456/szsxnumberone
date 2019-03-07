package com.aaa.ssm.controller;

import com.aaa.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * fileName:UserController
 * description:
 * author:zyj
 * createTime:2019/3/2 16:44
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @ResponseBody
    @RequestMapping("/list")
 public Object list(){

        System.out.println("修改了分支333355");

        return userService.getUserList();
    }
}
