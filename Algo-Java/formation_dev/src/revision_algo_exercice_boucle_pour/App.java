package revision_algo_exercice_boucle_pour;

import java.util.Scanner;

public class App {
	/*
	 Variables
	nombre est un entier
	i est un entier
Debut du programme
	Ecrire "Saisir un nombre"
	Lire nombre
Debut pour
	pour i allant de 1 à 10
	nombre <-- nombre + 1
	Ecrire nombre," "
	i suivant
fin pour
fin du programme
	 */

	public static void main(String[] args) {
		int nombre;
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("saisir un nombre");
		nombre = sc.nextInt();
		
		for(i=1;i<=10;i++)
		{
			nombre = nombre + 1;
			System.out.print(nombre+" ");
		}
		sc.close();
	}

}
