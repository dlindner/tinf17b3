package de.dhbw.tinf17b3.pattern.decorator;

public class Flugzeugrumpf implements Teil {
	
	public Flugzeugrumpf() {
		super();
	}
	
	@Override
	public void schwebe() {
		System.out.println("Ich stürze zu Boden");
	}
}
