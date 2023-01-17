package employeSociete;
import java.lang.Math;


public class Employe {

	private String nom; 
	private Societe societe;
	private int id;
	private double salaire;
	
//	private int nbTotalEmployes = 0;
//	
//	private Societe[] listeSocietes = new Societe[10];
//	private int nbSocietes = 0;
	
	
	public Employe(String nom, Societe s) {
		this.nom = nom;
		this.societe = s;
		if (DemoEmployeSociete.estDansListeSocietes(s) == false) DemoEmployeSociete.ajoutListeSocietes(s);
		s.embaucher(this);
		this.id = DemoEmployeSociete.nbTotalEmployes;
		DemoEmployeSociete.nbTotalEmployes += 1;
		this.setSalaire((int)(1000 + Math.random()*2000));
	}
	
		
	
	public String getNom() {
		return this.nom;
	}
	
	public int getId() {
		return this.id;
	}
	
	public Societe getSociete() {
		return this.societe;
	}
	
	public double getSalaire() {
		return salaire;
	}
	
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	public void augmenterSalaire(double taux) {
		this.salaire =  (int) Math.round(this.salaire*(1 + taux/100));
	}
	
	public boolean estCollegue(Employe e) {
		if (e.getSociete().equals(this.societe)) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return this.nom + "\t n°" + this.id +"\tSociété :" + this.societe + "\tSalaire :" + this.salaire;
	}
	
	
	
}
