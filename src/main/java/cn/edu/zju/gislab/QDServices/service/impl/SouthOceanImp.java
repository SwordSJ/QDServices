package cn.edu.zju.gislab.QDServices.service.impl;

import cn.edu.zju.gislab.QDServices.po.SouthoceanChla;
import cn.edu.zju.gislab.QDServices.po.SouthoceanChlaExample;
import org.springframework.beans.factory.annotation.Autowired;
import cn.edu.zju.gislab.QDServices.mapper.SouthoceanChlaMapper;
import cn.edu.zju.gislab.QDServices.service.SouthOcean;

import java.util.List;

public class SouthOceanImp implements SouthOcean {

    @Autowired
    private SouthoceanChlaMapper southoceanChlaMapper;

    //读取数据
    @Override
    public List<SouthoceanChla> read() {
        List<SouthoceanChla> result;
        int a;
        try {
            SouthoceanChlaExample southoceanChlaExample = new SouthoceanChlaExample();
            List<SouthoceanChla> listData = southoceanChlaMapper.selectByExample(southoceanChlaExample);
            if (listData != null && listData.size() > 0) {
                result = listData;
            } else {
                return null;
            }
        }
        catch(Error e) {
            return null;
        }
        return result;
    }
}
