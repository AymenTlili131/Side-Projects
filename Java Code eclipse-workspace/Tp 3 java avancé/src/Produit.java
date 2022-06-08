
public class Produit 
{ int ID ;
  String Libelle ;
  float Prix ;
  public Produit(int iD, String libelle, float prix) {
		ID = iD;
		Libelle = libelle;
		Prix = prix;
	}

public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getLibelle() {
	return Libelle;
}
public void setLibelle(String libelle) {
	Libelle = libelle;
}
public float getPrix() {
	return Prix;
}
public void setPrix(float prix) {
	Prix = prix;
}


}
