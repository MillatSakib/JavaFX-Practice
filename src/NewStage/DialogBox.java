/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewStage;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Sakib
 */
public class DialogBox extends Stage {
    DialogBox(){
    VBox vbox = new VBox();
    vbox.setMinHeight(300);
    vbox.setMinWidth(300);
    
    Label lbl = new Label("This is second stage");
    
    vbox.getChildren().add(lbl);
    
    Scene scene = new Scene(vbox);
    
    
    Stage stage = new Stage();
    
    stage.setScene(scene);
    stage.show();
    }
}
