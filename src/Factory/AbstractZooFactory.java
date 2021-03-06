/*(Assignment: 4 || Campus: Beer Sheva || Author:  Mahdi Asali, Elon Avisror || ID: 206331795, 305370801)*/

package Factory;

import animals.Animal;

/**
 * AbstractZooFactory interface
 * @author User
 *
 */

public interface AbstractZooFactory
{
	public Animal produceAnimal(String type);
	public static AbstractZooFactory createAnimalFactory(String foodType)
	{
		AbstractZooFactory factory = null;
		switch(foodType)
		{
			case "Plant": //herbivore
				factory =new HerbivoreFactory();
				break;
			case "Mix": //Omnivore
				factory = new OmnivoreFactory();
				break;
			case "Meat": //Carnivore
				factory = new CarnivoreFactory();
				break;
		}
		return factory;
	}
} //interface AbstractZooFactory
