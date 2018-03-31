package com.lq.questionnaire.pojo;

public class QuestionnaireTemplateInfoKey {
    private String questionnaireTemplateId;

    private Integer questionTemplateCnt;

    public String getQuestionnaireTemplateId() {
        return questionnaireTemplateId;
    }

    public void setQuestionnaireTemplateId(String questionnaireTemplateId) {
        this.questionnaireTemplateId = questionnaireTemplateId == null ? null : questionnaireTemplateId.trim();
    }

    public Integer getQuestionTemplateCnt() {
        return questionTemplateCnt;
    }

    public void setQuestionTemplateCnt(Integer questionTemplateCnt) {
        this.questionTemplateCnt = questionTemplateCnt;
    }
}