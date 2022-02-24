# Design-pattern
###Solid Design principals
	- Single Responsibility
		^ A class should only have one responsibility. 
		^ It should only have one reason to change.
	- Open/Closed
		^ Classes should be open for extension but closed for modification.
		^ In doing so, we stop ourselves from modifying existing code and causing potential new bugs
	- Liskov Substitution
		^ if class A is a subtype of class B
			class A implements B {
			}
		^ objects of a superclass shall be replaceable with objects of its subclasses without breaking the application
		^ Ex. we should be able to replace B with A without disrupting the behavior of our program.	
	- Interface Segregation
		^ larger interfaces should be split into smaller ones. 
		^ By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them.
	- Dependency Inversion
		^ High-level modules should not depend on low-level modules. 
		^ Both should depend on abstractions
### Singleton
	- Refer workspace
### Observer
### Strategy
	- Refer workspace
### Builder
	- Refer workspace
### Factory
### Abstract Factory
### Decorator
### Adapter