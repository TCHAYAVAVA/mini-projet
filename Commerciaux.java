/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employe;

/**
 *
 * @author Mlle Tchaya
 */
abstract class Commerciaux extends Employe {
    protected double chiffreaffaire;
    
    public Commerciaux(){
        super();
    }
    
    public Commerciaux(double matricule, String  nom, String prenom, int age ,String date, int chiffre ){
    super(matricule,nom,prenom,age,date);
    chiffreaffaire=chiffre;}
    
    
    public void SetChiffreaffaire(double a){
      this.chiffreaffaire=a;
    }
}
class Vendeur extends Commerciaux{
    public Vendeur(){
     super();}
     
     public Vendeur(double matricule, String  nom, String prenom, int age ,String date, int chiffre){
      super(matricule, nom,  prenom, age , date,  chiffre) ;  
    }
    public double calculsalaire(){
    double salairemensuel;
      salairemensuel= salaire + 0.2*chiffreaffaire+ 100 ; 
     return salairemensuel;
    }

    

   
}

class Representant extends Commerciaux{
    public Representant(){
     super();   
    }
    public Representant(double matricule, String  nom, String prenom, int age ,String date, int chiffre){
     super(matricule,   nom,  prenom, age ,date,chiffre);   
    }
       public double calculsalaire(){
    double salairemensuel;
      salairemensuel= salaire + 0.2*chiffreaffaire+ 200 ; 
     return salairemensuel;
    } 
 
 }

 