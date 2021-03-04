/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Formation;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IServiceFormation  {
    public void AjouterFormation(Formation f);
    public List<Formation> AfficherFormation()throws SQLException ;
    public void SupprimerFormation(Formation f);
    public void ModifierFormation(Formation f);
    
    
    
    
    
}
