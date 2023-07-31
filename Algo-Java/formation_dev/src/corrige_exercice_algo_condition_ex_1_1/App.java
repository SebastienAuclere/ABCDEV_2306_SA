package corrige_exercice_algo_condition_ex_1_1;

import java.util.Scanner;

/*
 Variables
	nombre est un entier
Debut du programme
	Ecrire "Saisir un nombre"
	Lire nombre
Debut Si
	Si nombre > 0 
	Alors Ecrire "Ce nombre est positif"
	Sinon Ecrire "Ce nombre est negatif"
Fin Si
Fin du programme
 */

public class App {

	public static void main(String[] args) {
		
		int nombre;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre : ");
		nombre = sc.nextInt();
		
		if(nombre > 0)
		{
			System.out.println("Ce nombre est positif");
		}
		else
		{
			System.out.println("Ce nombre est negatif");
		}
		sc.close();
	}
}
