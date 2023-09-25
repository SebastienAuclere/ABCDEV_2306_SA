package exemple_heritage;

public class Animal {
	//Les attributs
	protected String espece;
	protected String communiquePar;
	protected String nourriture;
	protected String seDeplaceComment;
	//Constructeur sans parametres
	public Animal()
	{
		espece = "aucun";
		communiquePar = "aucun";
		nourriture = "aucun";
		seDeplaceComment = "aucun";
	}
	//Constructeur avec parametres
	public Animal(String _espece,String 
			_communiquePar,String _nourriture,String _seDeplaceComment)
	{
		this.espece = _espece;
		this.communiquePar = _communiquePar;
		this.nourriture = _nourriture;
		this.seDeplaceComment = _seDeplaceComment;
	}
	//Getters & Setters
	public String getEspece()
	{
		return this.espece;
	}
	public String getCommuniquePar()
	{
		return this.communiquePar;
	}
	public String getNourriture()
	{
		return this.nourriture;
	}
	public String getSeDeplaceComment()
	{
		return this.seDeplaceComment;
	}
	public void setEspece(String _espece)
	{
		this.espece = _espece;
	}
	public void setCommuniquePar(String _communiquePar)
	{
		this.communiquePar = _communiquePar;
	}
	public void setNourriture(String _nourriture)
	{
		this.nourriture = _nourriture;
	}
	//Methodes
	public void mange()
	{
		System.out.println(this.espece  + " est un animal qui mange : " + this.nourriture);
	}
	public void seDeplace()
	{   
		System.out.println("L'animal " + this.espece + " se deplace " + this.seDeplaceComment);
	}
	public void communique()
	{
		System.out.println("L'animal " + this.espece + " " + this.communiquePar + " pour communiquer");
	}	
}
