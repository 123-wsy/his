package org.neuedu.his.mapper;

import org.neuedu.his.model.Constantitem;

public interface ConstantitemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Constantitem record);

    int insertSelective(Constantitem record);

    Constantitem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Constantitem record);

    int updateByPrimaryKey(Constantitem record);
}