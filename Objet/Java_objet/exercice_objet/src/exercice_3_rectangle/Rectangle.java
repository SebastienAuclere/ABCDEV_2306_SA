package exercice_3_rectangle;

public class Rectangle {
	
	//variables
	
	double longueur;
	double largeur;
	double surface;
	double perimetre;
	
	//constructeur avec parametres
	
	public Rectangle(double _longueur,double _largeur) {
		
		this.longueur = _longueur;
		this.largeur = _largeur;
		}
	
	//methode surface
	
	public double calculerSurface() {
		
		surface = this.longueur*this.largeur;
		return surface;
	}
	
	//methode perimetre
	
	public double calculerPerimetre() {
		
		perimetre = (this.longueur+this.largeur)*2;
		return perimetre;
	}
	
	//methode afficher
	
	public void calculerAfficher() {
		
		System.out.println("Le rectangle a une surface de: " + this.calculerSurface() + " cm2 et un perimetre de" + this.calculerPerimetre() + " en cm.");
		
	}
}
