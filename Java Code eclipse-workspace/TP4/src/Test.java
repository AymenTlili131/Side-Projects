public class Test 
{ 
public static void main(String[] args)
{ Personnel p=new Personnel();


p.ajouterEmploye(new Vendeur("Pierre","Business","1995",30000));
p.ajouterEmploye(new Representant("Léon","Vendtout","2001",20000));
p.ajouterEmploye(new Technicien("Yves","Bosseur",28,"1998",1000));
p.ajouterEmploye(new Manutention("Jeanne","Stocketout",32,"1998",45));
p.ajouterEmploye(new TechnicienRisque("Jean","Flippe",28,"2000",1000));
p.ajouterEmploye(new ManutentionRisque("Al","Abordage",30,"2001",45));

System.out.println(p.salaireMoyen());
}
}