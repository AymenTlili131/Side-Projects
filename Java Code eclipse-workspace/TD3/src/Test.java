
public class Test {
public static void main (String[] args) {
	Employe T[] = new Employe[3];
	Vacataire v=new Vacataire(1111, "BEN SALAH", 190, 3.9f);
	Contractuel c=new Contractuel(2222,"BEN MOHAMED",900);
	Permanent m=new Permanent(3333,"BEN ALI",1000,150f);
	T[0]=v;T[1]=c;T[2]=m;
	for (int i=0;i<T.length;i++)
		System.out.print(T[i].toString());
	v.setnbHeures(210); /* ((vacataire)T[0]).setnbHeures(210);
	for (int i=0; i<tabEmp.length; i++) {
			if (tabEmp[i] instanceof Vacataire) {
				((Vacataire)tabEmp[i]).setNbHeures(210);
				((Vacataire)tabEmp[i]).setPrixHeure(4);
			}
			if (tabEmp[i] instanceof Contractuel)
				((Contractuel)tabEmp[i]).setSalaireBase(950);
			if (tabEmp[i] instanceof Permanent) {
				((Permanent)tabEmp[i]).setSalaireBase(1100);
				((Permanent)tabEmp[i]).setPrime(230);
			}
		} */
	v.setprixHeure(4f);
	c.setsalaireBase(950f);
	m.setsalaireBase(1100f);
	m.setsalaireBase(230f);
	for (int i=0;i<T.length;i++)
		System.out.print(T[i].toString());
}
}