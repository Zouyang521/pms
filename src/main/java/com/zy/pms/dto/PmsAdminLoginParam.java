package com.zy.pms.dto;

import javax.validation.constraints.NotNull;

/**
 * @author zy
 * @date 2019/4/22 14:42
 */
public class PmsAdminLoginParam {
    @NotNull(message = "用户名不能为空")
    private String username;
    @NotNull(message = "密码不能为空")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
