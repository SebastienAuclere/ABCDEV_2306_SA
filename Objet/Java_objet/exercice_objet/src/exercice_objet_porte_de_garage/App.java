package exercice_objet_porte_de_garage;

public class App {

	public static void main(String[] args) {
		
		PorteDeGarage maPorte1 = new PorteDeGarage( true, false, true, 100, 75, 25, 25, "Leroy Merlin", true, true);
		PorteDeGarage maPorte2 = new PorteDeGarage( true, false, true, 100, 75, 25, 25,"Brico Depot", true, true);
		
		boolean test1 = maPorte1.ouvrir();
		boolean test2 = maPorte2.ouvrir();
		boolean test3 = maPorte1.fermer();
		boolean test4 = maPorte2.fermer();
		
	}
}
