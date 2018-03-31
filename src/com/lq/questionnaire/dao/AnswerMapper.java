package com.lq.questionnaire.dao;

import com.lq.questionnaire.pojo.Answer;
import com.lq.questionnaire.pojo.AnswerKey;
import com.lq.questionnaire.pojo.AnswerWithBLOBs;

public interface AnswerMapper {
    int deleteByPrimaryKey(AnswerKey key);

    int insert(AnswerWithBLOBs record);

    int insertSelective(AnswerWithBLOBs record);

    AnswerWithBLOBs selectByPrimaryKey(AnswerKey key);

    int updateByPrimaryKeySelective(AnswerWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AnswerWithBLOBs record);

    int updateByPrimaryKey(Answer record);
}