package jalon_algo_4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		double position;
		double nb;
		String resultat;
		double nbPrecedent;
		double nbCourant;
		double nbSuivant;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("combien voulez vous afficher de nombres: ");
		nb = sc.nextDouble();
		position = 2;
		resultat = "\t0\n\t1";
		nbPrecedent = 0;
		nbCourant = 1;
		
		if (nb > 2)
		{
			  while  ( position < nb )
			  {			 
			 
				  nbSuivant = nbPrecedent + nbCourant;
				  resultat = resultat + "\n\t" + nbSuivant;
				  nbPrecedent = nbCourant;
				  nbCourant = nbSuivant;
				  position = position + 1;
			  }  
		}
	    else
	    {
	          nb = 2;			  
		}
		System.out.println("les " + nb + "premiers nombres de la suite fibonacci sont \n " + resultat );
		sc.close();
	}
}