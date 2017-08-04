package tr.org.kamp.linux.Animals;

public class Canary extends Bird implements Herbivore {

	public Canary(String name, String eyeColor, String furColor, int age, String species) {
		super(name, eyeColor, furColor, age, species);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eatPlants() {
		System.out.println(getName() + " bitki yiyor");

	}

	@Override
	void fly() {
		System.out.println(getName() + " uçuyor");

	}

	@Override
	void tweet() {
		System.out.println(getName() + ": cik cik cik");

	}

}