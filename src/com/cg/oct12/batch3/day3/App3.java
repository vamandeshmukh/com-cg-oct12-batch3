package com.cg.oct12.batch3.day3;

// Entities 

// Employee - characteristics 
// eid, name, salary, doj, email, addrress 

//Employee - behaviours 
// work, applyForleave, writeCode, testCode 

// OOP - Object Oriented Programming 

class Employee {

	// fields - characteristics
	int eid;
	String name;
	double salary;

	// methods - behaviours
	void work() {
		System.out.println("Employee works...");
	}
}

class BankCustomer {

	static String ifsc; // free access
	int accountNumber;
	String customerName;
	double balance;

	static void deposit() {

	}

	void withdraw() {

	}

	void transfer() {

	}

	static void openAccount() {

	}

}

public class App3 {

	public static void main(String[] args) {

		System.out.println("App3");
	}

}
