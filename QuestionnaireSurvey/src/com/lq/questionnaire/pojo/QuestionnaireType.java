package com.lq.questionnaire.pojo;

public class QuestionnaireType {
    private Integer questionnaireTypeId;

    private String questionnaireTypeName;

    public Integer getQuestionnaireTypeId() {
        return questionnaireTypeId;
    }

    public void setQuestionnaireTypeId(Integer questionnaireTypeId) {
        this.questionnaireTypeId = questionnaireTypeId;
    }

    public String getQuestionnaireTypeName() {
        return questionnaireTypeName;
    }

    public void setQuestionnaireTypeName(String questionnaireTypeName) {
        this.questionnaireTypeName = questionnaireTypeName == null ? null : questionnaireTypeName.trim();
    }
}