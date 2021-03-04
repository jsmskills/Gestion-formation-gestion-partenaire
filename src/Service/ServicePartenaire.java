/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;


import Entities.Formation;
import Entities.Partenaire;
import Services.IServicePartenaire;
import Utils.Maconnexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class ServicePartenaire implements IServicePartenaire{

    Connection cnx;

    public ServicePartenaire() {
        cnx =Maconnexion.getInstance().getConnection();
    }
    
    @Override
    public void AjouterPartenaire(Partenaire p) {
        try {
            Statement stm= cnx.createStatement();      
             String query11="INSERT INTO `partenaire`( `nom`, `num`, `type`, `email`) VALUES('"+p.getNom()+"',"+p.getNum()+",'"+p.getType()+"','"+p.getEmail()+"')";
         
             stm.executeUpdate(query11);
        } catch (SQLException ex) {
            Logger.getLogger(ServiceFormation.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    @Override
    public List<Partenaire> AfficherPartenaire() throws SQLException{
        
            Statement stm= cnx.createStatement();
        String query22="Select * from `partenaire` ";
        ResultSet rst =stm.executeQuery(query22);
        List<Partenaire>partenaire=new ArrayList<>();
        while (rst.next())
        {Partenaire p=new Partenaire();
     
        p.setNom(rst.getString("nom"));
        p.setNum(rst.getInt("num"));
        p.setEmail(rst.getString("email"));
        p.setType(rst.getString("type"));
     
        partenaire.add(p);
        
        }
        
       
     return partenaire;
    }

    @Override
    public void SupprimerPartenaire(Partenaire p) {
        String query3 ="DELETE FROM `partenaire` WHERE id='"+p.getId()+"'";
        try {
            Statement stm= cnx.createStatement();
            stm.executeUpdate(query3);
        } catch (SQLException ex) {
            Logger.getLogger(ServicePartenaire.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }

    @Override
    public void ModifierPartenaire(Partenaire p) {
        
     String query="UPDATE `partenaire` SET `nom`='"+p.getNom()+"',`num`="+p.getNum()+",`type`='"+p.getType()+"',`email`='"+p.getEmail()+"' WHERE id="+p.getId()+"" ;  
     try {
            Statement stm= cnx.createStatement();
            stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ServiceFormation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
