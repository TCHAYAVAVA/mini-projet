/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employe;


public abstract class Employe {
  protected double Matricule;
 protected String Nom;
 protected String Prenom;
 protected double Age;
protected  String Dateentree;
 final double salaire=110000 ;
 
  public Employe(){
   Matricule=0;
   Nom="inconnu";
   Prenom="inconnu";
   Age=0;
   Dateentree="inconnu";
  }
  public Employe(double LMatricule,String LNom,String LPrenom,double LAge, String Ldate){
    Matricule=LMatricule;
    Nom=LNom;
    Prenom=LPrenom;
    Age=LAge;
    Dateentree=Ldate;
    
  }

      
  
  public String getNom(){
      return "L'employe "+ Nom + " "+ Prenom;}
  
  
  
  abstract double calculsalaire();
 


}
    
    
     

   

  
  


