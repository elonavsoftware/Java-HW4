package Factory;

import animals.Animal;
import animals.Lion;

public class CarnivoreFactory implements AbstractZooFactory {
	
	@Override
	public Animal produceAnimal(String type) {
		// TODO Auto-generated method stub
		if("Lion".equals(type))
			return new Lion();
		return null;
	}

}
