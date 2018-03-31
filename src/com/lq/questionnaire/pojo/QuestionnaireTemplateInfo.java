package com.lq.questionnaire.pojo;

import java.util.Date;

public class QuestionnaireTemplateInfo extends QuestionnaireTemplateInfoKey {
    private Integer questionnaireTypeId;

    private Integer questionTypeId;

    private Date createTemplateDate;

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

    public Date getCreateTemplateDate() {
        return createTemplateDate;
    }

    public void setCreateTemplateDate(Date createTemplateDate) {
        this.createTemplateDate = createTemplateDate;
    }
}