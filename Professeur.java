
public class Professeur extends Personne {
	private String specialite;

	public Professeur(String nom, String prenom, Integer age, String specialite) {
		super(nom, prenom, age);
		setSpecialite(specialite);
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	
	public String toString() {
		return "Je suis le professeur " + getNomPnom() + " dont la spécialité est : " + this.specialite;
	}

}
