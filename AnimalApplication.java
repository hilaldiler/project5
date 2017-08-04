package tr.org.kamp.linux.Animals;

public class AnimalApplication {
	
	public static void main(String[] args) {
		Cat sari = new Cat("Sarı", "Sarı", "Sarı", 3, "Düz kedi");
		Snake bill = new Snake("Gill Bates", "Kırmızı", "Kırmızı", 60, "Sinsi yılan");
		Canary canary = new Canary("Maviş", "Beyaz", "Mavi", 2, "İlginç kanarya");
		
		sari.meow();
		sari.hunt();
		
		bill.eatPlants();
		
		canary.fly();
	}

}