package corrige_exercice_algo_boucle_ex_6_1;

import java.util.Scanner;

public class App {
	/*
	 Variables
	nombre est un entier
	plusGrand est un entier
	i est un entier
  Debut du programme
	plusGrand <-- 0
  Debut pour
	pour i allant de 1 à 20
		Ecrire "Saisir un nombre"
		Lire nombre
	Debut Si
		Si i = 1 OU nombre > plusGrand
		Alors plusGrand <-- nombre
	Fin Si
	i suivant
 Fin pour
	Ecrire "Le nombre le plus grand est : ",plusGrand
 Fin du programme

	 */

	public static void main(String[] args) {
		
		int nombre;
		int plusGrand;
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		plusGrand = 0;
		
		for(i = 1; i <= 20; i++)
		{
			System.out.println("Saisir un nombre");
			nombre = sc.nextInt();
			if(i == 1 || nombre > plusGrand)
			{
				plusGrand = nombre;
			}
		}
		
		System.out.println("Le nombre le plus grand est : "+plusGrand);
		sc.close();

	}

}
