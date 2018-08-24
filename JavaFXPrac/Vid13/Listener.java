import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class Listener extends Application {
    Stage window;

    public static void main(String args[]) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("DropDownDemo");

        ChoiceBox<String> choiceBox = new ChoiceBox<String>(); //ChoiceBox obj is a DROPDOWN
        
        //getItems returns the ObservableList object which you can add items to
        choiceBox.getItems().add("Op0");
        choiceBox.getItems().addAll("Op1", "Op2", "Op3"); //add(arg) addAll(arg1, arg2, ..., argn);
        choiceBox.setValue("Op3"); //sets initial Value (needs to exist in list)

        choiceBox.getSelectionModel().selectedItemProperty().addListener( (v, oldValue, newValue) -> System.out.println(newValue) );  //holy shit.  This allows realtime selection from dropdown

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().add(choiceBox);

        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }
}