package exercice_fonctions_et_procedures_ex_4_moi;

import java.util.Scanner;

public class App {
	/*
	 
	  Fonction:
	  
	  booleen bissextile ( reel annee )	  
	  fonctionBissextile est un booleen
	  
	  fonctionBissextile<--(annee%4==0 && annee%100!=0 || annee%400==0)
	  
	  retourne fonctionBissextile
	  
	  Fin Fonction
	  
	  Declaration des variables
	  
	  int annee;
	  
	  Debut programme
	  
	  Ecrire "Saisir annee"
	  Lire "annee"
	  
	  si fonctionBissextile == vrai
	  	Ecrire "L annee est bissextile"
	  sinon
	 	Ecrire "L annee n est pas bissextile"
	 	
	  Fin du programme
	  	
	*/
	public static boolean bissextile(int annee)
	{
		boolean fonctionBissextile = (annee%4==0 && annee%100!=0 || annee%400==0);
		return fonctionBissextile;
	}
	public static void main(String[] args)
	{
		int annee;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Saisir le nombre d annee: ");
		annee = sc.nextInt();
		
		if (bissextile(annee))
		{
			System.out.println("le nombre d annee est bissextile");
		}
		else 
		{
			System.out.println("le nombre d annee n est pas bissextile");
		}
		
		sc.close();
	}

}
