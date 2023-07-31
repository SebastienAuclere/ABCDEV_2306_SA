package exemple_additions;

import java.util.Scanner;

// Ceci est un commentaire sur une seule ligne

/*
 * Ceci est un 
 * commentaire
 * sur plusieurs lignes
 */

/*
 VARIABLE
    Nombre1 est un entier
    Nombre2 est un entier
    Resultat est un entier
Debut programme
    Ecrire "Saisir le 1er nombre"
    Lire <-- Nombre1
    Ecrire "Saisir le 2ème nombre"
    Lire <-- Nombre2
    Resultat <-- Nombre1 + Nombre2
    Ecrire "le résultat de l'addition de ",Nombre1, " et ",Nombre2, " est égale à ", Resultat
Fin programme
 */

public class App {

	public static void main(String[] args) {
		// declaration des variables
		int nombre1;
		int nombre2;
		double nombre3;
		String maChaine = "Saisir le 1er nombre "; //declaration d'une chaine de caractère
		boolean isTrue; // declaration d'un booleen
		int resultat;
		Scanner sc;
		sc = new Scanner(System.in);
		//Scanner sc = new Scanner(System.in);
		
		// declaration d'une constante exemple avec PI
		final double PI = 3.1415;
		final double PI2 = Math.PI;
		
		// exemple pour les puissances
		double exemplePuissance;  
		
		System.out.println(maChaine);
		nombre1 = sc.nextInt();
		System.out.println("Saisir le 2eme nombre ");
		nombre2 = sc.nextInt();
		System.out.println("Saisir le 3eme nombre ");
		nombre3 = sc.nextDouble();
		exemplePuissance = Math.pow(nombre3, 3);
		resultat = nombre1 + nombre2;
		if(resultat > 10)
		{
			isTrue = true;
		}
		else
		{
			isTrue = false;
		}
		
		System.out.println("Le resultat de l'addition de "+
							nombre1 +" et "+ nombre2 + " est "+
							resultat +" "+ isTrue +" "+ exemplePuissance);
		sc.close();
	}

}
