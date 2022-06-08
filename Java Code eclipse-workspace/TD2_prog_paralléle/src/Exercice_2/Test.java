package Exercice_2;

public class Test {

	public static void main(String[] args) {
	Panier p= new Panier();
	Vendeur.L_p.add(p);
	BoulEmpSem BES= new BoulEmpSem(4);
	Employé e= new Employé(BES);
	Boulanger B1= new Boulanger(BES);
	Boulanger B2= new Boulanger(BES);
	Boulanger B3= new Boulanger(BES);
	Boulanger B4= new Boulanger(BES);
	
	BoulVendSem BVS= new BoulVendSem(3);
	Vendeur V1= new Vendeur(BVS);
	Vendeur V2= new Vendeur(BVS);
	Vendeur V3= new Vendeur(BVS);
	
	VendCliSem VCS = new VendCliSem(20);
	Client C1 =new Client(VCS,650,2);
	Client C2 =new Client(VCS,250,1);
	Client C3 =new Client(VCS,780,3);
	Client C4 =new Client(VCS,650,3);
	Client C5 =new Client(VCS,500,2);
	
	e.start();
	B1.start();
	B2.start();
	B3.start();
	B4.start();
	V1.start();
	V2.start();
	V3.start();
	C1.start();
	C2.start();
	C3.start();
	C4.start();
	C5.start();
	
	}

}
