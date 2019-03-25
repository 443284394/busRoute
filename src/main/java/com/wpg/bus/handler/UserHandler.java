package com.wpg.bus.handler;

import com.alibaba.fastjson.JSONObject;
import com.wpg.bus.pojo.User;
import com.wpg.bus.service.UserService;
import com.wpg.bus.util.RestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("login")
public class UserHandler {
    @Autowired
    private UserService userService;

    @PostMapping("/index")
    public RestResult<User> login(@RequestBody  User user) {
        return  userService.findUserByName(user);
    }
}
