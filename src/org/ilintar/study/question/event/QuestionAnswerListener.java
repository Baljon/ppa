package org.ilintar.study.question.event;


import org.ilintar.study.MainScreenController;
import org.ilintar.study.question.AnswerHolder;

import java.io.IOException;

public class QuestionAnswerListener implements QuestionAnsweredEventListener {

    private final AnswerHolder answerHolder;
    MainScreenController mainScreenController;

    public QuestionAnswerListener(AnswerHolder answerHolder, MainScreenController mainScreenController) {
        this.answerHolder = answerHolder;
        this.mainScreenController = mainScreenController;
    }

    @Override
    public void handleEvent(QuestionAnsweredEvent event) {
        answerHolder.putAnswer(event.getAnswer());
        System.out.println(event.getAnswer());
        try {
            mainScreenController.readNewQuestion();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
