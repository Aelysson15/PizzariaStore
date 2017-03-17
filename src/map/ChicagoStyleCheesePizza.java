package map;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() { 
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Massa grosa";
		sauce = "Molho de tomate";
 
		toppings.add("Queijo Mozzarella");
	}
 
	void cut() {
		System.out.println("Corte a pizza em fatias grandes");
	}
}