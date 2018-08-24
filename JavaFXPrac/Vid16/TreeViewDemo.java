import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.collections.*;

public class TreeViewDemo extends Application {

    Stage window;
    Button button;
    TreeView<String> tree;

    public static void main(String args[]) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("TreeViewDemo");

        TreeItem<String> root, category1, category2; //making TreeItems to put onto the tree.  Tree needs a root that contains all children

        root = new TreeItem<String>();
        root.setExpanded(true); //sets it so it shows the closest immediate children automatically

        category1 = makeBranch("cat1", root);
        makeBranch("subCat1.1", category1);
        makeBranch("subCat1.2", category1);
        makeBranch("subCat1.3", category1);

        category2 = makeBranch("cat2", root);
        makeBranch("subCat2.1", category2);
        makeBranch("subCat2.2", category2);

        tree = new TreeView<String>(root);
        tree.setShowRoot(false); //Auto expands root on launch

        tree.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
            if(newValue != null) System.out.println(newValue.getValue());
        });  //a listener bc TreeView does not emit an event


        StackPane layout = new StackPane();
        layout.getChildren().add(tree);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }
    private TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }
}