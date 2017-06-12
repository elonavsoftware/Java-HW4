package Factory;

import animals.Animal;
import animals.Bear;

public class OmnivoreFactory implements AbstractZooFactory {

	@Override
	public Animal produceAnimal(String type) {
		// TODO Auto-generated method stub
		if("Bear".equals(type))
			return new Bear();
	    return null;
	}

}
