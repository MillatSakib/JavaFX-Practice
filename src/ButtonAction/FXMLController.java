package ButtonAction;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {

    @FXML
    private Label label;

    @FXML
    public void buttonOnAction(ActionEvent event) {
        System.out.println("Hello world");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize any required data here
    }
}
