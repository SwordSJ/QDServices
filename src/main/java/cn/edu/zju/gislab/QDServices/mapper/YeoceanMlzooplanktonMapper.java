package cn.edu.zju.gislab.QDServices.mapper;

import cn.edu.zju.gislab.QDServices.po.YeoceanMlzooplankton;
import cn.edu.zju.gislab.QDServices.po.YeoceanMlzooplanktonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YeoceanMlzooplanktonMapper {
    int countByExample(YeoceanMlzooplanktonExample example);

    int deleteByExample(YeoceanMlzooplanktonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YeoceanMlzooplankton record);

    int insertSelective(YeoceanMlzooplankton record);

    List<YeoceanMlzooplankton> selectByExample(YeoceanMlzooplanktonExample example);

    YeoceanMlzooplankton selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YeoceanMlzooplankton record, @Param("example") YeoceanMlzooplanktonExample example);

    int updateByExample(@Param("record") YeoceanMlzooplankton record, @Param("example") YeoceanMlzooplanktonExample example);

    int updateByPrimaryKeySelective(YeoceanMlzooplankton record);

    int updateByPrimaryKey(YeoceanMlzooplankton record);
}