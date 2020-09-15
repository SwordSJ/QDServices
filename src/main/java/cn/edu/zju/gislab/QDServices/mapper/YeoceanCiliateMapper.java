package cn.edu.zju.gislab.QDServices.mapper;

import cn.edu.zju.gislab.QDServices.po.YeoceanCiliate;
import cn.edu.zju.gislab.QDServices.po.YeoceanCiliateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YeoceanCiliateMapper {
    int countByExample(YeoceanCiliateExample example);

    int deleteByExample(YeoceanCiliateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YeoceanCiliate record);

    int insertSelective(YeoceanCiliate record);

    List<YeoceanCiliate> selectByExample(YeoceanCiliateExample example);

    YeoceanCiliate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YeoceanCiliate record, @Param("example") YeoceanCiliateExample example);

    int updateByExample(@Param("record") YeoceanCiliate record, @Param("example") YeoceanCiliateExample example);

    int updateByPrimaryKeySelective(YeoceanCiliate record);

    int updateByPrimaryKey(YeoceanCiliate record);
}