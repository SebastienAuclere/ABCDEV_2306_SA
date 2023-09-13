package jalon_algo_objet2;

public class App {
	
	public static void main(String[] args) 
	{		
		Article article1 = new Article("U26","fourchette",2.0);
		Article article2 = new Article("U27","couteau",2.5);
		Article.settauxTva(20);
		
		article1.afficher();
		article2.afficher();
	
	
	System.out.println("L article 1 " + article1.getreference() + " est une " + article1.getdesignation() + " d'une valeur de " + article1.calculerPrixTtc() + "€.");
	System.out.println("L article 2 " + article2.getreference() + " est une " + article2.getdesignation() + " d'une valeur de " + article2.calculerPrixTtc() + "€.");
	}
}