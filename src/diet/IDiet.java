package diet;

import animals.Animal;
import food.EFoodType;
import food.IEdible;

/**
 * IDiet interface, for animals
 * @author Elon Avisror
 *
 */

public interface IDiet
{
	/**
	 * @param food
	 * @return
	 */
	public boolean canEat(IEdible food);

	/**
	 * @param food
	 * @return
	 */
	public boolean eat(Animal animal, IEdible food);
	
	/**
	 * 
	 * @param food_type
	 * @return
	 */
	public boolean canEat(EFoodType food_type);
} //interface IDiet