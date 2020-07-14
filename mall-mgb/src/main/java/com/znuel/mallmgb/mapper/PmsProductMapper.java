package com.znuel.mallmgb.mapper;

import com.znuel.mallmgb.model.PmsProduct;
import com.znuel.mallmgb.model.PmsProductWithBLOBs;

public interface PmsProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductWithBLOBs record);

    int insertSelective(PmsProductWithBLOBs record);

    PmsProductWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PmsProductWithBLOBs record);

    int updateByPrimaryKey(PmsProduct record);
}