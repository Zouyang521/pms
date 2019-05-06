package com.zy.pms.controller;

import com.zy.pms.dao.UsersDao;
import com.zy.pms.dto.PmsAdminLoginParam;
import com.zy.pms.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zy
 * @date 2019/4/18 14:57
 */
@RestController
@RequestMapping(value = "/user")
@EnableAutoConfiguration
public class HelloWorldController {
    @Autowired
    private UsersDao usersDao;
    @RequestMapping(value = "/u")
    public Users helloWorld(){
        return usersDao.selectByPrimaryKey(34);
    }
    @RequestMapping(value = "/h")
    public String hello(){
        return "hello";
    }
    @RequestMapping(value = "/login")
    @ResponseBody
    public Object login(@RequestBody PmsAdminLoginParam pmsAdminLoginParam){
        System.out.print(pmsAdminLoginParam.getUsername() + pmsAdminLoginParam.getPassword());
        return 200;
    }
}
