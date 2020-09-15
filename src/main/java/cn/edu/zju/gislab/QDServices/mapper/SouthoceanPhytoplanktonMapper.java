package cn.edu.zju.gislab.QDServices.mapper;

import cn.edu.zju.gislab.QDServices.po.SouthoceanPhytoplankton;
import cn.edu.zju.gislab.QDServices.po.SouthoceanPhytoplanktonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SouthoceanPhytoplanktonMapper {
    int countByExample(SouthoceanPhytoplanktonExample example);

    int deleteByExample(SouthoceanPhytoplanktonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SouthoceanPhytoplankton record);

    int insertSelective(SouthoceanPhytoplankton record);

    List<SouthoceanPhytoplankton> selectByExample(SouthoceanPhytoplanktonExample example);

    SouthoceanPhytoplankton selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SouthoceanPhytoplankton record, @Param("example") SouthoceanPhytoplanktonExample example);

    int updateByExample(@Param("record") SouthoceanPhytoplankton record, @Param("example") SouthoceanPhytoplanktonExample example);

    int updateByPrimaryKeySelective(SouthoceanPhytoplankton record);

    int updateByPrimaryKey(SouthoceanPhytoplankton record);
}