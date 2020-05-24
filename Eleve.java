import java.util.*;

public class Eleve extends Personne {
	private List<Professeur> lesProfesseurs;

	public Eleve(String nom, String prenom, int age, List<Professeur> lesProfesseurs) {
		super(nom, prenom, age);
		setLesProfesseurs(lesProfesseurs);
	}

	public List<Professeur> getLesProfesseurs() {
		return lesProfesseurs;
	}

	public void setLesProfesseurs(List<Professeur> lesProfesseurs) {
		this.lesProfesseurs = lesProfesseurs;
	}
	
	public String toString() {
		String strReturn = "Je suis un élève qui suis les cours de :";
		for(Professeur unProfesseur : lesProfesseurs) {
			strReturn += "\n\t\t-" + unProfesseur.getNomPnom() + " | " + unProfesseur.getSpecialite();
		}
		return strReturn;
	}
}
