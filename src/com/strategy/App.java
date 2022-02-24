package com.strategy;

/**
 * Strategy pattern is useful when we have multiple algorithms for specific task
 * and we want our application to be flexible to chose any of the algorithm at
 * runtime for specific task.
 * 
 * @author Tejas
 *
 */
public class App {

	public static void main(String[] args) {

		// pay by paypal
		PaymentStrategy paymentMethod1 = new PaypalStrategy("myemail@example.com", "mypwd");
		paymentMethod1.pay(10);

		// pay by credit card
		PaymentStrategy paymentMethod2 = new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15");
		paymentMethod2.pay(20);
	}
}
