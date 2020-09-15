package cn.edu.zju.gislab.QDServices.mapper;

import cn.edu.zju.gislab.QDServices.po.SouthoceanZooplankton;
import cn.edu.zju.gislab.QDServices.po.SouthoceanZooplanktonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SouthoceanZooplanktonMapper {
    int countByExample(SouthoceanZooplanktonExample example);

    int deleteByExample(SouthoceanZooplanktonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SouthoceanZooplankton record);

    int insertSelective(SouthoceanZooplankton record);

    List<SouthoceanZooplankton> selectByExample(SouthoceanZooplanktonExample example);

    SouthoceanZooplankton selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SouthoceanZooplankton record, @Param("example") SouthoceanZooplanktonExample example);

    int updateByExample(@Param("record") SouthoceanZooplankton record, @Param("example") SouthoceanZooplanktonExample example);

    int updateByPrimaryKeySelective(SouthoceanZooplankton record);

    int updateByPrimaryKey(SouthoceanZooplankton record);
}