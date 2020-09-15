package cn.edu.zju.gislab.QDServices.mapper;

import cn.edu.zju.gislab.QDServices.po.SouthoceanChla;
import cn.edu.zju.gislab.QDServices.po.SouthoceanChlaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SouthoceanChlaMapper {
    int countByExample(SouthoceanChlaExample example);

    int deleteByExample(SouthoceanChlaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SouthoceanChla record);

    int insertSelective(SouthoceanChla record);

    List<SouthoceanChla> selectByExample(SouthoceanChlaExample example);

    SouthoceanChla selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SouthoceanChla record, @Param("example") SouthoceanChlaExample example);

    int updateByExample(@Param("record") SouthoceanChla record, @Param("example") SouthoceanChlaExample example);

    int updateByPrimaryKeySelective(SouthoceanChla record);

    int updateByPrimaryKey(SouthoceanChla record);
}