package Controller;

import Model.Data;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class TableViewController implements Initializable {
    
    @FXML
    private TableView<Data> tableView;
    @FXML
    private TableColumn<Data, String> name;
    @FXML
    private TableColumn<Data, Integer> id;
    @FXML 
    private TableColumn<Data, Double> salary;
    @FXML
    private TextField nameField;
    @FXML
    private TextField idFeild;
    @FXML
    private TextField SalaryField;
    
    
    ObservableList<Data>list = FXCollections.observableArrayList(
            new Data("Abul",1, 5000),
            new Data("Babul",2, 5000),
            new Data("Kabul",3, 5000),
            new Data("Dabul",4, 5000)
    );
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        name.setCellValueFactory(new PropertyValueFactory<Data,String>("name"));
        id.setCellValueFactory(new PropertyValueFactory<Data,Integer>("id"));
        salary.setCellValueFactory(new PropertyValueFactory<Data,Double>("salary"));
        tableView.setItems(list);
    }  
    
    @FXML
    private void addPersonHandler(ActionEvent Event){
    String name = nameField.getText();
    int id = Integer.parseInt(idFeild.getText());
    double salary = Double.parseDouble(SalaryField.getText());
    Data data = new Data(name,id,salary);
        System.out.println(name+id+salary);
    list.add(data);
    nameField.clear();
    idFeild.clear();
    SalaryField.clear();
    }
    
}
