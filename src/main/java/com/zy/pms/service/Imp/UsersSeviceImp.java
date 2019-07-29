package com.zy.pms.service.Imp;

import com.zy.pms.dao.UserRoleReltation;
import com.zy.pms.mbg.mapper.UsersMapper;
import com.zy.pms.mbg.model.UmsPermission;
import com.zy.pms.mbg.model.Users;
import com.zy.pms.mbg.model.UsersExample;
import com.zy.pms.service.UsersService;
import com.zy.pms.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

/**
 * Created by zy on 2019/7/10.
 */
public class UsersSeviceImp implements UsersService {
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Autowired
    private UserRoleReltation userRoleReltation;
    @Autowired
    private UsersMapper usersMapper;
    @Override
    public Users getAdminByUsername(String username) {
        UsersExample usersExample = new UsersExample();
        usersExample.createCriteria().andUserNameEqualTo(username);
        List<Users> list = usersMapper.selectByExample(usersExample);
        if (list !=null && list.size() > 0){
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<UmsPermission> getPermissinList(Integer userId) {
        return userRoleReltation.getPermissionList(userId);
    }

    @Override
    public String login(String username, String password) {
        String token = null;
        try {
            UserDetails userDetails =userDetailsService.loadUserByUsername(username);
            if(!passwordEncoder.matches(password,userDetails.getPassword())){
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
            token = jwtTokenUtil.generateToken(userDetails);

        }catch (AuthenticationException e){

        }
        return token;
    }

    @Override
    public Users register(Users users) {
        return null;
    }

}
