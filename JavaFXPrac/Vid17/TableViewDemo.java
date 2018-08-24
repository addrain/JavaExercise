import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.geometry.*;
import javafx.collections.*;

public class TableViewDemo extends Application {

    Stage window;
    TableView<Item> table;

    public static void main(String args[]) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("TableViewDemo");

        TableColumn<Item, String> nameColumn = new TableColumn<>("Name"); //sets first column to be named "Name" with storage of strings from Items obj
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name")); //will print what is stored inside the name variable.  arg in PropertyValueFactory needs to be exact var name in Item class

        TableColumn<Item, Double> valueColumn = new TableColumn<>("Value"); 
        valueColumn.setMinWidth(100);
        valueColumn.setCellValueFactory(new PropertyValueFactory<>("value")); 

        TableColumn<Item, Integer> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setMinWidth(100);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity")); 

        table = new TableView<>();
        table.setItems(getItems());
        table.getColumns().addAll(nameColumn, valueColumn, quantityColumn);

        VBox layout = new VBox();
        layout.getChildren().add(table);
        Scene scene = new Scene(layout, 500, 250);
        window.setScene(scene);
        window.show();
    }

    public ObservableList<Item> getItems() {
        ObservableList<Item> items = FXCollections.observableArrayList();
        items.add(new Item("Laptop", 859.00, 20));
        items.add(new Item("Rubber Ball", 1.00, 50));
        items.add(new Item("Plunger", 20.00, 5));
        items.add(new Item("Games", 59.99, 100));
        return items;
    }

}