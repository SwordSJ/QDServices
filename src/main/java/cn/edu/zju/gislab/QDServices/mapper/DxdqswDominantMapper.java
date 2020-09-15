package cn.edu.zju.gislab.QDServices.mapper;

import cn.edu.zju.gislab.QDServices.po.DxdqswDominant;
import cn.edu.zju.gislab.QDServices.po.DxdqswDominantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DxdqswDominantMapper {
    int countByExample(DxdqswDominantExample example);

    int deleteByExample(DxdqswDominantExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DxdqswDominant record);

    int insertSelective(DxdqswDominant record);

    List<DxdqswDominant> selectByExample(DxdqswDominantExample example);

    DxdqswDominant selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DxdqswDominant record, @Param("example") DxdqswDominantExample example);

    int updateByExample(@Param("record") DxdqswDominant record, @Param("example") DxdqswDominantExample example);

    int updateByPrimaryKeySelective(DxdqswDominant record);

    int updateByPrimaryKey(DxdqswDominant record);
}