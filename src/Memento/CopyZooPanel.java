package Memento;

import java.util.ArrayList;

import animals.Animal;
import food.EFoodType;
import food.IEdible;

public class CopyZooPanel {
	protected ArrayList <Animal> animalsarr;
	protected EFoodType foodarr;
	public CopyZooPanel(ArrayList <Animal> animals,EFoodType food)
	{
		animalsarr = new ArrayList<Animal>();
		//cloning animals
		for(int i=0; i<animals.size();i++)
		{
			
			this.animalsarr.add((Animal)(animals.get(i)).clone());
		}
		this.foodarr=food; //by reference.
	}
	
	public ArrayList<Animal> getAnimals(){
		return animalsarr;
	}
	public EFoodType getFood(){
		return foodarr;
	}
}
