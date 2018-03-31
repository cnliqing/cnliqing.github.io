package com.lq.questionnaire.pojo;

import java.util.Date;

public class AnswerKey {
    private String questionnaireId;

    private String userId;

    private Date answerDate;

    private Integer questionCnt;

    public String getQuestionnaireId() {
        return questionnaireId;
    }

    public void setQuestionnaireId(String questionnaireId) {
        this.questionnaireId = questionnaireId == null ? null : questionnaireId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getAnswerDate() {
        return answerDate;
    }

    public void setAnswerDate(Date answerDate) {
        this.answerDate = answerDate;
    }

    public Integer getQuestionCnt() {
        return questionCnt;
    }

    public void setQuestionCnt(Integer questionCnt) {
        this.questionCnt = questionCnt;
    }
}