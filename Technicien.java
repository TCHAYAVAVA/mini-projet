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
public class Technicien  extends Employe{
    protected int nbreunite;
    public Technicien(){
      super();
    
   }
    public Technicien(double Matricule,String Nom,String Prenom, int Age, String Date, int nbreunite){
        super(Matricule,Nom,Prenom,Age,Date);
        this.nbreunite=nbreunite;
    }   
   public void setNbreunite(int a ){
       this.nbreunite=a;
   }
    public  double calculsalaire(){
        double salairemensuel;
        salairemensuel= salaire+ 5*nbreunite+ 100 ; 
        return salairemensuel;
    }
}



class TechnicienArisque extends Technicien implements Risques{
 public TechnicienArisque(){
     super();
 }
    public TechnicienArisque(double Matricule,String Nom,String Prenom, int Age, String Date, int nbreunite){
        super(Matricule, Nom ,Prenom, Age, Date, nbreunite);
    }
            
 public double calculsalaire(){
     return super.calculsalaire()+prime;
 }

}