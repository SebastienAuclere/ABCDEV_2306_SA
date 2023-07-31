package exercice1_1;

import java.util.Scanner;

/*
 VARIABLE
    Nombre1 est un entier
    Nombre2 est un entier
    Moyenne est un reel
Debut du programme
    Ecrire "Saisir le 1er nombre"
    Lire <-- Nombre1
    Ecrire "Saisir le 2eme nombre"
    Lire <-- Nombre2
    Moyenne <-- (Nombre1+Nombre2)/2
    Ecrire "La moyenne de ",Nombre1," et ",Nombre2," est ",Moyenne
Fin du programme

 */

public class App {

	public static void main(String[] args) {
		
		// declaration des variables
		int nombre1;
		int nombre2;
		double moyenne;
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("Saisir le 1er nombre");
		nombre1 = sc.nextInt();
		System.out.println("Saisir le 2eme nombre");
		nombre2 = sc.nextInt();
		
		moyenne = (nombre1 + nombre2)/2d;
		
		System.out.println("La moyenne de " + nombre1 + " et " + nombre2 + " est " + moyenne);

		sc.close();
	}

}
