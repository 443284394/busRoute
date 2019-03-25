package com.wpg.bus.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.wpg.bus.pojo.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper extends BaseMapper<User> {
    User findUserByName(User user);
}
