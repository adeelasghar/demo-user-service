package com.dailylearningbufffer.user.controller;

import com.dailylearningbufffer.user.VO.ResponseTemplateVO;
import com.dailylearningbufffer.user.entity.User;
import com.dailylearningbufffer.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("")
    public User saveUser(@RequestBody User user) {
        log.info("Inside saveUser of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("")
    public ResponseTemplateVO getUserWithDepartment() {
        log.info("Inside getUserWithDepartment of UserController");
        return userService.getUserWithDepartment();
    }


}