/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.skills;


import Entities.Partenaire;
import Service.ServicePartenaire;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class FXMLDocController implements Initializable {

    @FXML
    private TextField tfnom;
    @FXML
    private TextField tfmail;
    @FXML
    private TextField tfnum;
    @FXML
    private Label LAffich;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AjouterPartenaire(ActionEvent event) {
         ServicePartenaire sp = new ServicePartenaire();
        Partenaire p = new Partenaire();
        p.setNom(tfnom.getText());
       
        p.setEmail(tfmail.getText());
        
        
        
        
   sp.AjouterPartenaire(p);
    }

    @FXML
    private void AfficherPartenaire(ActionEvent event) {
            ServicePartenaire sp = new ServicePartenaire();
        try {
            LAffich.setText(sp.AfficherPartenaire().toString());
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void SupprimerPartenaire(ActionEvent event) {
    }

    @FXML
    private void ListeFormation(ActionEvent event) {
    }
    }

   

