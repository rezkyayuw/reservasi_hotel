/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tb;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.stage.Stage;


/**
 *
 * @author Portege
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        
        
        
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText("Pilih yang akan dicek");
        

        ButtonType buttonTypeOne = new ButtonType("Reservasi");
        ButtonType buttonTypeTwo = new ButtonType("Data Pengunjung");
        ButtonType buttonTypeThree = new ButtonType("Cek");
        ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);

        alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo, buttonTypeThree, buttonTypeCancel);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == buttonTypeOne){
            // ... user chose "One"
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("FXML2.fxml"));
            Scene tableViewScene = new Scene (tableViewParent);
            
            Stage window;
            window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(tableViewScene);
            window.show();
        } else if (result.get() == buttonTypeTwo) {
            // ... user chose "Two"
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("FXML3.fxml"));
            Scene tableViewScene = new Scene (tableViewParent);
            
            Stage window;
            window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(tableViewScene);
            window.show();
           
        } else if (result.get() == buttonTypeThree) {
            // ... user chose "Three"
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("FXML4.fxml"));
            Scene tableViewScene = new Scene (tableViewParent);
            
            Stage window;
            window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(tableViewScene);
            window.show();
        } else {
            // ... user chose CANCEL or closed the dialog
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
