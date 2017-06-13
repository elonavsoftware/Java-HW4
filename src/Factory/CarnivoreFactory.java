package Factory;

import animals.Animal;
import animals.Lion;

/**
 * CarnivoreFactory class, implements AbstractZooFactory
 * @author Elon Avisror
 *
 */

public class CarnivoreFactory implements AbstractZooFactory
{
	@Override
	public Animal produceAnimal(String type)
	{
		if ("Lion".equals(type))
			return new Lion();
		return null;
	}
} //class CarnivoreFactory implements AbstractZooFactory
