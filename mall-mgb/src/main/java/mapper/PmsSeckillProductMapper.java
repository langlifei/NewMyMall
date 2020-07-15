package mapper;

import model.PmsSeckillProduct;

public interface PmsSeckillProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsSeckillProduct record);

    int insertSelective(PmsSeckillProduct record);

    PmsSeckillProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsSeckillProduct record);

    int updateByPrimaryKey(PmsSeckillProduct record);
}