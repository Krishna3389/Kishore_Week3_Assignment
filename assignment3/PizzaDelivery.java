package assignment3;

public abstract class PizzaDelivery {
	   String customerName;
	    String address;
	    String pizzaType;

	  
	    public PizzaDelivery(String customerName, String address, String pizzaType) {
	        this.customerName = customerName;
	        this.address = address;
	        this.pizzaType = pizzaType;
	    }

	   
	    abstract void processPayment();

	    
	    public void confirmOrder() {
	        System.out.println("Order for a " + pizzaType + " pizza confirmed for " + customerName + " at " + address + ".");
	    }

}
