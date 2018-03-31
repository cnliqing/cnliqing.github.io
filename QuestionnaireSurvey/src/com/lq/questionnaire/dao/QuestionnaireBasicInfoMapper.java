package com.lq.questionnaire.dao;

import com.lq.questionnaire.pojo.QuestionnaireBasicInfo;
import com.lq.questionnaire.pojo.QuestionnaireBasicInfoKey;

public interface QuestionnaireBasicInfoMapper {
    int deleteByPrimaryKey(QuestionnaireBasicInfoKey key);

    int insert(QuestionnaireBasicInfo record);

    int insertSelective(QuestionnaireBasicInfo record);

    QuestionnaireBasicInfo selectByPrimaryKey(QuestionnaireBasicInfoKey key);

    int updateByPrimaryKeySelective(QuestionnaireBasicInfo record);

    int updateByPrimaryKey(QuestionnaireBasicInfo record);
}