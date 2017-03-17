package map;

public class ChicagoStylePepperoniPizza extends Pizza {
	public ChicagoStylePepperoniPizza() {
		name = "Chicago Style Pepperoni Pizza";
		dough = "Massa grossa";
		sauce = "Molho de tomate";
 
		toppings.add("Mozzarella");
		toppings.add("Azeitonas");
		toppings.add("Espinafre");
		toppings.add("Beringela");
		toppings.add("Pepperoni");
	}
 
	void cut() {
		System.out.println("Corte a oizza em pequenas fatias");
	}
}