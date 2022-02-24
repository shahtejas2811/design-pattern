package com.builder;

/**
 * Builder pattern was introduced to solve some of the problems with Factory and
 * Abstract Factory design patterns when the Object contains a lot of
 * attributes.
 * 
 * There are three major issues with Factory and Abstract Factory design
 * patterns when the Object contains a lot of attributes.
 * 
 * 1. Too Many arguments to pass from client program to the Factory class that
 * can be error prone because most of the time, the type of arguments are same
 * and from client side its hard to maintain the order of the argument. 
 * 
 * 2. Some of the parameters might be optional but in Factory pattern, we are forced to
 * send all the parameters and optional parameters need to send as NULL. 
 * 
 * 3. If the object is heavy and its creation is complex, then all that complexity
 * will be part of Factory classes that is confusing.
 * 
 * We can solve the issues with large number of parameters by providing a
 * constructor with required parameters and then different setter methods to set
 * the optional parameters.
 * 
 */
public class Computer {

	// Required parameters
	private String HDD;
	private String RAM;

	// optinal parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;

	private Computer(ComputerBuilder computerBuilder) {
		this.HDD = computerBuilder.HDD;
		this.RAM = computerBuilder.RAM;
		this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
		this.isGraphicsCardEnabled = computerBuilder.isGraphicsCardEnabled;
	}

	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	/**
	 * Static nested class and then copy all the atributes from the outer class
	 * to the Builder class.
	 * 
	 *
	 */
	public static class ComputerBuilder {

		// Required parameters
		private String HDD;
		private String RAM;

		// optinal parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;

		// Builder class should have a public constructor with all the required
		// attributes as parameters.
		public ComputerBuilder(String HDD, String RAM) {
			this.HDD = HDD;
			this.RAM = RAM;

		}

		// Builder class should have methods to set the optional parameters and
		// it should return the same Builder object after setting the optional
		// attribute.
		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;

		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		// build() method in the builder class that will return the Object
		// needed by client program.
		// For this we need to have a private constructor in the Class with
		// Builder class as argument.
		public Computer build() {
			return new Computer(this);
		}
	}

	@Override
	public String toString() {
		return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}

}
