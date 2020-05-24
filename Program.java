import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.*;

public class Program {

	public static void main(String[] args) {
		// Récupération du nom des objets
		String strProfesseur = Professeur.class.getName();
		
		try {
			List<Professeur> lesProfesseurs = new ArrayList<Professeur>();
			
			// Déclaration d'une classe 'liste de professeur'
			Class classArrayListProfesseur = lesProfesseurs.getClass();
			
			Constructor<List<Professeur>> constListProf = classArrayListProfesseur.getConstructor(null);
			
			// Déclaration d'un objet 'liste de professeur'
			
			Object oArrayListProfesseur = constListProf.newInstance(null);
			
			//------------------------------------------------
			
			// Récupération de la classe professeur
			Class classProfesseur = Class.forName(strProfesseur);
			
			// Instanciation d'une liste de professeur
			// Déclaration des paramètres du constructeur
			Class[] paramsConstProfesseur = {String.class, String.class, Integer.class, String.class};
			
			// Récupération du constructeur correspondant
			Constructor<Professeur> constProfesseur = classProfesseur.getConstructor(paramsConstProfesseur);
			
			// Déclaration d'un objet professeur
			Object oProfesseurRogue = constProfesseur.newInstance(new Object[]{"Rogue", "Severus" , 53, "Potions"});
			// Déclaration d'un objet professeur
			Object oProfesseurMcGonagall = constProfesseur.newInstance(new Object[]{"McGonagall", "Minerva" , 59, "Métamorphose"});

			
			// Ajout de l'objet à la liste des professeurs
			Class[] paramsAddProfesseur = {Object.class};
			
			Method addProfesseur = classArrayListProfesseur.getMethod("add", paramsAddProfesseur);
			
			addProfesseur.invoke(oArrayListProfesseur, new Object[] {oProfesseurRogue});
			addProfesseur.invoke(oArrayListProfesseur, new Object[] {oProfesseurMcGonagall});
			
			// Appel à la méthode ListIterrator
			Method listProfListIterrator = classArrayListProfesseur.getMethod("listIterator", null);
			
			ListIterator iterrateListProf = (ListIterator)listProfListIterrator.invoke(oArrayListProfesseur, null); 
			
			while (iterrateListProf.hasNext()) {
				System.out.println(iterrateListProf.next());
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
