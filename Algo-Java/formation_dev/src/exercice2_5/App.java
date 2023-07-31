package exercice2_5;

import java.util.Scanner;

public class App {
	/*
	 Variable
	nombre est un entier
Debut du programme
	ecrire "saisir un nombre entier"
	lire nombre
	Debut boucle pour
		Pour i allant de 2 à nombre- 1
			Debut Si
				Si nombre%i = 0
				Alors
				ecrire "Diviseur :", i 
			Fin si
	Fin boucle pour
Fin du programme
		
	 */
	public static void main(String[] args) {
		//variables
		int nombre;
		int i;
		
		Scanner sc = new Scanner(System.in);
		//Debut du programme
		System.out.println("Saisir un nombre entier:");
		nombre = sc.nextInt();
		for(i= 2; i< nombre; i++)
		{
			if(nombre%i == 0)
			{
				System.out.println(i + " ");
			}
		}
		
		sc.close();

	}

}
