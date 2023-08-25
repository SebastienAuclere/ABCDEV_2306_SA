package exercice_objet_bouteille;

public class Bouteille {
	//Declaration des variables	
	private String nom;
	private double capaciteEnL;
	private double contenanceEnL;
	private boolean estOuverte;
	//Declaration constructeur par defaut
	public Bouteille()
	{
		System.out.println("Creation d'une bouteille par defaut");
		nom = "inconnu";
		capaciteEnL = 0;
		contenanceEnL = 0;
		estOuverte = false;
	}
	//Declaration constructeur avec parametres
	public Bouteille(String _Nom, double _CapaciteEnL, double _ContenanceEnL, boolean _EstOuverte)
	{
		System.out.println("Creation d'une bouteille avec des parametres");
		nom = _Nom;
		capaciteEnL = _CapaciteEnL;
		contenanceEnL = _ContenanceEnL;
		estOuverte = _EstOuverte;
	}
	
	
}
