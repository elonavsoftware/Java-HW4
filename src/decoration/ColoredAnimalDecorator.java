package decoration;

import animals.Animal;

public class ColoredAnimalDecorator implements ColoredAnimal{
	private ColoredAnimal coloredAnimal;
	Animal animal;
	public ColoredAnimalDecorator(Animal an) {
		// TODO Auto-generated constructor stub
		this.animal=an;
	}
	

	@Override
	public void PaintAnimal(String color) {
		// TODO Auto-generated method stub
		animal.PaintAnimal(color);
		Animal an =((Animal)animal);
		an.setColor(color);
		String nm=null;
		switch(an.getName()){
		case "Bear":
			nm="bea";
			break;
		case "Elephant":
			nm="elf";
			break;
		case "Giraffe":
			nm="grf";
			break;
		case "Lion":
			nm="lio";
			break;
		case "Turtle":
			nm="trt";
			break;
		}
		an.loadImages(nm);
		}
	}


