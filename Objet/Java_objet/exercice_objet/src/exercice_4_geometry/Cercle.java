package exercice_4_geometry;

public class Cercle {

	//variables
	
	Point centre;
	private double rayon;
	private double perimetre;
	private double surface;
	private boolean testAppartenance;
	
	
	//constructeur avec parametres
	
	public Cercle(double _rayon) {
		
		this.rayon = _rayon;
	}
	
	//methodes
	
	public double calculerPerimetre() {
		
		perimetre = 2*Math.PI*this.rayon;
		return perimetre;
	}
	
	public double calculerSurface() {
		
		surface = 4*Math.PI*Math.pow(this.rayon,2);
		return surface;
	}
	
	public void testAppartenance() {
		
		
	}
	
	public void afficher() {
		
		System.out.println("Le cercle a une surface de: " + this.calculerSurface() + " cm2 et un perimetre de" + this.calculerPerimetre() + " en cm.");
	}
}
