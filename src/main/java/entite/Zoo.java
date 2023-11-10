package entite;

import java.util.ArrayList;
import Enums.TypeAnimal;

public class Zoo {
	int visiteurs;
	ArrayList<Secteur> secteursAnimaux;
	int nbVisiteurMaxParSecteur;
	
	Zoo(int visiteurs, ArrayList<Secteur> secteursAnimaux, int nbVisiteurMaxParSecteur)
	{
		this.visiteurs = visiteurs;
		this.secteursAnimaux = secteursAnimaux;
		this.nbVisiteurMaxParSecteur = nbVisiteurMaxParSecteur;
	}
	
	void ajouterSecteur(TypeAnimal a)
	{
		Secteur s = new Secteur(a);
		secteursAnimaux.add(s);
	}
	
	void nouveauVisiteur()
	{
		visiteurs++;
	}
	
	int getLimiteVisiteur()
	{
		return 0;
	}
	
	void nouvelAnimal(Animal a)
	{
		for(Secteur s : secteursAnimaux) {
			if(a.getTypeAnimal() == s.obtenirType()) {
				s.ajouterAnimal(a);
			}
		}
	}
	
	int nombreAnimaux()
	{
		int nombreAnimaux = 0;
		for(Secteur s : secteursAnimaux) {
			nombreAnimaux += s.getNombreAnimaux();
		}
		return nombreAnimaux;
	}
	
	
	
	
	
	
}
