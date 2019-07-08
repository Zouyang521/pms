package com.zy.pms.dto;


import com.zy.pms.mbg.model.UmsPermission;

import com.zy.pms.mbg.model.Users;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by zy on 2019/7/8.
 */
public class AdminUserDetails implements UserDetails {
    private Users users;
    private List<UmsPermission> permissionList;
    public AdminUserDetails(Users users,List<UmsPermission> permissionList){
        this.users= users;
        this.permissionList = permissionList;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return permissionList.stream()
                .filter(permission ->permission.getValue()!=null)
                .map(permission -> new SimpleGrantedAuthority(permission.getValue()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return users.getUserPassword();
    }

    @Override
    public String getUsername() {
        return users.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return users.getStatus().equals(1);
    }
}
