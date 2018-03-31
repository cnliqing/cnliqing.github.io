package com.lq.questionnaire.pojo;

public class QuestionnaireTemplateInfoWithBLOBs extends QuestionnaireTemplateInfo {
    private String questionTemplateContent;

    private String questionTemplateAnswer;

    public String getQuestionTemplateContent() {
        return questionTemplateContent;
    }

    public void setQuestionTemplateContent(String questionTemplateContent) {
        this.questionTemplateContent = questionTemplateContent == null ? null : questionTemplateContent.trim();
    }

    public String getQuestionTemplateAnswer() {
        return questionTemplateAnswer;
    }

    public void setQuestionTemplateAnswer(String questionTemplateAnswer) {
        this.questionTemplateAnswer = questionTemplateAnswer == null ? null : questionTemplateAnswer.trim();
    }
}