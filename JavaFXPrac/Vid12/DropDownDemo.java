import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class DropDownDemo extends Application {
    Stage window;

    public static void main(String args[]) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("DropDownDemo");

        Button button = new Button("Submit");

        ChoiceBox<String> choiceBox = new ChoiceBox<String>(); //ChoiceBox obj is a DROPDOWN
        
        //getItems returns the ObservableList object which you can add items to
        choiceBox.getItems().addAll("Op1", "Op2", "Op3"); //add(arg) addAll(arg1, arg2, ..., argn);
        choiceBox.setValue("Op3"); //sets initial Value (needs to exist in list)

        button.setOnAction(e -> getChoice(choiceBox));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(choiceBox, button);

        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }
    private void getChoice(ChoiceBox<String> choiceBox) {
        String choice = choiceBox.getValue(); //stores value into choice

        System.out.println("You selected " + choice);
    }
}