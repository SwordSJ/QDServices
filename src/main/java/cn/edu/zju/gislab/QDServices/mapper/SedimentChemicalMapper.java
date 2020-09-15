package cn.edu.zju.gislab.QDServices.mapper;

import cn.edu.zju.gislab.QDServices.po.SedimentChemical;
import cn.edu.zju.gislab.QDServices.po.SedimentChemicalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SedimentChemicalMapper {
    int countByExample(SedimentChemicalExample example);

    int deleteByExample(SedimentChemicalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SedimentChemical record);

    int insertSelective(SedimentChemical record);

    List<SedimentChemical> selectByExample(SedimentChemicalExample example);

    SedimentChemical selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SedimentChemical record, @Param("example") SedimentChemicalExample example);

    int updateByExample(@Param("record") SedimentChemical record, @Param("example") SedimentChemicalExample example);

    int updateByPrimaryKeySelective(SedimentChemical record);

    int updateByPrimaryKey(SedimentChemical record);
}