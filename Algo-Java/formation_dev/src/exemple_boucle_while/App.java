package exemple_boucle_while;

public class App {
	
	/*
	 Variable
	 
	 compteur est un entier
	 
	 Debut du programme
	 
	 compteur <-- 1
	 debut boucle tant que
	 tant que compteur <=50
	 ecrire compteur
	 compteur + 1
	 fin boucle tant que
	 
	 Fin du programme
	 */

	public static void main(String[] args) {
		
		int compteur = 0;
		
		while(compteur <= 50)
		{
			System.out.print(compteur+ " ");
			compteur += 1;
		}
		
		compteur = 0;
		do
		{
			System.out.print(compteur+ " ");
			compteur ++;
		}
		while(compteur <= 50);
		
	}

}
