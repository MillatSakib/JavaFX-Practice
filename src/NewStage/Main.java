/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewStage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Sakib
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       VBox vbox = new VBox();
       vbox.setMinHeight(300);
       vbox.setMinWidth(500);
       
       Button btn = new Button("New Stage");
       vbox.getChildren().addAll(btn);
       
       btn.setOnAction(e->{
       DialogBox box = new DialogBox();
       primaryStage.close();
       });
       
       Scene scene = new Scene(vbox);
       primaryStage.setScene(scene);
       primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
