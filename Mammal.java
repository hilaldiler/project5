package tr.org.kamp.linux.Animals;

public abstract class Mammal extends Animal {

	public Mammal(String name, String eyeColor, String furColor, int age, String species) {
		super(name, eyeColor, furColor, age, species);
	}

	abstract void giveBirth();

}