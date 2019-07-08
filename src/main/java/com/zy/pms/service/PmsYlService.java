package com.zy.pms.service;

import com.zy.pms.model.PmsYl;

import java.util.List;

/**
 * @author zy
 * @date 2019/5/17 15:07
 */
public interface PmsYlService {

    /**
     * @return 返回所有的压力表参数
     */
    List<PmsYl> listAllYl();

    /**
     * 添加一个压力表参数
     * @param pmsYl
     * @return
     */
    int createYl(PmsYl pmsYl);

    /**
     * 更改该id 的压力表参数
     * @param id
     * @param pmsYl
     * @return
     */
    int updateYl(int id,PmsYl pmsYl);

    /**
     * 删除一个压力表参数
     * @param id
     * @return
     */
    int deleteYl(int id);

    /**
     * 分页显示压力表参数
      * @param pageNum
     * @param pageSize
     * @return
     */
    List<PmsYl> listsub(int pageNum,int pageSize);

    /**
     * 由id 查询出一个压力表参数
     * @param id
     * @return
     */
    PmsYl getYlParameterById(int id);
}
