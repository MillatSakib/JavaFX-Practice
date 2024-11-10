/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Sakib
 */
public class ListViewController implements Initializable {
    String selectedItem;
    @FXML
    private Label label;
    @FXML
    private TextField textField;
    @FXML
    private ListView<String> lisstView;
    
    ObservableList<String> list = FXCollections.observableArrayList();
    
    @FXML
    private void addButtonAction(ActionEvent event){
    String str = textField.getText();
    if(str.equals(""))return;
    list.add(str);
    textField.clear();
    }
    ObservableList<String> selectedItems = FXCollections.observableArrayList();
    @FXML
    private void listViewMouseClickedAction(MouseEvent event){
        selectedItem = lisstView.getSelectionModel().getSelectedItem();
    
    selectedItems = lisstView.getSelectionModel().getSelectedItems();
    String str = "";
    for(String item:selectedItems){
    str+= item+"\n";
    }
    label.setText(str);
    }
    @FXML
    private void handleDelete(ActionEvent Event){
        list.removeAll(selectedItems);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lisstView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        list.add("Apple");
        list.add("Orange");
        list.add("Lichi");
        list.add("Jack-fruit");
        
        lisstView.setItems(list);
    }    
    
}
