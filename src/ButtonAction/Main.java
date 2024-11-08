package ButtonAction;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        try {
            Parent pane = FXMLLoader.load(getClass().getResource("FXML.fxml"));
            Scene scene = new Scene(pane);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace(); // This will show details of any loading errors
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
