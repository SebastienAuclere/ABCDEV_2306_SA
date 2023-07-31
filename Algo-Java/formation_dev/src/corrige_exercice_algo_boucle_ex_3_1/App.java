package corrige_exercice_algo_boucle_ex_3_1;

import java.util.Scanner;

public class App {
	/*
	 Variables 
	nombre est un entier
	i est un entier
Debut du programme
	i <-- 1
	Ecrire "Saisir un nombre"
	Lire nombre
Debut pour
	pour i allant de 1 à 10
	nombre <-- nombre + 1
	Ecrire nombre," "
	i suivant
Fin pour
Fin du programme

	 */

	public static void main(String[] args) {
		int nombre;
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre");
		nombre = sc.nextInt();
		
		for(i = 1; i <= 10; i++)
		{
			nombre += 1;
			System.out.println(nombre);
		}
		sc.close();
	}


		

	}


