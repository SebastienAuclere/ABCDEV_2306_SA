package corrige_exercice_algo_condition_ex_2_1;

import java.util.Scanner;

public class App {
	/*
	 Variables
	nombre1, nombre2 sont des entiers
Debut du programme
	Ecrire "Saisir le 1er nombre"
	Lire nombre1
	Ecrire "Saisir le 2ème nombre"
	Lire nombre2
Debut Si
	Si (nombre1 > 0 ET nombre2 > 0) OU (nombre1 < 0 ET nombre2 < 0)
	Alors Ecrire "Le produit des 2 nombres est positif"
	Sinon Ecrire "Le produit des 2 nombres est negatif"
Fin Si
Fin du programme
	 */

	public static void main(String[] args) {
		
		int nombre1,nombre2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le 1er nombre : ");
		nombre1 = sc.nextInt();
		System.out.println("Saisir le 2eme nombre : ");
		nombre2 = sc.nextInt();
		
		if((nombre1 > 0 && nombre2 > 0) || (nombre1 < 0 && nombre2 < 0))
		{
			System.out.println("Le produit des 2 nombre est positif");
		}
		else
		{
			System.out.println("Le produit des 2 nombre est negatif");
		}
		sc.close();
	}

}
