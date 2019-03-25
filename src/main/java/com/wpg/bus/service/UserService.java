package com.wpg.bus.service;

import com.wpg.bus.dao.UserMapper;
import com.wpg.bus.pojo.User;
import com.wpg.bus.util.RestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {
     @Autowired
    private UserMapper userMapper;

    public RestResult<User> findUserByName(User user) {
          RestResult<User> restResult;
            User users = userMapper.findUserByName(user);
            if(users!=null){
                restResult =RestResult.success(user);
            }else{
                restResult=RestResult.fail("404","用户不存在");
            }
      return  restResult;
    }

}
