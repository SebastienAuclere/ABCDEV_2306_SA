package exercice_tableau_7;

import java.util.Scanner;

public class App {
	/*
	 Variables
	nb est un entier
	i est un entier
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
	Ecrire "Nouveau tableau : "
Debut pour 
	pour i allant de 0 à nb-1
		tab[i] <-- tab[i]+1
	Ecrire tab[i]
	i suivant
Fin pour
Fin du programme
	 */

	public static void main(String[] args) {
		int nb;
		int i;
		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Saisir le nombre de valeur du tableau : ");
		nb = sc.nextInt();
		
		int tab[] = new int[nb];
		
		
		
		for(i = 0; i < tab.length;i++)
		{
			System.out.println("Saisir le nombre n° "+(i+1));
			tab[i] = sc.nextInt();
		}
		System.out.println("Nouveau tableau : ");
		
		for(i = 0; i < tab.length;i++)
		{
			tab[i] = tab[i]+1;
			System.out.println(tab[i]);
		}
		sc.close();
	}

}
