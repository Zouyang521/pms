package com.zy.pms.service;

import com.zy.pms.mbg.model.UmsPermission;
import com.zy.pms.mbg.model.Users;

import java.util.List;

/**
 * Created by zy on 2019/7/10.
 */
public interface UsersService {
    /**
     * 通过用户名查找对应的对象
     * @param username
     * @return
     */
    Users getAdminByUsername(String username);

    /**
     * 获取用户的所有权限（包括角色权限+权限）
     * @param userId
     * @return
     */
    List<UmsPermission> getPermissinList(Integer userId);

    /**
     * 登录功能
     * @param username
     * @param password
     * @return生成的JWT的token
     */
    String login(String username,String password);

    /**
     * 注册功能
     * @param users
     * @return
     */
    Users register(Users users);
}
