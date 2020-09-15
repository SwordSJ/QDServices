package cn.edu.zju.gislab.QDServices.mapper;

import cn.edu.zju.gislab.QDServices.po.DxdqswGroup;
import cn.edu.zju.gislab.QDServices.po.DxdqswGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DxdqswGroupMapper {
    int countByExample(DxdqswGroupExample example);

    int deleteByExample(DxdqswGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DxdqswGroup record);

    int insertSelective(DxdqswGroup record);

    List<DxdqswGroup> selectByExample(DxdqswGroupExample example);

    DxdqswGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DxdqswGroup record, @Param("example") DxdqswGroupExample example);

    int updateByExample(@Param("record") DxdqswGroup record, @Param("example") DxdqswGroupExample example);

    int updateByPrimaryKeySelective(DxdqswGroup record);

    int updateByPrimaryKey(DxdqswGroup record);
}