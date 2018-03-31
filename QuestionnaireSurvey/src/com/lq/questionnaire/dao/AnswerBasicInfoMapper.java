package com.lq.questionnaire.dao;

import com.lq.questionnaire.pojo.AnswerBasicInfo;
import com.lq.questionnaire.pojo.AnswerBasicInfoKey;

public interface AnswerBasicInfoMapper {
    int deleteByPrimaryKey(AnswerBasicInfoKey key);

    int insert(AnswerBasicInfo record);

    int insertSelective(AnswerBasicInfo record);

    AnswerBasicInfo selectByPrimaryKey(AnswerBasicInfoKey key);

    int updateByPrimaryKeySelective(AnswerBasicInfo record);

    int updateByPrimaryKey(AnswerBasicInfo record);
}