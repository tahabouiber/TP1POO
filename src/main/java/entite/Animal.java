package entite;

import Enums.TypeAnimal;

public class Animal {
	String nomAnimal;
	TypeAnimal typeAnimal;
	
	Animal(String nomAnimal, TypeAnimal typeAnimal)
	{
		this.nomAnimal = nomAnimal;
		this.typeAnimal = typeAnimal;
	}
	
	String getNomAnimal()
	{
		return nomAnimal;
	}
	
	TypeAnimal getTypeAnimal()
	{
		return typeAnimal;
	}
}
