package cn.com.yf.service;

import cn.com.yf.entity.User;
import cn.com.yf.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author fang.yang
 * @version V1.0
 * @date 2018/11/6 21:28
 * @ClassName:
 * @Description:
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public Integer saveUser(User user) {
        return userMapper.insertSelective(user);
    }
}
