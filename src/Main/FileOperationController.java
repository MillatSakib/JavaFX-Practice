
package Main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FileOperationController implements Initializable {

    boolean fileChecker(File file) {
        if (!file.exists()) {
            fileExistense.setText("There have No File.");
            return false;
        } else {
            fileExistense.setText("Hurray. File Exists!");
            return true;
        }
    }
    
    String fileRead(File file) throws IOException {
    if (!fileChecker(file)) return "";
    
    StringBuilder temp = new StringBuilder();
    try (Scanner src = new Scanner(file)) {  // Use try-with-resources to auto-close Scanner
        while (src.hasNext()) {
            temp.append(src.nextLine()).append("\n");
        }
    }
    return temp.toString();
}

    
    @FXML
    private Label fileExistense;
    
    @FXML
    private TextArea textAreaID;
    
    @FXML
    private TextField addText;
    

    @FXML
private void handleDelete(ActionEvent Event) throws IOException {
    File file = new File("text.txt");
    System.out.println("AA");
    if (file.exists()) {
        System.out.println("bb");
        if (file.delete()) {
            System.out.println("FF");
            fileChecker(file);
            textAreaID.clear(); 
        } else {
        }
    } else {
        fileChecker(file);
    }
}

    
    @FXML
    private void handleRead(ActionEvent Event) throws IOException{
    File file = new File("text.txt");
    textAreaID.setText(fileRead(file));
    }
    
    @FXML
    private void handleAddText(ActionEvent Event) throws IOException {
        if (addText.getText().equals("")) {
            return;
        }
        File file = new File("text.txt");

        FileWriter fWriter = new FileWriter(file, true);
        fWriter.write("\n" + addText.getText());
        addText.setText("");
        fWriter.close();
        fileChecker(file);
       textAreaID.setText(fileRead(file));
        

    }

    @FXML
    private void handleCreateFile(ActionEvent Event) throws IOException {
        File file = new File("text.txt");
        if (!file.exists()) {
            FileWriter fWriter = new FileWriter(file);
            fWriter.close();
            fileChecker(file);
        } else {
            System.out.println("File Already Exist!");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        File file = new File("text.txt");
        fileChecker(file);
    }

}
