package exercice_compte;

public class App {

	public static void main(String[] args) {
		
		Compte compte1  = new Compte("515Z", 500, 10_000, -100, false, false);
		
		boolean test1 = compte1.deposer();
		boolean test2 = compte1.retirer();
		boolean test3 = compte1.afficher();
		
	}

}
