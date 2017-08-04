package tr.org.kamp.linux.Animals;

public class Deer extends Mammal implements Herbivore {

	public Deer(String name, String eyeColor, String furColor, int age, String species) {
		super(name, eyeColor, furColor, age, species);
		// TODO Auto-generated constructor stub
	}

	@Override
	void giveBirth() {
		System.out.println("");

	}

	@Override
	public void eatPlants() {
		System.out.println();
	}

}