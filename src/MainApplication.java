/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sakib
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox mainLayout = new VBox(10);
        mainLayout.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Button vboxButton = new Button("VBox");
        Button hboxButton = new Button("HBox");
        Button stackPaneButton = new Button("StackPane");
        Button anchorPaneButton = new Button("AnchorPane");
        Button borderPaneButton = new Button("BorderPane");

        // Set button actions to open respective layout examples
        vboxButton.setOnAction(e -> LayoutExamples.showVBoxExample(primaryStage));
        hboxButton.setOnAction(e -> LayoutExamples.showHBoxExample(primaryStage));
        stackPaneButton.setOnAction(e -> LayoutExamples.showStackPaneExample(primaryStage));
        anchorPaneButton.setOnAction(e -> LayoutExamples.showAnchorPaneExample(primaryStage));
        borderPaneButton.setOnAction(e -> LayoutExamples.showBorderPaneExample(primaryStage));

        mainLayout.getChildren().addAll(vboxButton, hboxButton, stackPaneButton, anchorPaneButton, borderPaneButton);
        Scene mainScene = new Scene(mainLayout, 850, 500);
        
        primaryStage.setTitle("JavaFX Pane Examples");
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
