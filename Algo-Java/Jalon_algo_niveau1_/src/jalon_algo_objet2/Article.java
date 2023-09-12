package jalon_algo_objet2;

public class Article {	
	
	//variables
	
	String reference;
	String designation;
	double prixHt;
	double tauxTva;
	double prixTtc;
	
	
	//constructeur par defaut
	
	public Article()
	{
	reference = "inconnu";
	designation = "inconnu";
	prixHt = 0.0;
	tauxTva = 0.0;
	}
	//constructeur avec parametres
	
	public Article(String _reference, String _designation, double _prixHt, double _tauxTva)
	{
	reference = _reference;
	designation = _designation;
	prixHt = _prixHt;
	tauxTva = _tauxTva; 
	}
	
	//methode prix ttc
	public double calculerPrixTtc()
	{
	this.prixTtc = this.prixHt + (this.prixHt*tauxTva/100);
	return prixTtc; 
	}
	public void afficher()
	{
		if(reference == article1)
	{
	System.out.println("l'article" + article1 + " est un " + this.designation + "de reference" + this.reference);
	}	
	   else
	{	  
	System.out.println("l'article" + article2 + " est un " + this.designation + "de reference" + this.reference);	
    }
	}		
}

