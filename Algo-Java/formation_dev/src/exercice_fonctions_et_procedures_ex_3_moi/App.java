package exercice_fonctions_et_procedures_ex_3_moi;

import java.util.Scanner;

public class App {

	
		/*
		 
		Fonction:
		
		 reel moyenne (reel a , reel b)
		 moy est un reel
		 
		 moy <--( a + b ) / 2
		 
		 retourne moy
		 
		 Fin Fonction
		 
		 Declaration des variables:
		 
		 a est un reel
		 b est un reel
		 		 
		 Debut programme:
		 
		 Ecrire " Saisir a, b "
		 Lire " a, b "
		 		 		 
		 Ecrire" Avec la fonction, la moyenne des deux nombres est : ",moyenne ( a, b )
		 
		 Fin du programme
		 
	    */
		
		public static double moyenne(double a,double b)
		{
			double moy;
			
			moy = (a+b)/2;
			
			return moy;
		}

		public static void main(String[] args) {
			//declaration des variables
			double a;
			double b;
			
			//ouverture du scanner
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Saisir a ");
			a = sc.nextDouble();
			System.out.println("Saisir b ");
			b = sc.nextDouble();
						
			System.out.println("Avec la fonction, la moyenne est: "+moyenne(a,b));		
						
			sc.close();
	}
}


