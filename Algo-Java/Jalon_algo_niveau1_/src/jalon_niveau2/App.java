package jalon_niveau2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//declaration des variables
				boolean clientNormal;
				boolean etudiant;
				string tarifNormal = 20;
				boolean lundi,mardi,vendredi,samedi;
				boolean jeudi = ((tarifNormal*0.20) + tarifNormal);
				boolean mercredi = ((tarifNormal*0.50) + tarifNormal);
				
				Scanner sc;
				sc = new Scanner(System.in);
				//Scanner sc = new Scanner(System.in);
				
				//debut du programme
				System.out.println("Saisir clientNormal ou etudiant ");
				if(clientNormal) {
					System.out.println( "c'est "+ tarifNormal);
				}
				else if(etudiant + lundi + mardi + vendredi+ samedi){
					System.out.println( "c'est "+ tarifNormal +"lundi,mardi,vendredi et samedi" + lundi + mardi + vendredi + samedi);
				}	
				else if(etudiant + mercredi){
					System.out.println( "le mercredi c'est" +  mercredi);
				}
				else if(etudiant + jeudi){
					System.out.println( "le mercredi c'est" +  jeudi);
				}		 
				sc.close();

	}

}
