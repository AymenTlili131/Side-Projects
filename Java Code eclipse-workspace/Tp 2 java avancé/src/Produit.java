
public class Produit 
{
	int id;String Libelle ; double prix;
	public Produit(int id, String libelle, double prix) 
	{
		this.id = id;
		Libelle = libelle;
		this.prix = prix;
	}
	
	public Produit() {
	}

	public Produit(String libelle, double prix) {
		Libelle = libelle;
		this.prix = prix;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return Libelle;
	}
	public void setLibelle(String libelle) {
		Libelle = libelle;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Produit [id=" + id + ", Libelle=" + Libelle + ", prix=" + prix + "]";
	}

}
