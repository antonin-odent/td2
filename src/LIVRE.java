
public class LIVRE {
	private String ISBN,titre, Auteur;
	private int prix;
	private ADHERENT empr;
	private AUTEUR lauteur;
	public LIVRE(String iSBN, String titre, String auteur, int prix,ADHERENT emprunteur,AUTEUR lauteur) {
		super();
		ISBN = iSBN;
		this.titre = titre;
		Auteur = auteur;
		this.prix = prix;
		this.emprunteur = emprunteur;
		this.lauteur = lauteur;
		
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return Auteur;
	}
	public void setAuteur(String auteur) {
		Auteur = auteur;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public ADHERENT getEmprunteur() {
		return emprunteur;
	}
	public void setEmprunteur(ADHERENT emprunteur) {
		this.emprunteur = emprunteur;
	}
	public AUTEUR getInfo() {
		return lauteur;
	}
	public void setInfo(AUTEUR info) {
		this.lauteur = info;
	}
	
	
	

}
