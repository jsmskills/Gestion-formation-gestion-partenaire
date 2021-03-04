/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.sql.Date;

/**
 *
 * @author ASUS
 */
public class Formation {
    private int id;
    private String titre;
    private String description;

    public Formation( String titre, String description) {
      
        this.titre = titre;
        this.description = description;

    }

    public Formation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

     public void setDescription(String description) {
        this.description = description;
    }


   

    @Override
    public String toString() {
//        return "Formation{" + "id=" + id + ", titre=" + titre + ", description=" + description + ", datedebut=" + datedebut + ", datefin=" + datefin + "}\n";
     return "Formation{" + "id=" + id + ", titre=" + titre + ", description=" + description + "}\n";
    }

    public String getdatedebut() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getId(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
