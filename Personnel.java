/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employe;
import java.util.ArrayList;

public class Personnel {
int nbreEmploye;

 static private ArrayList<Employe> listeString;
public Personnel(){
 listeString  = new ArrayList<Employe>();
}

     
       public void ajouterEmploye(Employe e){
          listeString.add(e);
      }
     public static void calculSalaire( ){
         
         for (int i=0; i<listeString.size(); i++){
          System.out.println(listeString.get(i).getNom()+" a un salaire de "+listeString.get(i).calculsalaire()+" FCFA");}
     }
    public double salaireMoyen(){
        double a=0;
        for(int i=0;i<listeString.size(); i++){
        a=listeString.get(i).calculsalaire();
        }
        return a;
    }  
     }

