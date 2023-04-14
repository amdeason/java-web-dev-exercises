package org.launchcode.java.studios.quizApp;

public abstract class Question {
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    private String questionText;
    public abstract void getQuestionText();
    public abstract void getAnswerText();

}
