package exercice_tableau_8;

import java.util.Scanner;

public class App {
	/*
	 Variables
	nb est un entier
	i est un entier
	posMax est un entier
	tab[] est un tableau d'entier
Debut du programme
	Ecrire "Saisir le nombre de valeur du tableau :"
	Lire nb
	tab[] <-- tab[nb]
Debut pour
	Pour i allant de 0 à nb - 1
		Ecrire "Saisir le nombre n° ",i+1
		Lire tab[i]
	i Suivant
Fin pour
	posMax <-- 0
Debut pour
	pour i allant de 0 à nb-1
	Debut Si
		Si tab[i] > tab[posMax]
		Alors posMax <-- i
	Fin Si
	i suivant
Fin pour
	Ecrire "Le nombre le plus grand : ",tab[posMax]
	Ecrire "il est à l'index : ",posMax
Fin du programme
	 */

	public static void main(String[] args) {
		int nb;
		int i;
		int posMax;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le nombre de valeur du tableau : ");
		nb = sc.nextInt();
		
		int tab[] = new int[nb];
		
		for(i = 0; i < tab.length;i++)
		{
			System.out.println("Saisir le nombre n° "+(i+1));
			tab[i] = sc.nextInt();
		}
		posMax = 0;
		for(i = 0; i < tab.length;i++)
		{
			if(tab[i] > tab[posMax])
			{
				posMax = i;
			}
		}
		System.out.println("Le nombre le plus grand est : "+tab[posMax]);
		System.out.println("Il est à l'index : "+posMax);
		sc.close();
	}

}
