package cn.edu.zju.gislab.QDServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.edu.zju.gislab.QDServices.po.SouthoceanChla;
import cn.edu.zju.gislab.QDServices.service.SouthOcean;

import java.util.List;

@Controller // 声明controller
public class SouthOceanController {

    @Autowired // 注入类
    private SouthOcean southOcean;

    //查询所有数据
    @RequestMapping("/readData")
    public @ResponseBody List<SouthoceanChla> rea() {
        List<SouthoceanChla> result = southOcean.read();
        return result;
    }
}
