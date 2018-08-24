import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class ComboBoxDemo extends Application {
    Stage window;
    ComboBox<String> comboBox;

    public static void main(String args[]) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("DropDownDemo");

        Button button = new Button("Submit");
        
        comboBox = new ComboBox<String>();
        comboBox.getItems().addAll("ob0", "ob2", "ob3", "ob4");
        comboBox.setPromptText("Does not need to be a value defined in the combo box");

        comboBox.setEditable(true); //overrides setPromptText but allows user to type their own choice

        button.setOnAction(e -> printSelected());
        comboBox.setOnAction(e -> System.out.println("You selected " + comboBox.getValue())); //comboBox has it's own event listener

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(comboBox, button);

        Scene scene = new Scene(layout, 600, 250);
        window.setScene(scene);
        window.show();
    }
    private void printSelected() {
        System.out.println("You selected " + comboBox.getValue());
    }
}