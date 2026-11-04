
public class ADHERENT {
	private int numCarte,tel,dateN,datee;
	private String nom,prenom,email;
	private LIVRE liste_livre;
	public ADHERENT(int numCarte, int tel, int dateN, String nom, String prenom, String email,LIVRE liste_livre) {
		super();
		this.numCarte = numCarte;
		this.tel = tel;
		this.dateN = dateN;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.liste_livre = liste_livre;
		
	}
	public int getNumCarte() {
		return numCarte;
	}
	public void setNumCarte(int numCarte) {
		this.numCarte = numCarte;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public int getDateN() {
		return dateN;
	}
	public void setDateN(int dateN) {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LIVRE getListe_livre() {
		return liste_livre;
	}
	public void setListe_livre(LIVRE liste_livre) {
		this.liste_livre = liste_livre;
	}
	
	
	


}
