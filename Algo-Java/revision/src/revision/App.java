package revision;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	 /* 
	 * Variables
	 * 
	 * r est un réel double
	 * PI est une constante
	 * aire est un réel double
	 * volume est un réel double
	 * 
	 * Début programme
	 * 
	 * Lire rayon
	 * Lire PI
	 * aire<--4PIr^2
	 * volume<--(4/3)PIr^3
	 * Ecrire "L'aire et le volume sont respectivement: "+aire+"et"+volume+"."
	 * 
	 * Fin du programme
	 * 
	 */
	 //Déclaration des Variables:
		int rayon;	    
	    double aire;
	    double volume;
	 //Déclaration des Constantes:   
	    final double pi= Math.PI;
	 //Déclaration scanner:
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Saisir le rayon: ");
	    rayon = sc.nextInt();
	    
	    aire = 4d*pi*Math.pow(rayon, 2);
	    aire = Math.round(aire*100.00)/100.0;
	    volume =(4/3d)*pi*Math.pow(rayon, 3); 
	 //je peux declarer aussi pour deux decimale après la "," : volume = Math.round(volume*100.00)/100.0;
	    System.out.println("L'aire et le volume sont respectivement: " + aire +" et " + volume);
	 //fermer scanner   
	    sc.close();
	}

}
