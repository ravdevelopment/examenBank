package com.mybank.domain;

import java.util.ArrayList;


public class Bank {
	private static Customer[] customers;
	private static int numberOfCustomers;

	static {
		customers = new Customer[10];
		customers[0] = new Customer("Laura", "Madrid");
		customers[1] = new Customer("Pedro", "Acuoso");
		customers[2] = new Customer("Gonzalo", "Perico");
		customers[3] = new Customer("Dario", "Vicente");
//		customers[4] = new Customer("Rafa", "Antunez");
//		customers[5] = new Customer("Rosa", "Rosales");
//		customers[6] = new Customer("Maria", "Fuentes");
//		customers[7] = new Customer("Fernando", "Fernandez");
//		customers[8] = new Customer("Luis", "Martinez");
//		customers[9] = new Customer("Pepe", "Rodriguez");
		numberOfCustomers = 10;
		Account account = new Account(0);
	}

	private Bank() {
		// this constructor should never be called
	}

	public static void addCustomer(String f, String l) {
		int i = numberOfCustomers++;
		customers[i] = new Customer(f, l);
	}

	public static int getNumOfCustomers() {
		return numberOfCustomers;
	}

	public static Customer getCustomer(int customer_index) {
		return customers[customer_index];
	}
	
	public static ArrayList<Customer> getAllCustomers() {
		Customer x = new Customer(null, null);
		ArrayList<Customer> clientes = new ArrayList();
		for (Customer c : customers) {
			clientes.add(c);
		}
		
		return clientes;
	}
}
