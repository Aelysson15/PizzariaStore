package map;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();
 
	void prepare() {
		System.out.println("Preparar " + name);
		System.out.println("Colocar massa...");
		System.out.println("Adiciona molho...");
		System.out.println("Adiciona cobertura: ");
		for (String topping : toppings) {
			System.out.println("   " + topping);
		}
	}
  
	void bake() {
		System.out.println("Asse por 25 minutos a 350");
	}
 
	void cut() {
		System.out.println("Corte a pizza");
	}
  
	void box() {
		System.out.println("Coloque a pizza na caixa");
	}
 
	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
	}
}