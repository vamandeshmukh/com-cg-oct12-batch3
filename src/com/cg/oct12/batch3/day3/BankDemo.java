package com.cg.oct12.batch3.day3;

class HdfcBank {

	static String ifsc;
	double balance;

	void checkBalance() {
		System.out.println(this.balance);
	}

}

public class BankDemo {

	public static void main(String[] args) {
		HdfcBank obj = new HdfcBank();
		obj.balance = 1000;
		obj.checkBalance();

		HdfcBank.ifsc = "HDFC000111";
		System.out.println(HdfcBank.ifsc);

	}

}
