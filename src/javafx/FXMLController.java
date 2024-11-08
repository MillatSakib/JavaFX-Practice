/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Sakib
 */
public class FXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Label label;
    @FXML
    private void handleButtonAction(ActionEvent event){
        System.out.println("You click me!");
        label.setText("Hellow worl");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
