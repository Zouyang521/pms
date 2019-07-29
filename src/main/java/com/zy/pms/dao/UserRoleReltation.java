package com.zy.pms.dao;

import com.zy.pms.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * Created by zy on 2019/7/10.
 */
public interface UserRoleReltation {
    List<UmsPermission> getPermissionList(@Param("userId")Integer UserId);
}
