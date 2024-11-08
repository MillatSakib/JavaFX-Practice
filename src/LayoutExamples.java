import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

public class LayoutExamples {

    public static void showVBoxExample(Window owner) {
        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);
        vbox.setStyle("-fx-background-color: #AED6F1; -fx-padding: 20;");

        Label label = new Label("VBox Example");
        label.setFont(new Font(20));
        
        vbox.getChildren().add(label);
        
        Stage stage = new Stage();
        stage.setTitle("VBox Example");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(owner);
        stage.setScene(new Scene(vbox, 300, 200));
        stage.showAndWait();
    }

    public static void showHBoxExample(Window owner) {
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.setStyle("-fx-background-color: #FAD7A0; -fx-padding: 20;");

        Label label = new Label("HBox Example");
        label.setFont(new Font(20));

        hbox.getChildren().add(label);

        Stage stage = new Stage();
        stage.setTitle("HBox Example");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(owner);
        stage.setScene(new Scene(hbox, 300, 200));
        stage.showAndWait();
    }

    public static void showStackPaneExample(Window owner) {
        StackPane stackPane = new StackPane();
        stackPane.setStyle("-fx-background-color: #D2B4DE; -fx-padding: 20;");
        
        Label label = new Label("StackPane Example");
        label.setFont(new Font(20));
        
        stackPane.getChildren().add(label);

        Stage stage = new Stage();
        stage.setTitle("StackPane Example");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(owner);
        stage.setScene(new Scene(stackPane, 300, 200));
        stage.showAndWait();
    }

    public static void showAnchorPaneExample(Window owner) {
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setStyle("-fx-background-color: #ABEBC6; -fx-padding: 20;");
        
        Label label = new Label("AnchorPane Example");
        label.setFont(new Font(20));
        
        AnchorPane.setTopAnchor(label, 80.0);
        AnchorPane.setLeftAnchor(label, 100.0);
        anchorPane.getChildren().add(label);

        Stage stage = new Stage();
        stage.setTitle("AnchorPane Example");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(owner);
        stage.setScene(new Scene(anchorPane, 300, 200));
        stage.showAndWait();
    }

    public static void showBorderPaneExample(Window owner) {
        BorderPane borderPane = new BorderPane();
        borderPane.setStyle("-fx-background-color: #F5B7B1; -fx-padding: 20;");

        Label label = new Label("BorderPane Example");
        label.setFont(new Font(20));

        borderPane.setCenter(label);

        Stage stage = new Stage();
        stage.setTitle("BorderPane Example");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(owner);
        stage.setScene(new Scene(borderPane, 300, 200));
        stage.showAndWait();
    }
}
