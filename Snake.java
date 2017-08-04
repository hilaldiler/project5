package tr.org.kamp.linux.Animals;

public class Snake extends Reptile implements Herbivore, Carnivore {

	public Snake(String name, String eyeColor, String furColor, int age, String species) {
		super(name, eyeColor, furColor, age, species);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hunt() {
		System.out.println(getName() + " avlanıyor");

	}

	@Override
	public void eatPlants() {
		System.out.println(getName() + " bitki yiyor");

	}

	@Override
	void crawl() {
		System.out.println(getName() + " sürünüyor");

	}

}