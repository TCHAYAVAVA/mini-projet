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
public class Salary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personnel p=new Personnel();
        Technicien VV=new Technicien(01234,"Brown","Jason",55,"17 janvier 1997",228);
      VV.setNbreunite(228);
        p.ajouterEmploye(VV);
        
        Vendeur LL=new Vendeur(14521,"Ngono","Louise",27,"22 juin 2014",554);
        LL.SetChiffreaffaire(554);
        p.ajouterEmploye(LL);
        Representant KK=new Representant(13247,"Koulagna","Hermine",32,"12 mai 2009",269);
        KK.SetChiffreaffaire(269);
        p.ajouterEmploye(KK);
        
        Manutantionnaire TT= new Manutantionnaire(02165,"Essomba","Luc",45,"02 avril 2000",200);
        TT.setnbreheures(200);
        p.ajouterEmploye(TT);
        TechnicienArisque YY= new TechnicienArisque(11255,"Tchonta","Yvan",42,"15 septembre 2002",315);
        YY.setNbreunite(315);
        p.ajouterEmploye(YY);
        ManutantionnaireArisque CC=new ManutantionnaireArisque(01525,"Ahmed","Souleyman",50,"29 mars 2001",133);
        CC.setnbreheures(133);
           p.ajouterEmploye(CC);
           
        p.calculSalaire();
        p.salaireMoyen();
    }
    
    
    
}
