package Memento;

import java.util.ArrayList;

import animals.Animal;
import food.EFoodType;
import food.IEdible;
import graphics.*;
import mobility.Point;
public class ZooMemento {
	   private EFoodType food;
	   private int index;
	   private ArrayList<Animal> animals;
	   public ZooMemento(ArrayList<Animal> an,EFoodType fd, int _index){
		   	animals = new ArrayList<Animal>();
		   	for(Animal animal: an){
		   		Animal new_animal = (Animal) animal.clone();
		   		new_animal.setLocation(new Point(animal.getLocation().getX(),animal.getLocation().getY()));
		   		animals.add(new_animal);
		   	}
		   	this.food = fd;
		   	this.index=_index;
	   }
	   public int getIndexofFood(){
		   return index;
	   }
	   public ArrayList<Animal> getAnimalList(){
		   return this.animals;
	   }
	   public EFoodType getFood(){
		   return this.food;
	   }
}