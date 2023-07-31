package revision_algo_exercice1_1;

import java.util.Scanner;

public class App {
	/*
	 Variables 
	nombre1 est un entier
	nombre2 est un entier
	moyenne est un reel double
Debut du programme
	Ecrire "saisir le 1er nombre"
	Lire nombre1
	Ecrire "Saisir le 2ème nombre"
	Lire nombre2
	moyenne <-- (nombre1 + nombre2)/2
	Ecrire "La moyenne est : ",moyenne
Fin du programme

	 */

	public static void main(String[] args) {
		// declaration des variables
		//int nombre1;
		//int nombre2;
		int nombre1,nombre2;
		double moyenne;
		
		//declaration du scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le 1er nombre");
		nombre1 = sc.nextInt();
		System.out.println("Saisir le 2eme nombre");
		nombre2 = sc.nextInt();
		
		// on rajoute un d à 2 pour avoir un double en sortie
		moyenne = (nombre1+nombre2)/2d;
		
		System.out.println("La moyenne est :"+moyenne);
		
		sc.close();
	}

}
