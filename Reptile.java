package tr.org.kamp.linux.Animals;

public abstract class Reptile extends Animal {
	

	public Reptile(String name, String eyeColor, String furColor, int age, String species) {
		super(name, eyeColor, furColor, age, species);
		// TODO Auto-generated constructor stub
	}

	abstract void crawl();

}