//package org.ilintar.study.question;
//
//
//import javafx.scene.control.CheckBox;
//import javafx.scene.control.Label;
//import javafx.scene.layout.VBox;
//
//import java.util.List;
//
//import javafx.scene.control.Button;
//
//public class CheckboxQuestionFactory implements QuestionFactory {
//
//    @Override
//    public Question createQuestion(List<String> lines) {
//        VBox question = new VBox();
//        String questionText = lines.get(0);
//        question.getChildren().add(new Label(questionText));
//        for (int i = 1; i < lines.size(); i += 2) {
//            String answer = lines.get(i);
//            String answerCode = lines.get(i + 1);
//            CheckBox checkBox = new CheckBox(answer);
//            checkBox.setUserData(answerCode);
//            question.getChildren().add(checkBox);
//        }
//
//        Button nextButton = createNextButton();
//    }
//
//    private Button createNextButton() {
//        return new Button("Next");
//    }
//
//}
