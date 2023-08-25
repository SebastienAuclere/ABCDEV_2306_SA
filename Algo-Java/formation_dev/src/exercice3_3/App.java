package exercice3_3;

import java.util.Scanner;

public class App {
	/*
	Declaration des variables
	
	   nombre est un entier
	   index est un entier
	   resultat est un booleen
	 
	Debut du programme
	 
	   int[]tabNombre = new int[5]
	   tab Nombre[0]="1"
	   tab Nombre[1]="2"
		   tab Nombre[2]="3"
		   tab Nombre[3]="4"
		   tab Nombre[4]="5"
		 
		 Ecrire Saisir "nombre"
		 Lire nombre   		 		
	 
    Debut boucle for
      Pour ( i=0 ; i<=tab nombre.length-1 ; i++ )
 	  	{
 	  	if(i=nombre-1) 
 	     	{
 	     	System.out.println("l'index du nombre"+nombre+"est"+index);
 	     	}
 	    else
 	     	{
 	     	System.out.println("404 not found")
 	     	}
 	    }	 	 
      fin boucle for
   fin du programme
	*/
	public static void main(String[] args) {
	
	   int nombre;
	   	   
	   Scanner sc = new Scanner(System.in);
	   
	   int []tabNombre = new int [5];
	   tabNombre [0] = 1;
	   tabNombre [1] = 2;
	   tabNombre [2] = 3;
	   tabNombre [3] = 4;
	   tabNombre [4] = 5;
	   
	   System.out.println("Saisir nombre");
	   nombre = sc.nextInt();
	   
	   for (int i = 0 ; i<=tabNombre.length-1;i++)
	   {
		   if(nombre-1==i)
		   {
			   System.out.println("l index du nombre"+nombre+"est"+i);
		   }
		   else
		   {
			   System.out.println("404 not found");			   
		   }
	   }
	   sc.close();
	}

}
