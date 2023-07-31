package revision_algo_exercice2_2;

import java.util.Scanner;

public class App {
	/*
	 Variables
	nombreA est un entier
	nombreB est un entier
Debut du programme
	Ecrire "saisir le 1er nombre"
	Lire nombreA
	Ecrire "saisir le 2eme nombre"
	Lire nombreB
	Debut Si
		Si nombreA = nombreB
		Alors Ecrire "nombreA et nombreB sont égaux"
		Sinon Si nombreA > nombreB
		Alors Ecrire nombreB," "nombreA
		Sinon Ecrire nombreA," "nombreB
	Fin Si
Fin du programme
	 */

	public static void main(String[] args) {
		int nombreA,nombreB;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le 1er nombre");
		nombreA = sc.nextInt();
		System.out.println("Saisir le 2eme nombre");
		nombreB = sc.nextInt();
		if(nombreA == nombreB)
		{
			System.out.println("Les deux nombres sont égaux");
		}
		else if(nombreA > nombreB)
		{
			System.out.println(nombreB+" "+nombreA);
		}
		else
		{
			System.out.println(nombreA+" "+nombreB);
		}
		sc.close();
	}

}
