package zhanel;

/**
 * 
 * @author Patrick Zhanel, Vincent Schwartz
 *
 * Testklasse zum Testen der Methoden
 */

public class Test { 

	public static void main(String[] args){
		
		Zahlen z = new Zahlen();
		
		z.add(10);
		z.add(20);
		z.add(30);
		
		System.out.println(z.getSumme());
		System.out.println(z.getMinimum());
		System.out.println(z.getMaximum());
		
		Flaeche prisma = new Flaeche(25, 25, 25);
		Rauminhalt prismaRaum = new Rauminhalt(25, 25, 25, 25);
		System.out.println(prismaRaum.getRaumInhalt());
		
	}
	
}
