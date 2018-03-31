package com.lq.questionnaire.pojo;

public class QuestionnaireInfoWithBLOBs extends QuestionnaireInfo {
    private String questionContent;

    private String questionAnswer;

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent == null ? null : questionContent.trim();
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer == null ? null : questionAnswer.trim();
    }
}