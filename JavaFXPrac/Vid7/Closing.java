import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class Closing extends Application {
    static Stage window;
    public static void main(String args[]){
        launch(args);
    }
    public void start(Stage primeStage) {
        window = primeStage;
        window.setTitle("Close this window");
        window.setOnCloseRequest(e -> {
            e.consume();    //tells system that program will take care of event so program doesn't auto close.
            closeWindow();
        }); //when user clicks the 'x' on top left, run code inside parenthesis
        Button button = new Button("Close Window");
        button.setOnAction(e -> closeWindow());

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene myScene = new Scene(layout, 300, 300);
        window.setScene(myScene);
        window.show();
    }

    private void closeWindow() {
        Boolean answer = MultWind.display("Confirmation", "Do you want to exit?");
        if(answer == true) window.close();
    }

}