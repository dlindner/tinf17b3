package de.dhbw.tinf17b3.pattern.decorator;

public class Strahltriebwerk extends TeileDekorierer {
	
	public Strahltriebwerk(Teil nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void schwebe() {
		System.out.println("Ich leiste enorm Vorschub!");
		super.schwebe();
	}
}
