import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class CheckBoxDemo extends Application {
    
    Stage window;

    public static void main(String args[]) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Checkboxes");

        CheckBox box1 = new CheckBox("Option1");
        CheckBox box2 = new CheckBox("Option2");
        box2.setSelected(true); //Default selected

        Button button = new Button("Submit");
        button.setOnAction(e -> handleOptions(box1, box2));


        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20 , 20, 20));
        layout.getChildren().addAll(box1, box2, button);

        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private void handleOptions(CheckBox box1, CheckBox box2) {
        String message = "User Selected: \n";

        if(box1.isSelected()) message += "Option1 ";
        if(box2.isSelected()) message += "Option2 ";

        System.out.println(message);
    }
}