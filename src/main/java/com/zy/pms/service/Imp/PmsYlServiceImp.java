package com.zy.pms.service.Imp;

import com.zy.pms.mbg.mapper.PmsYlMapper;
import com.zy.pms.model.PmsYl;
import com.zy.pms.model.PmsYlExample;
import com.zy.pms.service.PmsYlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author zy
 * @date 2019/5/17 15:15
 */
@Service
public class PmsYlServiceImp implements PmsYlService {
    @Autowired
    private PmsYlMapper pmsYlMapper;
    @Override
    public List<PmsYl> listAllYl() {
        return pmsYlMapper.selectByExample(new PmsYlExample());
    }

    @Override
    public int createYl(PmsYl pmsYl) {
        return 0;
    }

    @Override
    public int updateYl(int id, PmsYl pmsYl) {
        return 0;
    }

    @Override
    public int deleteYl(int id) {
        return 0;
    }

    @Override
    public List<PmsYl> listsub(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public PmsYl getYlParameterById(int id) {
        return null;
    }
}
