package entite;

import Enums.TypeAnimal;
import java.util.ArrayList;

public class Secteur {
	TypeAnimal typeAnimauxDansSecteur;
	ArrayList<Animal> animauxDansSecteur;
	
	Secteur(TypeAnimal typeAnimauxDansSecteur)
	{
		this.typeAnimauxDansSecteur = typeAnimauxDansSecteur;
		this.animauxDansSecteur = new ArrayList<Animal>();
	}
	
	void ajouterAnimal(Animal a)
	{
		animauxDansSecteur.add(a);
	}
	
	int getNombreAnimaux()
	{
		return animauxDansSecteur.size();
	}
	
	TypeAnimal obtenirType()
	{
		return typeAnimauxDansSecteur;
	}
}
