package cn.edu.zju.gislab.QDServices.mapper;

import cn.edu.zju.gislab.QDServices.po.YeoceanPicoplankton;
import cn.edu.zju.gislab.QDServices.po.YeoceanPicoplanktonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YeoceanPicoplanktonMapper {
    int countByExample(YeoceanPicoplanktonExample example);

    int deleteByExample(YeoceanPicoplanktonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YeoceanPicoplankton record);

    int insertSelective(YeoceanPicoplankton record);

    List<YeoceanPicoplankton> selectByExample(YeoceanPicoplanktonExample example);

    YeoceanPicoplankton selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YeoceanPicoplankton record, @Param("example") YeoceanPicoplanktonExample example);

    int updateByExample(@Param("record") YeoceanPicoplankton record, @Param("example") YeoceanPicoplanktonExample example);

    int updateByPrimaryKeySelective(YeoceanPicoplankton record);

    int updateByPrimaryKey(YeoceanPicoplankton record);
}