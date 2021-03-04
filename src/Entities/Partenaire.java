/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author ASUS
 */
public class Partenaire {
    public int id;
    public String nom;
    
    public int num;
    public String type;
    public String email;

    public Partenaire( String nom, int num, String type, String email) {
        
        this.nom = nom;
        
        this.num = num;
        this.type = type;
        this.email = email;
    }
    

    public Partenaire() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
     @Override
    public String toString() {
        return "Partenaire{" + "id=" + id + ", nom=" + nom + ", num=" + num + ", type=" + type + ", email=" + email + "}\n";
    }
    
}
