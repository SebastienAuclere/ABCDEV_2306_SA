package corrige_jalon_algo3_1;

import java.util.Scanner;

public class App {
	/*
	 Variables

	i est un entier
	nombre est un entier
	resultat est un entier

Debut de programme
	Ecrire "Saisir un nombre de 1 à 10"
	Lire nombre
Debut pour
	pour i allant de 0 à 10
	resultat <-- i * nombre
	Ecrire i," * ",nombre," = ",resultat
Fin pour
fin du programme
	 */

	public static void main(String[] args) {
		// declaration des variables
		
		int i;
		int nombre;
		int resultat;
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Saisir un nombre de 1 à 10");
		nombre = clavier.nextInt();
		
		for(i = 0;i <= 10;i++)
		{
			resultat = i * nombre;
			System.out.println(i+" * "+nombre+" = "+resultat);
		}
		clavier.close();
	}

}
