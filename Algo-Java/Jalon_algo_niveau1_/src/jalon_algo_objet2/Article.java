package jalon_algo_objet2;

public class Article {

	// variables

	private String reference;
	private String designation;
	private double prixHt;
	private static double tauxTva = 0;

	// constructeur par defaut

	public Article() {
		reference = "inconnu";
		designation = "inconnu";
		prixHt = 0.0;
	}
	// constructeur avec parametres

	public Article(String _reference, String _designation, double _prixHt) {
		reference = _reference;
		designation = _designation;
		prixHt = _prixHt;
	}
	//getters et setters

	public String getreference() 
	{
	return reference;
	}
	public String getdesignation() 
	{
	return designation;	
	}
	public double getprixHt() 
	{
	return prixHt;	
	}
	public static double gettauxTva() 
	{
	return tauxTva;	
	}
	public void setreference(String _reference)
	{
	reference = _reference;	
	}
	public void setdesignation(String _designation)
	{
	designation = _designation;	
	}
	public void setprixHt(double _prixHt)
	{
	prixHt = _prixHt;	
	}
	public static void settauxTva(double _tauxTva)
	{
	tauxTva = _tauxTva;	
	}
	

	// methode prix ttc
	public double calculerPrixTtc() {
		double prixTtc = this.prixHt + (this.prixHt * tauxTva / 100);
		return prixTtc;
	}

	public void afficher() {
		System.out.println("Reference: " + this.reference + "\nDesignation: " + this.designation + "\nPrixHT: " + this.prixHt + "\nPrixTTC: " + this.calculerPrixTtc());
	}
}
