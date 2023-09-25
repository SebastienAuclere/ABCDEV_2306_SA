package exemple_heritage;

public class Insecte extends Animal {
	//Les attributs
	private String troisPairesDeJambes;
	//Constructeur sans parametres
	public Insecte()
	{
		super();
		troisPairesDeJambes = "inconnu";
	}
	//Constructeur avec parametres
	public Insecte(String _espece,String _communiquePar,String _nourriture,String _seDeplaceComment,String _troisPairesDeJambes)
	{
		super(_espece,_communiquePar,_nourriture,_seDeplaceComment);
		this.troisPairesDeJambes = _troisPairesDeJambes;
	}
	//Getters & Setters
	public String getTroisPairesDeJambes()
	{
		return this.troisPairesDeJambes;
	}
	public void setTroisPairesDeJambes(String _troisPairesDeJambes)
	{
		this.troisPairesDeJambes = _troisPairesDeJambes;
	}	
}
