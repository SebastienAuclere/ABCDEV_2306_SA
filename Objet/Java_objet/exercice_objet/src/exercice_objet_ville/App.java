package exercice_objet_ville;

public class App {

	public static void main(String[] args) {
		
		Ville ville = new Ville();
		Ville ville1 = new Ville("Marseille", 870321, "France");
		Ville ville2 = new Ville("Mulhouse", 108038, "France");
		
		System.out.println("\nville = "+ville.getNom()+" ville de "+ville.getNbHabitants()
                          +" habitants se situant en "+ville.getNomPays()); 
		System.out.println("\nville1 = "+ville1.getNom()+" ville de "+ville1.getNbHabitants()
        				  +" habitants se situant en "+ville1.getNomPays()); 
		System.out.println("\nville2 = "+ville2.getNom()+" ville de "+ville2.getNbHabitants()
        				  +" habitants se situant en "+ville2.getNomPays()+"\n\n"); 
		
		ville1.setNom("Honk Kong");
		ville2.setNom("New York");
		ville1.setNomPays("Espagne");
		
		System.out.println("\nville1 = "+ville1.getNom()+" ville de "+ville1.getNbHabitants()
		  +" habitants se situant en "+ville1.getNomPays()); 
		System.out.println("\nville2 = "+ville2.getNom()+" ville de "+ville2.getNbHabitants()
		  +" habitants se situant en "+ville2.getNomPays()+"\n\n");
	}

}
