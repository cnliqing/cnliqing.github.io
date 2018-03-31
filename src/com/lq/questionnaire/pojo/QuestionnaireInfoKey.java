package com.lq.questionnaire.pojo;

public class QuestionnaireInfoKey {
    private String questionnaireId;

    private Integer questionCnt;

    private String userId;

    public String getQuestionnaireId() {
        return questionnaireId;
    }

    public void setQuestionnaireId(String questionnaireId) {
        this.questionnaireId = questionnaireId == null ? null : questionnaireId.trim();
    }

    public Integer getQuestionCnt() {
        return questionCnt;
    }

    public void setQuestionCnt(Integer questionCnt) {
        this.questionCnt = questionCnt;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}