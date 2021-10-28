package com.cg.oct12.batch3.day9.conc;

import java.util.concurrent.Callable;

class Vaman {

}

public class Delete implements Callable<Vaman> {
	
	int num;

	// parameters

	@Override
	public Vaman call() throws Exception {
		Vaman vam = new Vaman();
		return vam;
	}

	public static void main(String[] args) {

	}

}
