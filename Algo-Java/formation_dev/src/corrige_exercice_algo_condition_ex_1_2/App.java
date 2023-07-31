package corrige_exercice_algo_condition_ex_1_2;

import java.util.Scanner;

public class App {
	/*
	 Variables
	nombre est un entier
Debut du programme
	Ecrire "Saisir un nombre"
	Lire nombre
Debut Si
	Si nombre < 0
	Alors Ecrire "Ce nombre est negatif"
	Sinon Si nombre = 0
	Alors Ecrire "Ce nombre est nul"
	Sinon Ecrire "Ce nombre est positif"
Fin Si
Fin du programme
	 */

	public static void main(String[] args) {
		
		int nombre;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre : ");
		nombre = sc.nextInt();
		
		if(nombre < 0)
		{
			System.out.println("Ce nombre est negatif");
		}
		else if(nombre == 0)
		{
			System.out.println("Ce nombre est nul");
		}
		else
		{
			System.out.println("Ce nombre est positif");
		}
		sc.close();

	}

}
