package Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        try {
            Parent pane = FXMLLoader.load(getClass().getResource("/View/FXML.fxml"));
            Scene scene = new Scene(pane);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace(); // Print the exception to identify any issues
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
