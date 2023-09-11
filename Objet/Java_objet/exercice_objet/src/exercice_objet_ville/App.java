package exercice_objet_ville;

public class App {

	public static void main(String[] args) {
		
		Ville ville = new Ville();
		Ville ville1 = new Ville("Marseille", 870321, "France");
		Ville ville2 = new Ville("Mulhouse", 108038, "France");
		
		System.out.println("\nville = "+ville.getNomVille()+" ville de "+ville.getNbHabitants()
                          +" habitants se situant en "+ville.getNomPays()); 
		System.out.println("\nville1 = "+ville1.getNomVille()+" ville de "+ville1.getNbHabitants()
        				  +" habitants se situant en "+ville1.getNomPays()); 
		System.out.println("\nville2 = "+ville2.getNomVille()+" ville de "+ville2.getNbHabitants()
        				  +" habitants se situant en "+ville2.getNomPays()+"\n\n"); 
		
		ville1.setNomVille("Honk Kong");
		ville2.setNomVille("New York");
		ville1.setNomPays("Espagne");
		
		System.out.println(ville2.getNomVille());
		
		System.out.println("\nville1 = "+ville1.getNomVille()+" ville de "+ville1.getNbHabitants()
		  +" habitants se situant en "+ville1.getNomPays()); 
		System.out.println("\nville2 = "+ville2.getNomVille()+" ville de "+ville2.getNbHabitants()
		  +" habitants se situant en "+ville2.getNomPays()+"\n\n");
	}

}
