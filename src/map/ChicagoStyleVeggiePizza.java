package map;

public class ChicagoStyleVeggiePizza extends Pizza {
	public ChicagoStyleVeggiePizza() {
		name = "Chicago Veggie Pizza";
		dough = "Massa grossa";
		sauce = "Molho de Tomate";
 
		toppings.add("Queijo mozzarella");
		toppings.add("Black Olives");
		toppings.add("Espinafre");
		toppings.add("Berinjela");
	}
 
	void cut() {
		System.out.println("Cortar a pizza em fatias");
	}
}