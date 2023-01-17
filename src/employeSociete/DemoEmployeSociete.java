package employeSociete;


public class DemoEmployeSociete {
	
	public static int nbTotalEmployes = 0;
	public static Societe[] listeSocietes = new Societe[10];
	private static int nbSocietes = 0;
	
	
	
	
	public static void main(String[] args) {

		Societe s1 = new Societe("Google");
		Societe s2 = new Societe("OVH");
		Societe s3 = new Societe("Elosi");
		
		Employe e1 = new Employe("Richard", s1);
		Employe e2 = new Employe("Bernard", s1);
		Employe e3 = new Employe("Henri", s1);
		Employe e4 = new Employe("Arielle", s2);
		Employe e5 = new Employe("Lucie", s2);
		Employe e6 = new Employe("Camille", s3);
		
		
		// affihcerlistesociete -> affiche la liste de toutes les sociétés de l'employé
		afficherListeSocietes();
		
		System.out.println("--------------------------------------------");
		System.out.println("e1.estCollegue(e2);");
		System.out.println(e1.estCollegue(e2));
		System.out.println("e5.estCollegue(e6);");
		System.out.println(e5.estCollegue(e6));
		System.out.println("--------------------------------------------");
		
		
		
		System.out.println("e4.augmenterSalaire(10);");
		e4.augmenterSalaire(10);
		afficherListeSocietes();
		
		
		System.out.println("s1.augmentationGenerale(20);");
		s1.augmentationGenerale(20);
		afficherListeSocietes();
		
	}
	
	public static boolean estDansListeSocietes(Societe s) {
		for (int i=0; i<nbSocietes; i++) {
			if (listeSocietes[i].equals(s) == true) {
				return true;
			}
		}
		return false;
	}
	
	public static void ajoutListeSocietes(Societe s) {
		listeSocietes[nbSocietes] = s;
		nbSocietes += 1 ;
	}
	
	public static void afficherListeSocietes() {
		System.out.println("--- Liste sociétés : -----------------------");
		for (int i=0; i<nbSocietes; i++) {
			Societe s = listeSocietes[i];
			System.out.println(s.toString());
		}
		System.out.println("--------------------------------------------");
	}
}
