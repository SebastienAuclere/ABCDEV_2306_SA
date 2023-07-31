package exercice_tableau_9;

import java.util.Scanner;

public class App {
	/*
	 Variables
	nb est un entier
	i est un entier
	nbSupMoyenne est un entier
	somme est un entier
	moyenne est un entier
	tab[] est un tableau d'entier
Debut du programme
	Ecrire "Saisir le nombre de notes à saisir :"
	Lire nb
	tab[] <-- tab[nb]
Debut pour
	Pour i allant de 0 à nb - 1
		Ecrire "Saisir la note n° ",i+1
		Lire tab[i]
	i Suivant
Fin pour
	somme <-- 0
Debut pour
	pour i allant de 0 à nb - 1
	somme <-- somme + tab[i]
	i suivant
Fin pour
	moyenne <-- somme/nb
	nbSupMoyenne <-- 0
Debut pour
	pour i allant de 0 à nb - 1
	Debut Si
		Si tab[i] > moyenne
		Alors nbSupMoyenne <-- nbSupMoyenne + 1
	Fin Si
	i suivant
Fin pour
	Ecrire nbSupMoyenne, " eleves depassent la moyenne de la classe"
Fin du programme 
	 */

	public static void main(String[] args) {
		int nb;
		int i;
		int nbSupMoyenne;
		int somme;
		int moyenne;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Saisir le nombre de notes à saisir : ");
		nb = sc.nextInt();
		
		int tab[] = new int[nb];
		
		for(i = 0; i < tab.length;i++)
		{
			System.out.println("Saisir la note n° "+(i+1));
			tab[i] = sc.nextInt();
		}
		
		somme = 0;
		for(i = 0; i < tab.length; i++)
		{
			somme = somme + tab[i];
		}
		moyenne = somme/nb;
		nbSupMoyenne = 0;
		for(i = 0; i< tab.length;i++)
		{
			if(tab[i]>moyenne)
			{
				nbSupMoyenne++;
			}
		}
		System.out.println(nbSupMoyenne+" eleves depassent la moyenne de la classe ");
		
		sc.close();
	}

}
