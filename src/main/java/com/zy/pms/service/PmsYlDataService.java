package com.zy.pms.service;

import com.zy.pms.model.PmsYldata;

import java.util.List;

/**
 * @author zy
 * @date 2019/6/4 12:35
 */
public interface PmsYlDataService {
    /**
     * @return 返回所有的压力表实时数据
     */
    List<PmsYldata> listAllYlData();

    List<PmsYldata> listYlData(int pageNum,int pageSize);

}
