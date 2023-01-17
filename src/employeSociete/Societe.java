package employeSociete;

public class Societe {
	
	private String nom;
	private Employe[] listeEmployes = new Employe[100];
	private int nbEmployes = 0;
	
	
	public Societe(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return this.nom;
	}

	public void embaucher(Employe e) {
		this.listeEmployes[this.nbEmployes] = e;
		this.nbEmployes += 1 ;
	}
	
	public void augmentationGenerale(double taux) {
		for (Employe e: this.listeEmployes) {
			if (e!=null) e.augmenterSalaire(taux);
		}
	}
	
	public float getMasseSalariale() {
		float somme = 0;
		for (Employe e: this.listeEmployes) {
			if (e!=null) somme += e.getSalaire();
		}
		return somme;
	}

	public String toString() {
		String r = "Société : " + this.nom + "\n";
		for (Employe e: this.listeEmployes) {
			if (e!=null) {
				r += e.getNom();
				r += "\tn°" + e.getId();
				r += "\tSociété : " + e.getSociete().getNom();
				r += "\tSalaire : " + e.getSalaire();
				r += "\n";
			}
		}
		r += "Masse salariale : " + this.getMasseSalariale();
		r += "\n--------------------------------------------";
		return r;
	}
}
