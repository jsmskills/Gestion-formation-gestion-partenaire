/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.skills;

import Entities.Formation;
import Entities.Partenaire;
import Service.ServiceFormation;
import Service.ServicePartenaire;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import static jdk.nashorn.internal.runtime.Debug.id;

/**
 *
 * @author ASUS
 */
public class ESkills extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException,SQLException{
        ServiceFormation sf=new ServiceFormation();
         
         Formation f1=new Formation("Réseau","description2");
         Formation f6=new Formation("Securité","description1");
//         f6.setId(32);
//         f0.setId(31);

    //   sf.AjouterFormation(f6);
      
        //sf.AjouterFormation(f1);
      
        
//         List<Formation>Formations =sf.AfficherFormation(); 
//         for (Formation f:Formations ){
//             System.out.println(f.toString());        
//        }

        // sf.SupprimerFormation(f0);
        //System.out.println(f2.toString());
        //sf.ModifierFormation(f7);
        //System.out.println(f2.toString());
        
      
        
        
        
        
         ServicePartenaire sp=new ServicePartenaire();
         Partenaire p0=new Partenaire("Partenaire1",1,"f0","Partenaire1@gmail.com");
         Partenaire p1=new Partenaire("Partenaire3",3,"f1","Partenaire2@gmail.com");
         p0.setId(6);
         p1.setId(9);
//         sp.AjouterPartenaire(p0);
//         sp.AjouterPartenaire(p1);
         
//        List<Partenaire>Partenaires =sp.AfficherPartenaire();
//         for (Partenaire p:Partenaires ){
//             System.out.println(p.toString());
//             
//        }

// sp.SupprimerPartenaire(p0);
// sp.ModifierPartenaire(p1);
  // launch(args);
}
}

