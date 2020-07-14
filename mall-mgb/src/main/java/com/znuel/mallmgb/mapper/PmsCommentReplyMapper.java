package com.znuel.mallmgb.mapper;

import com.znuel.mallmgb.model.PmsCommentReply;

public interface PmsCommentReplyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsCommentReply record);

    int insertSelective(PmsCommentReply record);

    PmsCommentReply selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsCommentReply record);

    int updateByPrimaryKey(PmsCommentReply record);
}