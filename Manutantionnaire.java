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
public class Manutantionnaire extends Employe{
    
     protected double nbreheures;
    public Manutantionnaire(){
        super();
    }
    public Manutantionnaire(double LMatricule,String LNom,String LPrenom,double LAge, String Ldate ,double nbreheures){
    super(LMatricule,LNom,LPrenom,LAge,Ldate);
    this.nbreheures= nbreheures;}
    
       public void setnbreheures(double h){
           this.nbreheures=h;
       }
         public double calculsalaire(){ 
             double salairemensuel;
            salairemensuel=salaire+ 65*nbreheures;
           return salairemensuel; 
     } 
        
        
    
}


    
class ManutantionnaireArisque extends Manutantionnaire implements Risques{
 
    public ManutantionnaireArisque(){
        super(); }
        
    public ManutantionnaireArisque(double LMatricule,String LNom,String LPrenom,double LAge, String Ldate ,double nbreheures){
        
    
      super( LMatricule, LNom, LPrenom, LAge, Ldate , nbreheures);
}
public double calculsalaire(){
    return super.calculsalaire()+prime;
}

}