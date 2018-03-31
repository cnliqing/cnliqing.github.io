package com.lq.questionnaire.pojo;

public class QuestionnaireInfo extends QuestionnaireInfoKey {
    private Integer questionnaireTypeId;

    private Integer questionTypeId;

    public Integer getQuestionnaireTypeId() {
        return questionnaireTypeId;
    }

    public void setQuestionnaireTypeId(Integer questionnaireTypeId) {
        this.questionnaireTypeId = questionnaireTypeId;
    }

    public Integer getQuestionTypeId() {
        return questionTypeId;
    }

    public void setQuestionTypeId(Integer questionTypeId) {
        this.questionTypeId = questionTypeId;
    }
}