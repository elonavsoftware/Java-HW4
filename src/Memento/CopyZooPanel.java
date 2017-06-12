package Memento;

import java.util.ArrayList;

import animals.Animal;
import food.EFoodType;
import food.IEdible;
import mobility.Point;

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
			this.animalsarr.get(i).setLocation(new Point(this.animalsarr.get(i).getLocation().getX(),this.animalsarr.get(i).getLocation().getY()));
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
