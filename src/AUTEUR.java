
public class AUTEUR {
	private String nom,prenom,description;
	private int dateN;
	public AUTEUR(String nom, String prenom, String description, int dateN) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.description = description;
		this.dateN = dateN;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDateN() {
		return dateN;
	}
	public void setDateN(int dateN) {
		this.dateN = dateN;
	}
	

}
