package exercice_objet_ville;

public class Ville {
	
	private String nomVille;	// stocke nom de la ville
	private String nomPays;		// stocke nom du pays
	private int nbHabitants;	// stocke nombre d'habitants
	
	public Ville()		// constructeur par defaut
	{
		System.out.println("Creation d'une ville par defaut");
		nomVille = "inconnu";
		nomPays = "inconnu";
		nbHabitants = 0;
	}
	
	// constructeur avec parametres
	// ajouter _ en 1ere lettre des parametres
	// ce n'est pas une convention mais cela permet de les reperer
	
	public Ville(String _Nom, int _nbre, String _NomPays)
	{
		System.out.println("Creation d'une ville avec des parametres");
		nomVille = _Nom;
		nomPays = _NomPays;
		nbHabitants = _nbre;
	}
	public String getNomVille() 
	{
	return nomVille;
	}
	public String getNomPays() 
	{
	return nomPays;	
	}
	public int getNbHabitants() 
	{
	return nbHabitants;	
	}
	public void setNomVille(String _Nom)
	{
	nomVille = _Nom;	
	}
	public void setNomPays(String _NomPays)
	{
	nomPays = _NomPays;	
	}
	public void setNbHabitants(int _NbHabitants)
	{
	nbHabitants = _NbHabitants;	
	}
	

}
