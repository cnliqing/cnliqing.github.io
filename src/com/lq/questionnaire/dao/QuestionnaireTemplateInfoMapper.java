package com.lq.questionnaire.dao;

import com.lq.questionnaire.pojo.QuestionnaireTemplateInfo;
import com.lq.questionnaire.pojo.QuestionnaireTemplateInfoKey;
import com.lq.questionnaire.pojo.QuestionnaireTemplateInfoWithBLOBs;

public interface QuestionnaireTemplateInfoMapper {
    int deleteByPrimaryKey(QuestionnaireTemplateInfoKey key);

    int insert(QuestionnaireTemplateInfoWithBLOBs record);

    int insertSelective(QuestionnaireTemplateInfoWithBLOBs record);

    QuestionnaireTemplateInfoWithBLOBs selectByPrimaryKey(QuestionnaireTemplateInfoKey key);

    int updateByPrimaryKeySelective(QuestionnaireTemplateInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(QuestionnaireTemplateInfoWithBLOBs record);

    int updateByPrimaryKey(QuestionnaireTemplateInfo record);
}