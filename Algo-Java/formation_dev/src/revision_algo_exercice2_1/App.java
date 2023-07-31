package revision_algo_exercice2_1;

import java.util.Scanner;

public class App {
	/*
	 Variables
	age est un entier
	majeur est une chaine de caractere
	mineur est une chaine de caractère
	pasNe est une chaine de caractère
Debut du programme
	majeur <-- "Vous etes majeur"
	mineur <-- "Vous etes mineur"
	pasNe <-- "Vous n'etes pas encore ne"
	Ecrire "saisir votre age"
	Lire age
	Debut Si
		Si age < 0
		Alors Ecrire pasNe
		Sinon Si age  < 18
		Alors Ecrire mineur
		Sinon
		Ecrire majeur
	Fin Si
Fin du programme
	 */

	public static void main(String[] args) {
		//declaration des variables
		int age;
		String majeur;
		String mineur;
		String pasNe;
		
		majeur = "Vous etes majeur";
		mineur = "Vous etes mineur";
		pasNe = "Vous n'etes pas encore ne";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir votre age");
		age = sc.nextInt();
		
		if(age < 0)
		{
			System.out.println(pasNe);
		}
		else if(age < 18)
		{
			System.out.println(mineur);
		}
		else
		{
			System.out.println(majeur);
		}
		sc.close();
	}

}
