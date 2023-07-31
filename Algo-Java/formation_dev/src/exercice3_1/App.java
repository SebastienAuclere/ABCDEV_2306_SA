package exercice3_1;

import java.util.Random;
import java.util.Scanner;

public class App 
{

/*
 * VARIABLES
nombre est un entier
sup est un entier
max est un entier
min est un entier
essai est un entier
win est un boolean

DEBUT DU PROGRAMME
nombre <-- est genere aleatoirement
essai = 0
win = false
min = 0
max = 100
Debut boucle
Faire
Ecrire "Saisir un nombre entre 0 et 100"
Lire sup
Debut si
	si nombre est different de sup
		si sup est superieur à nombre
Ecrire "Saisir un nombre compris entre" sup "et" min
max <-- sup
	sinon
ecrire"Saisir un nombre compris entre" max "et" sup
min <-- sup
	si nombre = sup
win <-- vrai
essai <-- essai+1
Tant que win = faux
Ecrire "Bravo, vous avez trouve en" essai  " essais "
Fin du programme

 * 
 */
	
	
	public static void main(String[] args) 
	{
	
// Déclaration des variables
	int nombre;
	int nbJoueur;
	int max;
	int min;
	boolean win;
	int essai;
	
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	
	nombre = random.nextInt(100)+1;

	essai = 0;
	win = false;
	min = 0;
	max = 100;
	
	System.out.println(nombre);
	do 
	{ 
		System.out.println("Saisir un nombre compris entre "+min+" et " +max);
		
		nbJoueur = sc.nextInt();
		
			if(nbJoueur > nombre) 
			{
				System.out.println("C'est moins");
				max = nbJoueur;
			}
			else if(nbJoueur < nombre) 
			{
				System.out.println("C'est plus");
				min = nbJoueur;
			}		
			else 
			{
				win = true;
			}
			essai++; 	
	} while(!win);
	System.out.println("Bravo ! reussi en "+essai+" essais");
	
	sc.close();
	}
}
