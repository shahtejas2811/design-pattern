package com.strategy;

/**
 * 
 * Strategy design pattern is one of the behavioral design pattern. Strategy
 * pattern is used when we have multiple algorithm for a specific task and
 * client decides the actual implementation to be used at runtime.
 * 
 * 
 * Ex: strategy pattern is Collections.sort() method that takes Comparator
 * parameter. Based on the different implementations of Comparator interfaces,
 * the Objects are getting sorted in different ways.
 * 
 * For our example, we will try to implement a simple Shopping Cart where we
 * have two payment strategies – using Credit Card or using PayPal.
 * 
 *
 *
 * 
 */
// setp 1: create the interface for algorithms (Strategy)
public interface PaymentStrategy {
	public void pay(int amount);
}
