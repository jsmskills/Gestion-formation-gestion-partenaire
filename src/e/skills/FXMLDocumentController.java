/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.skills;

import Entities.Formation;
import Service.ServiceFormation;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

/**
 *
 * @author ASUS
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextField tftitre;
    @FXML
    private TextField tfdesc;
    @FXML
    private Label LAffiche;
    @FXML
    private TextField tdid;
  
    
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         
    }    

    @FXML
    private void SupprimerFormation(ActionEvent event) {
    }


    @FXML
    private void AjouterFormation(ActionEvent event) {
        ServiceFormation sf = new ServiceFormation();
        Formation f = new Formation();
        f.getId(tdid.getText());
        f.setTitre(tftitre.getText());
        f.setDescription(tfdesc.getText());
        
        
        
   sf.AjouterFormation(f);
        
    }

    @FXML
    private void ModifierFormation(ActionEvent event) {
    }

    @FXML
    private void AfficherFormation(ActionEvent event) {
        ServiceFormation sf = new ServiceFormation();
        try {
            LAffiche.setText(sf.AfficherFormation().toString());
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
