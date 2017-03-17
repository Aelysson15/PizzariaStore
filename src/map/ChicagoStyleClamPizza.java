package map;

public class ChicagoStyleClamPizza extends Pizza {
	public ChicagoStyleClamPizza() {
		name = "Chicago Style Clam Pizza";
		dough = "Massa grossa";
		sauce = "Molho de tomato";
 
		toppings.add("Mozzarella");
		toppings.add("Frozen Clams from Chesapeake Bay");
	}
 
	void cut() {
		System.out.println("mechilhões congelados");
	}
}