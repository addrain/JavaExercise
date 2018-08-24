import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class MultScene extends Application {

    Scene scene1, scene2;

    public static void main(String args[]) {
        launch(args);
    }

    public void start(Stage window) {
        window.setTitle("Scenes");
        Label label1 = new Label("Scene 1");
        Button button1 = new Button("Go to Scene 2");
        button1.setOnAction(e -> window.setScene(scene2));

        //Layout 1 -children are leaid out on vertical column
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 200);

        Button button2 = new Button("Go to Scene 1");
        button2.setOnAction(e -> window.setScene(scene1));

        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 600, 300);

        window.setScene(scene1);
        window.show();
    }
}