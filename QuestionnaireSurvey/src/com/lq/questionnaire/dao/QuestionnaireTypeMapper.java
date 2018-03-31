package com.lq.questionnaire.dao;

import com.lq.questionnaire.pojo.QuestionnaireType;

public interface QuestionnaireTypeMapper {
    int deleteByPrimaryKey(Integer questionnaireTypeId);

    int insert(QuestionnaireType record);

    int insertSelective(QuestionnaireType record);

    QuestionnaireType selectByPrimaryKey(Integer questionnaireTypeId);

    int updateByPrimaryKeySelective(QuestionnaireType record);

    int updateByPrimaryKey(QuestionnaireType record);
}