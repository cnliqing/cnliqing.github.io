package com.lq.questionnaire.dao;

import com.lq.questionnaire.pojo.QuestionnaireInfo;
import com.lq.questionnaire.pojo.QuestionnaireInfoKey;
import com.lq.questionnaire.pojo.QuestionnaireInfoWithBLOBs;

public interface QuestionnaireInfoMapper {
    int deleteByPrimaryKey(QuestionnaireInfoKey key);

    int insert(QuestionnaireInfoWithBLOBs record);

    int insertSelective(QuestionnaireInfoWithBLOBs record);

    QuestionnaireInfoWithBLOBs selectByPrimaryKey(QuestionnaireInfoKey key);

    int updateByPrimaryKeySelective(QuestionnaireInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(QuestionnaireInfoWithBLOBs record);

    int updateByPrimaryKey(QuestionnaireInfo record);
}