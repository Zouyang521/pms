package com.zy.pms.controller;

import com.zy.pms.dto.CommonPage;
import com.zy.pms.dto.CommonResult;
import com.zy.pms.model.PmsYl;
import com.zy.pms.model.PmsYldata;
import com.zy.pms.service.PmsYlDataService;
import com.zy.pms.service.PmsYlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zy
 * @date 2019/5/17 15:18
 */
@Controller
@RequestMapping("/yl")
public class PmsYlController {
    @Autowired
    private PmsYlService pmsYlService;
    @Autowired
    private PmsYlDataService pmsYlDataService;

    @RequestMapping(value = "listAll",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult <List<PmsYl>> getYlParameters(){
        return CommonResult.success(pmsYlService.listAllYl());
    }
//    @RequestMapping(value = "listAll",method = RequestMethod.GET)
//    @ResponseBody
//    public List<PmsYl> getYlParameters(){
//        return pmsYlService.listAllYl();
//    }

    @RequestMapping(value = "listdata",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<PmsYldata>> listYlData(@RequestParam(value ="pageNum",defaultValue = "1")Integer pageNum,
                                                          @RequestParam(value = "pageSize",defaultValue = "3")Integer pageSize){
        System.out.print("pageNum:"+pageNum+"\n");
        System.out.print("pageSize:"+pageSize);
        List<PmsYldata> yldataList = pmsYlDataService.listYlData(pageNum,pageSize);

        return CommonResult.success(CommonPage.restPage(yldataList));
    }
//    @RequestMapping(value = "listdata",method = RequestMethod.GET)
//    @ResponseBody
//    public List<PmsYldata> listYlData(@RequestParam(value ="pageNum",defaultValue = "1")Integer pageNum,
//                                                          @RequestParam(value = "pageSize",defaultValue = "10")Integer pageSize){
//        List<PmsYldata> yldataList = pmsYlDataService.listYlData(pageNum,pageSize);
//        return yldataList;
//    }

    /**
     *返回所有的压力表数据
     * @return
     */
    @RequestMapping(value = "datalistAll",method = RequestMethod.GET)
    @ResponseBody
    public List<PmsYldata> getYlData(){
        return pmsYlDataService.listAllYlData();
    }


}
