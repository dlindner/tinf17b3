package de.dhbw.tinf17b3.pattern.decorator;

public abstract class TeileDekorierer implements Teil {
	
	private final Teil nachfolger;

	public TeileDekorierer(Teil nachfolger) {
		super();
		this.nachfolger = nachfolger;
	}
	
	@Override
	public void schwebe() {
		this.nachfolger.schwebe();
	}
}
