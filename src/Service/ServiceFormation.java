/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entities.Formation;
import Services.IServiceFormation;
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
public class ServiceFormation implements IServiceFormation{

    Connection cnx;

    public ServiceFormation() {
        cnx =Maconnexion.getInstance().getConnection();
    }
    
    @Override
    public void AjouterFormation(Formation f) {
        try {
            Statement stm= cnx.createStatement();      
            String query="INSERT INTO `formation`(`titre`, `description`) VALUES('"+f.getTitre()+"','"+f.getDescription()+"')";           
            stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ServiceFormation.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    @Override
    public List<Formation> AfficherFormation() throws SQLException{
        
            Statement stm= cnx.createStatement();
        String query="Select * from `formation` ";
        ResultSet rst =stm.executeQuery(query);
        List<Formation>formation=new ArrayList<>();
        while (rst.next())
        {Formation f=new Formation();
        f.setId(rst.getInt("id"));
        f.setTitre(rst.getString("titre"));
        f.setDescription(rst.getString("description"));
//        f.setDatedebut(rst.getDate("datedebut"));
//        f.setDatefin(rst.getDate("datefin"));
        formation.add(f);
        
        }
        
       
     return formation;
    }

    @Override
    public void SupprimerFormation(Formation f) {
        String query ="DELETE FROM `formation` WHERE id='"+f.getId()+"'";
        try {
            Statement stm= cnx.createStatement();
            stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ServiceFormation.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }

   
    @Override
    public void ModifierFormation(Formation f) {

     String query="UPDATE `formation` SET `titre`='"+f.getTitre()+"',`description`='"+f.getDescription()+"' WHERE id="+f.getId()+"" ;  
     try {
            Statement stm= cnx.createStatement();
            stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ServiceFormation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 
}
