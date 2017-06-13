package Factory;

import animals.Animal;
import animals.Bear;

/**
 * OmnivoreFactory class, implements AbstractZooFactory
 * @author Elon Avisror
 *
 */

public class OmnivoreFactory implements AbstractZooFactory
{
	@Override
	public Animal produceAnimal(String type)
	{
		if ("Bear".equals(type))
			return new Bear();
	    return null;
	}
} //class OmnivoreFactory implements AbstractZooFactory