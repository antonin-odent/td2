import java.util.ArrayList;

public class ADHERENT {
	private int numCarte,tel,dateN;
	private String nom,prenom,email;
	private ArrayList<LIVRE> liste_livres;
	public ADHERENT(int numCarte, int tel, int dateN, String nom, String prenom, String email,LIVRE liste_livre) {
		super();
		this.numCarte = numCarte;
		this.tel = tel;
		this.dateN = dateN;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.liste_livres = new ArrayList<>();;
		
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
	public ArrayList<LIVRE> getListeLivres() {
	    return liste_livres;
	}

	public void setListeLivres(ArrayList<LIVRE> listeLivres) {
	    this.liste_livres = listeLivres;
	}
	
	


}
