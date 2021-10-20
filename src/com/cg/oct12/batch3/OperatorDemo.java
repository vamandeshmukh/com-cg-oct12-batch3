package com.cg.oct12.batch3;

public class OperatorDemo {

	public static void main(String[] args) {

		// arithmetic operators + - * / %
		// relational operators == != > >= < <=
		// && || !
		// ++ --
		// += -= *= /= %=

		int overs = 20; // 
		int remainingOvers = overs;
		
		remainingOvers = remainingOvers - 1;
		
		// remainingOvers -= 1;
		System.out.println(remainingOvers);

		// ternary operator : ?

		int salary1 = 100, salary2 = 120, mySalary;

//		if (salary1 > salary2) 
//			mySalary = salary1;
//		else 
//			mySalary = salary2;

		mySalary = (salary1 > salary2) ? salary1 : salary2;

		System.out.println(mySalary);
				

	}

}
