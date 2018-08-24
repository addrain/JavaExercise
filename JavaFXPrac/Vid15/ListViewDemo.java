import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.collections.*;

public class ListViewDemo extends Application {

    Stage window;
    Button button;
    Scene scene;
    ListView<String> listView;

    public static void main(String args[]){
        launch(args);
    }

    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("ListView Title");
        button = new Button("Submit");
        listView = new ListView<String>();
        listView.getItems().addAll("Op0", "Op1", "Op2", "Op3");

        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); //allows for multiple selection

        button.setOnAction(e -> buttonClicked());

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(listView, button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private void buttonClicked() {
        String message = "";
        ObservableList<String> selections;
        selections = listView.getSelectionModel().getSelectedItems();

        for(String s : selections) message += s + "\n";
        System.out.print(message);
    }
}