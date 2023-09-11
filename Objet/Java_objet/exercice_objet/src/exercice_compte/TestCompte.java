package exercice_compte;

public class TestCompte {

	public static void main(String[] args) {
	
		Compte compte1  = new Compte(500, 10_000, -100);

		//boolean test1 = compte1.deposer(2300);
		boolean test2 = compte1.retirer(-200);
		boolean test3 = compte1.retirer(-4000);
		
		System.out.println(test2 + " " + test3);
	}
}
