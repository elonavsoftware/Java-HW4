package decoration;

import animals.Animal;

/**
 * ColoredAnimalDecorator class, implements ColoredAnimal
 * @author Elon Avisror
 *
 */

public class ColoredAnimalDecorator implements ColoredAnimal
{
	private ColoredAnimal coloredAnimal;
	Animal animal;
	public ColoredAnimalDecorator(Animal an) { this.animal = an; }
	
	@Override
	public void PaintAnimal(String color)
	{
		animal.PaintAnimal(color);
		Animal an = ((Animal)animal);
		an.setColor(color);
		String nm = null;
		switch(an.getName())
		{
			case "Bear":
				nm = "bea";
				break;
			case "Elephant":
				nm="elf";
				break;
			case "Giraffe":
				nm = "grf";
				break;
			case "Lion":
				nm = "lio";
				break;
			case "Turtle":
				nm = "trt";
				break;
		}
		an.loadImages(nm);
	}
} //class ColoredAnimalDecorator implements ColoredAnimal


