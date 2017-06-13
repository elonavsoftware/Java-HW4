/*(Assignment: 4 || Campus: Beer Sheva || Author:  Mahdi Asali, Elon Avisror || ID: 206331795, 305370801)*/

package diet;

import animals.Animal;
import food.EFoodType;
import food.IEdible;

/**
 * Carnivore class, implements IDiet
 * @author Mahdi Asali
 *
 */

public class Carnivore implements IDiet
{
	/*
	 * (non-Javadoc)
	 * 
	 * @see diet.IDiet#canEat(food.IFood)
	 */
	@Override
	public boolean canEat(IEdible food) { return (food.getFoodtype() == EFoodType.MEAT); }
	public boolean canEat(EFoodType food_type) { return food_type == EFoodType.MEAT; }

	/*
	 * (non-Javadoc)
	 * 
	 * @see diet.IDiet#eat(food.IFood)
	 */
	@Override
	public boolean eat(Animal animal, IEdible food)
	{
		boolean isSuccess = canEat(food);
		if (isSuccess)
			animal.setWeight(animal.getWeight() * 1.1);
		return isSuccess;
	}

	@Override
	public String toString() { return "[" + this.getClass().getSimpleName() + "]"; }
} //class Carnivore implements IDiet