package cn.com.yf.controller;

import cn.com.yf.entity.User;
import cn.com.yf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @author fang.yang
 * @version V1.0
 * @date 2018/10/28 21:27
 * @ClassName:
 * @Description:
 */
@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public User hello(@PathVariable("id") Long id){
        User user = this.userService.queryById(id);
        return user;
    }
}
