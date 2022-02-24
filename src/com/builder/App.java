package com.builder;

public class App {

	public static void main(String[] args) {
		Computer computer1 = new Computer.ComputerBuilder("80 GB", "4 GB").setBluetoothEnabled(true).build();
		System.out.println("Coumputer 1 "+computer1);
		
		Computer computer2 = new Computer.ComputerBuilder("80 GB", "4 GB").build();
		System.out.println("Coumputer 2 "+computer2);
	}

}
