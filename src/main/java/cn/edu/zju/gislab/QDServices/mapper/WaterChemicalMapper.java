package cn.edu.zju.gislab.QDServices.mapper;

import cn.edu.zju.gislab.QDServices.po.WaterChemical;
import cn.edu.zju.gislab.QDServices.po.WaterChemicalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaterChemicalMapper {
    int countByExample(WaterChemicalExample example);

    int deleteByExample(WaterChemicalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WaterChemical record);

    int insertSelective(WaterChemical record);

    List<WaterChemical> selectByExample(WaterChemicalExample example);

    WaterChemical selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WaterChemical record, @Param("example") WaterChemicalExample example);

    int updateByExample(@Param("record") WaterChemical record, @Param("example") WaterChemicalExample example);

    int updateByPrimaryKeySelective(WaterChemical record);

    int updateByPrimaryKey(WaterChemical record);
}