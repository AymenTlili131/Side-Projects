import java.util.Scanner;
public class Employe {
 /*private*/int matricule=1001;
 String nom;
 float salaire;
 Service service;
 Scanner keyb;
 public static int dernierMat = 1000;
 
 public Employe(String nom1 ,float salaire1)
 {matricule++;
 this.nom=nom1;
 this.salaire=salaire1;
 }
 public int getMat()
 {System.out.println(" La matricule de l'employé est "+ matricule);
 return matricule;
 }
 public String getNom()
 {System.out.println(" Le nom de l'employé est "+ nom);
 return nom;
 }
 public void setService()
 {String service =keyb.nextLine();
 }
 public float augmenter_salaire(float f)
 {return salaire=salaire*f;
 }
 public String afficher()
 { String a="affichage employe accompli";
	 System.out.println("Description : Mat"+ matricule +"nom : " +nom +"service : "+ service.getNom() +"salaire : "+salaire);
	 return a;
 }
}
