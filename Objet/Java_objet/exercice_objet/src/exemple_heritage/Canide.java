package exemple_heritage;

public class Canide extends Animal {
	//Les attributs		
	private String nom;
	//Constructeur sans parametres
	public Canide()
	{
		super();
		nom = "aucun";			
	}
	//Constructeur avec parametres
	public Canide(String _espece,String _communiquePar,String _nourriture,String _seDeplaceComment,String _nom)
	{
		super(_espece,_communiquePar,_nourriture,_seDeplaceComment);
		this.nom = _nom;
	}
	//Getters & Setters
	public String getNom()
	{
		return this.nom;
	}		
	public void setNom(String _nom)
	{
		this.nom = _nom;
	}	
}
