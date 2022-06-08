public class Test 
{Service S1= new Service ("S1",4);
Service S2= new Service ("S2",4);
Employe E1=new Employe("E1",1);
Employe E2=new Employe("E2",1);
Employe E3=new Employe("E3",1);
Employe E4=new Employe("E4",1);
Employe aux=new Employe("aux",1);
	S1.affecterEmp(E1.matricule);
	S1.affecterEmp(E2.matricule);
	S2.affecterEmp(E3.matricule);
	S2.affecterEmp(E4.matricule);
S1.setChef(E1.matricule);
S2.setChef(E3.matricule);
	S1.afficher();S2.afficher();
aux=E2;
E2=E4;
E4=aux;
E2.augmenterSalaire(1.5f);
S1.setChef(E2.matricule); /*plusieurs chefs du meme service ...(une solution est d'eliminer E1 et le recréer sans etre chef*/
	S1.augmenterSalaire(2f);S2.augmenterSalaire(1.6f);
S1.afficher();S2.afficher();
}
