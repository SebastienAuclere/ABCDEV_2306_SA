package exemple_heritage;

public class Canide extends Animal {
	//Les attributs		
	private String nom;
	private int age;
	//Constructeur sans parametres
	public Canide()
	{
		super();
		nom = "aucun";
		age = 0;
	}
	//Constructeur avec parametres
	public Canide(String _espece,String _communiquePar,String _nourriture,String _seDeplaceComment,String _nom, int _age)
	{
		super(_espece,_communiquePar,_nourriture,_seDeplaceComment);
		this.nom = _nom;
		this.age = _age;
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
	public int getAge()
	{
		return this.age;
	}
	public void setAge(int _anneeAAjouter)
	{
		this.age += _anneeAAjouter;
	}
	public String toString()
	{
		return "Le chien " + this.getNom() + " a " + this.getAge() + " ans. ";
	}
}
