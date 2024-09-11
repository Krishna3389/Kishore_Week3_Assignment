package assignment3;

public class BikePizzaDelivery extends PizzaDelivery implements Delivarable{

	public BikePizzaDelivery(String customerName, String address, String pizzaType) {
		super(customerName, address, pizzaType);
		
	}

	
	public void deliver() {
		 System.out.println("Processing payment for " + customerName + " via credit card.");
    }
		
	


	void processPayment() {
		System.out.println("Delivering the pizza by bike to " + address + ".");
		
	}

}
