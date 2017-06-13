/*(Assignment: 4 || Campus: Beer Sheva || Author:  Mahdi Asali, Elon Avisror || ID: 206331795, 305370801)*/

package Memento;

import java.util.ArrayList;
import animals.Animal;
import food.EFoodType;
import mobility.Point;

/**
 * ZooMemento class
 * @author Mahdi Asali
 *
 */

public class ZooMemento
{
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
	   
	   /**
	    * 
	    * @return
	    */
	   public int getIndexofFood() { return index; }
	   
	   /**
	    * 
	    * @return
	    */
	   public ArrayList<Animal> getAnimalList() { return this.animals; }
	   
	   /**
	    * 
	    * @return
	    */
	   public EFoodType getFood() { return this.food; }
} //class ZooMemento