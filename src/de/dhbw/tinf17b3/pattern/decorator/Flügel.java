package de.dhbw.tinf17b3.pattern.decorator;

public class Fl�gel extends TeileDekorierer {
	
	public Fl�gel(Teil nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void schwebe() {
		super.schwebe();
		System.out.println("Ich biete Auftrieb");
	}
}
