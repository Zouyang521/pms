package com.zy.pms.controller;

import com.zy.pms.dao.UsersDao;
import com.zy.pms.dto.CommonResult;
import com.zy.pms.dto.PmsAdminLoginParam;

import com.zy.pms.mbg.model.Users;
import com.zy.pms.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zy
 * @date 2019/4/18 14:57
 */
@RestController
@RequestMapping(value = "/user")
@EnableAutoConfiguration
public class UserController {
    @Autowired
    private UsersService usersService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @RequestMapping(value = "/u")
    public Users helloWorld(){
        return null;
    }
    @RequestMapping(value = "/h")
    public String hello(){
        return "hello";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestBody PmsAdminLoginParam pmsAdminLoginParam, BindingResult result){
        String token = usersService.login(pmsAdminLoginParam.getUsername(),pmsAdminLoginParam.getPassword());
        if (token ==null){
            return CommonResult.validateFailed("用户名或密码错误");
                    }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
    }
}
