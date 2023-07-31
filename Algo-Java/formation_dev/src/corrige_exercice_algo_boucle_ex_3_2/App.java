package corrige_exercice_algo_boucle_ex_3_2;

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
Debut tant que
	Tant que i <= 10
	Faire
	nombre <-- nombre + 1
	Ecrire nombre, " "
	i <-- i + 1
Fin tant que
Fin du programme
	 */

	public static void main(String[] args) {
		int nombre;
		int i = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre");
		nombre = sc.nextInt();
		
		while(i <= 10)
		{
			nombre += 1;
			System.out.println(nombre);
			i++;
		}
		sc.close();
	}

}
