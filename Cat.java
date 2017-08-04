package tr.org.kamp.linux.Animals;

public class Cat extends Mammal implements Carnivore {

	public Cat(String name, String eyeColor, String furColor, int age, String species) {
		super(name, eyeColor, furColor, age, species);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hunt() {
		System.out.println(getName() + " avlanıyor");

	}

	@Override
	void giveBirth() {
		System.out.println(getName() + " doğum yapıyor");

	}
	
	void meow() {
		System.out.println(getName() + " miyavlıyor");
	}

}