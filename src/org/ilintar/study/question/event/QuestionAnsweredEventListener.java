package org.ilintar.study.question.event;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public interface QuestionAnsweredEventListener {
    //zazwyczaj ma jedna metode - handleEvent
    //interfejs funkcyjny (zawiera tylko jedna metode)

    void handleEvent(QuestionAnsweredEvent event);

}
