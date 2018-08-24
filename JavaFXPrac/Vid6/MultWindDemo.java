import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class MultWindDemo extends Application {
    public static void main(String args[]) {
        launch(args);
    }

    public void start(Stage window) {
        window.setTitle("Start window");

        Button button = new Button("Open other window (Alert Box)");
        button.setOnAction(e -> {
            System.out.println(MultWind.display("Title of Alert Box", "Alert box"));
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 300);
        window.setScene(scene);
        window.show();
    }
}