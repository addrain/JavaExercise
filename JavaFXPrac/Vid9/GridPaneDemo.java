import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class GridPaneDemo extends Application {

    Stage window;

    public static void main(String args[]) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Title of Stage");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10)); //adds padding from layout and stage, but not grid cells themselves.  Insets is object that can be passed four values for padding;
        grid.setVgap(8); //sets vertical padding to cells
        grid.setHgap(10); //sets horizontal padding to cells

        //Name label
        Label nameLabel = new Label("Username");
        GridPane.setConstraints(nameLabel, 0, 0); //places control object into a specific cell
        //Name Field
        TextField nameInput = new TextField("Default Text");
        GridPane.setConstraints(nameInput, 1, 0);

        //Password label
        Label passLabel = new Label("Password");
        GridPane.setConstraints(passLabel, 0, 1); //places control object into a specific cell
        //Password Field
        TextField passInput = new TextField();
        GridPane.setConstraints(passInput, 1, 1);
        passInput.setPromptText("Prompt Text");

        //Login Button
        Button loginButton = new Button("Login");
        GridPane.setConstraints(loginButton, 1, 2);

        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);

        Scene scene = new Scene(grid, 300, 200);
        window.setScene(scene);
        window.show();
    }
}