/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Partenaire;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IServicePartenaire  {
    public void AjouterPartenaire(Partenaire p);
    public List<Partenaire> AfficherPartenaire()throws SQLException ;
    public void SupprimerPartenaire(Partenaire p);
    public void ModifierPartenaire(Partenaire p);
}
