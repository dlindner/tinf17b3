package de.dhbw.tinf17b3.pattern.decorator;

public class Main {

	public static void main(String[] args) {
		Teil investition = new Flugzeugrumpf();
		investition = new Fl�gel(investition);
		investition = new Strahltriebwerk(investition);
		investition = new Strahltriebwerk(investition);
		investition = new Strahltriebwerk(investition);
		investition = new Bremsklappen(investition);
		investition = new Bremsklappen(investition);
		
		investition.schwebe();
	}
}
