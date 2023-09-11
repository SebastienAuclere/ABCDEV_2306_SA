package exercice_compte;

public class Compte 
{
//Declaration des variables
	public double solde;
	public final int soldeMax;
	public final int soldeMin;
	//public boolean estSoldeMax;
	//public boolean estSoldeMin;
	//public double valeurAjoutee;
	
//Declaration du constructeur par defaut
	public Compte() 
		{
			solde = 500;
			soldeMax = 10_000;
			soldeMin = -100;
			//estSoldeMax = false;
			//estSoldeMin = false;
			//valeurAjoutee = 0;
//Declaration du constructeur avec parametres		
		}
	public Compte(double _Solde,int _SoldeMax,int _SoldeMin) 
		{
			System.out.println("Création d'un objet compte ");
			this.solde = _Solde;
			this.soldeMax = _SoldeMax;
			this.soldeMin = _SoldeMin;
			//this.estSoldeMax = _EstSoldeMax;
			//this.estSoldeMin = _EstSoldeMin;
			//this.valeurAjoutee = _ValeurAjoutee;
		}
	public boolean afficher() 
		{
			System.out.println(solde);
			return true;
		}
	public boolean deposer(double _ValeurAjoutee)
		{
			if(this.solde + _ValeurAjoutee <= this.soldeMax && _ValeurAjoutee > 0)
			{
				this.solde += _ValeurAjoutee;
				System.out.println(" Le nouveau solde est: " + this.solde);
				return true;
			}
			else
			{
				return false;
			}

		}
	public boolean retirer(double _ValeurAjoutee)
	{
		if(this.solde + _ValeurAjoutee >= this.soldeMin && _ValeurAjoutee < 0)
		{
			this.solde += _ValeurAjoutee;
			System.out.println(" Le nouveau solde est: " + this.solde);
			return true;
		}
		else
		{
			return false;
		}

	}
	
		
	
}
    










		



















