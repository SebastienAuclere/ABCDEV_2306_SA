package exemple_condition;

import java.util.Scanner;

/*
 VARIABLES
	nombre1 est un entier
Debut du programme
	Ecrire "Saisir un nombre entier"
	Lire <-- nombre1
Debut Si
	Si 
		nombre1 est egale à 20
	Alors
		Ecrire "Le nombre est egale à 20"
	Sinon Si
		nombre est egale à 15
	Alors
		Ecrire "Le nombre est egale à 15"
	Sinon
		Ecrire "le nombre n'est pas egale à 20 et n'est pas égale à 15"
Fin Si
Fin du programme
 */

public class App {

	public static void main(String[] args) {
		
		int nombre1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre entier : ");
		nombre1 = sc.nextInt();
		
		if(nombre1 == 20)
		{
			System.out.println("Le nombre saisi est égale à 20");
		}
		else if(nombre1 == 15)
		{
			System.out.println("Le nombre saisi est égale à 15");
		}
		else
		{
			System.out.println("Le nombre saisi est ni égale à 20 et ni égale à 15");
		}
		
		sc.close();

	}

}
