package map;

public class PizzaTest {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Phulano pedio " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Cikrano pedio uma " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("clam");
		System.out.println("Blthrano ordenou uma " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("clam");
		System.out.println("Phulano pedio uma " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("Blthrano pedio uma " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("Cikrano pedio uma " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("veggie");
		System.out.println("Phulano pedio " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Cikrano pedio uma " + pizza.getName() + "\n");
	}
}
