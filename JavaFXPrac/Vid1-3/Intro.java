import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Intro extends Application{

    Button button;

    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Primary Stage title");
        StackPane layout = new StackPane();
        button = new Button();
        button.setText("Button Text");
        button.setOnAction(e -> System.out.println("Button pressed"));

        layout.getChildren().add(button);
        Scene myScene = new Scene(layout, 300, 200);
        primaryStage.setScene(myScene);
        primaryStage.show();
    }

}