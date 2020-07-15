package mapper;

import model.OmsSeckillOrder;

public interface OmsSeckillOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsSeckillOrder record);

    int insertSelective(OmsSeckillOrder record);

    OmsSeckillOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsSeckillOrder record);

    int updateByPrimaryKey(OmsSeckillOrder record);
}