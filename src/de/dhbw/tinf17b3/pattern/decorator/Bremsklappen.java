package de.dhbw.tinf17b3.pattern.decorator;

public class Bremsklappen extends TeileDekorierer {
	
	public Bremsklappen(Teil nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void schwebe() {
		super.schwebe();
		System.out.println("Ich reiﬂe mal ab.");
	}
}
