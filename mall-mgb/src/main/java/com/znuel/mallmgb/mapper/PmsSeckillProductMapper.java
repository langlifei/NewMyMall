package com.znuel.mallmgb.mapper;

import com.znuel.mallmgb.model.PmsSeckillProduct;

public interface PmsSeckillProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsSeckillProduct record);

    int insertSelective(PmsSeckillProduct record);

    PmsSeckillProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsSeckillProduct record);

    int updateByPrimaryKey(PmsSeckillProduct record);
}