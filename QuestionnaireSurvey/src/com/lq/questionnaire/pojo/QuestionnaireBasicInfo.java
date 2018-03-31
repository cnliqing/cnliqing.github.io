package com.lq.questionnaire.pojo;

public class QuestionnaireBasicInfo extends QuestionnaireBasicInfoKey {
    private String questionnaireId;

    private String userId;

    private Integer questionnaireTypeId;

    private String limit1;

    private String limit2;

    private String limit3;

    private String questionnaireStatus;

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

    public Integer getQuestionnaireTypeId() {
        return questionnaireTypeId;
    }

    public void setQuestionnaireTypeId(Integer questionnaireTypeId) {
        this.questionnaireTypeId = questionnaireTypeId;
    }

    public String getLimit1() {
        return limit1;
    }

    public void setLimit1(String limit1) {
        this.limit1 = limit1 == null ? null : limit1.trim();
    }

    public String getLimit2() {
        return limit2;
    }

    public void setLimit2(String limit2) {
        this.limit2 = limit2 == null ? null : limit2.trim();
    }

    public String getLimit3() {
        return limit3;
    }

    public void setLimit3(String limit3) {
        this.limit3 = limit3 == null ? null : limit3.trim();
    }

    public String getQuestionnaireStatus() {
        return questionnaireStatus;
    }

    public void setQuestionnaireStatus(String questionnaireStatus) {
        this.questionnaireStatus = questionnaireStatus == null ? null : questionnaireStatus.trim();
    }
}