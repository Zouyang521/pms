package com.zy.pms.mbg.mapper;

import com.zy.pms.mbg.model.UmsRole;
import com.zy.pms.mbg.model.UmsRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated Mon Jul 08 17:29:10 CST 2019
     */
    int countByExample(UmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated Mon Jul 08 17:29:10 CST 2019
     */
    int deleteByExample(UmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated Mon Jul 08 17:29:10 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated Mon Jul 08 17:29:10 CST 2019
     */
    int insert(UmsRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated Mon Jul 08 17:29:10 CST 2019
     */
    int insertSelective(UmsRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated Mon Jul 08 17:29:10 CST 2019
     */
    List<UmsRole> selectByExample(UmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated Mon Jul 08 17:29:10 CST 2019
     */
    UmsRole selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated Mon Jul 08 17:29:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") UmsRole record, @Param("example") UmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated Mon Jul 08 17:29:10 CST 2019
     */
    int updateByExample(@Param("record") UmsRole record, @Param("example") UmsRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated Mon Jul 08 17:29:10 CST 2019
     */
    int updateByPrimaryKeySelective(UmsRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role
     *
     * @mbggenerated Mon Jul 08 17:29:10 CST 2019
     */
    int updateByPrimaryKey(UmsRole record);
}