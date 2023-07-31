package exercice_tableau_4;

import java.util.Scanner;

public class App {
	/*
	 Variables
	nb est un entier
	somme est un entier
	i est un entier
	tab[] est un tableau d'entier
Debut du programme
	Ecrire "Saisir le nombre de valeur du tableau :"
	Lire nb
	tab[] <-- tab[nb]
Debut pour
	pour i allant de 0 à nb
	Ecrire "Saisir le nombre n° ",i+1
	Lire tab[i]
	somme <-- somme + tab[i]
	i suivant
Fin pour
	Ecrire "La somme des elements du tableau est : ",somme
Fin du programme
	 */

	public static void main(String[] args) {
		int nb;
		int somme;
		int i;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Saisir le nombre de valeur du tableau : ");
		nb = sc.nextInt();
		
		int tab[] = new int[nb];
		
		somme = 0;
		
		for(i = 0; i < tab.length;i++)
		{
			System.out.println("Saisir le nombre n° "+(i+1));
			tab[i] = sc.nextInt();
			somme = somme + tab[i];
		}
		System.out.println("La somme des valeurs du tableau est "+somme);
		
		sc.close();

	}

}
