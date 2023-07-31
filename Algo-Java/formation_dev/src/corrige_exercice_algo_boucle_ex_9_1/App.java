package corrige_exercice_algo_boucle_ex_9_1;

import java.util.Scanner;

public class App {
	/*
	 Variables 
	nbChevauxPartants est un entier
	nbChevauxJouer est un entier
	i est un entier
	numerateur est un entier
	denominateur1 est un entier
	denominateur2 est un entier
Debut du programme
	Ecrire "Saisir le nombre de chevaux partants"
	Lire nbChevauxPartants 
	Ecrire "Saisir le nombre de chevaux jouer"
	lire nbChevauxJouer
	numerateur <-- 1
Debut pour
	pour i allant de 2 à nbChevauxPartants
	numerateur <-- numerateur * i
	i suivant
Fin pour
	denominateur1 <-- 1
Debut pour 
	pour i allant de 2 à nbChevauxPartant - nbChevauxJouer
	denominateur1 <-- denominateur1 * i
	i suivant
Fin pour
	denominateur2 <-- 1
Debut pour
	pour i allant de 2 à nbChevauxJouer
	denominateur2 <-- denominateur2 * i
	i suivant
Fin pour
	Ecrire "Dans l'ordre 1 chances sur ",numerateur/denominateur1
	Ecrire "Dans le desordre 1 chances sur ", numerateur/(denominateur2*denominateur1)
Fin du programme
	 */

	public static void main(String[] args) {
		int nbChevauxPartant;
		int nbChevauxJouer;
		int i;
		int numerateur;
		int denominateur1;
		int denominateur2;
		int ordres;
		int desordres;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le nombre de cheveux partant");
		nbChevauxPartant = sc.nextInt();
		System.out.println("Saisir le nombre de cheveux jouer");
		nbChevauxJouer = sc.nextInt();
		
		numerateur = 1;
		
		for(i = 1; i <= nbChevauxPartant; i++)
		{
			numerateur = numerateur * i;
		}
		
		denominateur1 = 1;
		
		for(i = 1; i < nbChevauxPartant - nbChevauxJouer;i++)
		{
			denominateur1 = denominateur1 * i;
		}
		
		denominateur2 = 1;
		
		for(i = 1; i <= nbChevauxJouer;i++)
		{
			denominateur2 = denominateur2 * i;
		}
		ordres = numerateur/denominateur1;
		desordres = numerateur/(denominateur2*denominateur1);
		
		System.out.println("Dans l'ordre 1 chance sur "+ordres);
		System.out.println("Dans le desordre 1 chance sur "+desordres);
		
		sc.close();

	}
	

}
