import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.geometry.*;

public class MultWind {
    static boolean answer;
    public static boolean display(String title, String message) {
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL); //Like an alert box, doesn't allow background window to be clicked until current window is somehow closed
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label();
        label.setText(message);
        Button trueButton = new Button("True");
        Button falseButton = new Button("False");
        trueButton.setOnAction(e -> {
            answer = true;
            window.close();
        });
        falseButton.setOnAction(e -> {
            answer = false;
            window.close();
        });
        

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, trueButton, falseButton);
        layout.setAlignment(Pos.CENTER); //from javafx.geometry and centers nodes

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait(); //in conjunction with modality, can't do anything else until window closed.

        return answer;
    }
}