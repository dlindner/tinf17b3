package de.dhbw.tinf17b3.pattern.decorator;

public class Flügel extends TeileDekorierer {
	
	public Flügel(Teil nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void schwebe() {
		super.schwebe();
		System.out.println("Ich biete Auftrieb");
	}
}
