package com.zy.pms.service.Imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zy.pms.mbg.mapper.PmsYldataMapper;
import com.zy.pms.model.PmsYldata;
import com.zy.pms.model.PmsYldataExample;
import com.zy.pms.service.PmsYlDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zy
 * @date 2019/6/4 12:46
 */
@Service
public class PmsYlDataServiceImpl implements PmsYlDataService {
    @Autowired
    private PmsYldataMapper pmsYldataMapper;

    @Override
    public List<PmsYldata> listAllYlData() {
        return pmsYldataMapper.selectByExample(new PmsYldataExample());
    }

    @Override
    public List<PmsYldata> listYlData(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<PmsYldata> pmsYldata = pmsYldataMapper.selectByExample(new PmsYldataExample());
        PageInfo<PmsYldata> pageInfo= new PageInfo<>(pmsYldata);
        List<PmsYldata> pmsYldataList =pageInfo.getList();
        System.out.print(pmsYldataList);
        return pmsYldataList;
//        pmsYldataMapper.selectByExample(new PmsYldataExample());
//        return pmsYldataMapper.selectByExample(new PmsYldataExample());
    }
}
