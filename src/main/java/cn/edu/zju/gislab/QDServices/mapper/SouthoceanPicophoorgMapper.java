package cn.edu.zju.gislab.QDServices.mapper;

import cn.edu.zju.gislab.QDServices.po.SouthoceanPicophoorg;
import cn.edu.zju.gislab.QDServices.po.SouthoceanPicophoorgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SouthoceanPicophoorgMapper {
    int countByExample(SouthoceanPicophoorgExample example);

    int deleteByExample(SouthoceanPicophoorgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SouthoceanPicophoorg record);

    int insertSelective(SouthoceanPicophoorg record);

    List<SouthoceanPicophoorg> selectByExample(SouthoceanPicophoorgExample example);

    SouthoceanPicophoorg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SouthoceanPicophoorg record, @Param("example") SouthoceanPicophoorgExample example);

    int updateByExample(@Param("record") SouthoceanPicophoorg record, @Param("example") SouthoceanPicophoorgExample example);

    int updateByPrimaryKeySelective(SouthoceanPicophoorg record);

    int updateByPrimaryKey(SouthoceanPicophoorg record);
}