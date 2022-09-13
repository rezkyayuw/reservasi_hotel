/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tb;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.table.DefaultTableModel;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class FXML2Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
   @FXML
    private Label hotel,jalan, telp, nama, lamaMenginap, check_in, check_out, total, bayar,kembali, tipeKamar;
    
    @FXML
    private TextArea textArea;
    
    @FXML
    private TextField nm, kamar, tl, byr, kmb, km;
    
    @FXML 
    private  DatePicker ci, co;
    
    @FXML
    private Button simpan, hapus, cek, hitung;
    
    @FXML
    private TableView table;
    
    double jenis, lama, tarif, bayarr;
    float hasil;
    float kamarr = 0;
   // private SimpleStringProperty nn, lm,tc,tco,jk,tb;
        
    @FXML
    private void handleButtonAction2(ActionEvent event) throws IOException {
        
        lama = Float.parseFloat(kamar.getText());
         jenis = Float.parseFloat(km.getText());
       //String lamaMenginap = kamar.getText();
       //String tipeKamar = km.getText();
       
       if (jenis == 1){
           km.setText("Standart Room");
           kamar.setText("Rp. 200000/hari");
       } else if (jenis == 2){
           km.setText("Deluxe Room");
           kamar.setText("Rp. 275000/hari");
       }else if (jenis == 3){
           km.setText("Suite Room");
           kamar.setText("Rp. 300000/hari");
       } else if (jenis == 4){
            km.setText("President Room");
           kamar.setText("Rp. 350000/hari");
       }
       
       if (jenis == 1){
           tarif = lama * 200000;
           tl.setText("" + tarif);
           
        } else if (jenis ==2){
            tarif = lama * 275000;
           tl.setText("" + tarif);
        }else if (jenis == 3){
            tarif = lama * 300000;
           tl.setText("" + tarif);
        } else if (jenis == 4){
            tarif = lama * 350000;
           tl.setText("" + tarif);
        }
       
       
       
       
       /*kamarr = Float.parseFloat(km.getText());
       lama = Float.parseFloat(kamar.getText());
       paket = Float.parseFloat(pagi.getText());
       paket = Float.parseFloat(malam.getText());
      
       hasil = (int) (kamarr + lama + paket);
       tl.setText("" +hasil);*/
       
       
       
   
         /*vharga = Float.parseFloat(tl.getText());
         vbayar = Float.parseFloat(byr.getText());
         vkembali = vbayar - vharga;
         kmb.setText(String.valueOf(vkembali));*/
    }
         
    //@FXML 
    //private void tableMouseClicked (java.awt.event.MouseEvent evt){
       // TableView table = new TableView();
         //DefaultTableModel  model = (DefaultTableModel) table.getModel();
        //int i = tabel.
    //}
       @FXML
        private void handleButtonAction3(ActionEvent event) throws IOException {
        /*kamarr = Float.parseFloat(km.getText());
       lama = Float.parseFloat(kamar.getText());
       hasil = (int) (kamarr + lama );
       tl.setText("" +hasil);*/
      //int i = tabel.
     
        //lama = Float.parseFloat(kamar.getText());
         //jenis = Float.parseFloat(km.getText());
         Parent tableViewParent = FXMLLoader.load(getClass().getResource("FXML3.fxml"));
            Scene tableViewScene = new Scene (tableViewParent);
            
            Stage window;
            window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(tableViewScene);
            window.show();
            
            nm.getText();
            nm.setText("");
           
    }
    @FXML
    private void handleButtonAction4(ActionEvent event) throws IOException {
    
    
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       //new TableView().getM
    }    

   
    
}
