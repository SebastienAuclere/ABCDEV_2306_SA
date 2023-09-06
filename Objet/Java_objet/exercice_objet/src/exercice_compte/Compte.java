package exercice_compte;

public class Compte 
{
//Declaration des variables
	public String numeroDeCompte;
	public double solde;
	public int creditMax;
	public int debitMin;
	public boolean estSoldeMax;
	public boolean estSoldeMin;
	
//Declaration du constructeur par defaut
	public Compte() 
		{
			numeroDeCompte = "515Z";
			solde = 500;
			creditMax = 10_000;
			debitMin = -100;
			estSoldeMax = false;
			estSoldeMin = false;
//Declaration du constructeur avec parametres		
		}
	public Compte(String _NumeroDeCompte,double _Solde,int _CreditMax,int _DebitMin,boolean _EstSoldeMax,boolean _EstSoldeMin) 
		{
			System.out.println("Création d'un objet compte ");
			numeroDeCompte = _NumeroDeCompte;
			solde = _Solde;
			creditMax = _CreditMax;
			debitMin = _DebitMin;
			estSoldeMax = _EstSoldeMax;
			estSoldeMin = _EstSoldeMin;
		}
	public String afficher() 
		{
		if(numeroDeCompte == "515Z")
		{
			System.out.println(solde);
		}
		}
	
}
    










		



















