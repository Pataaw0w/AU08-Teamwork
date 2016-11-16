package goebbels;

public class Test { 

	public static void main(String[] args){
		Flaeche prisma = new Flaeche(25, 25, 25);
		Rauminhalt prismaRaum = new Rauminhalt(25, 25, 25, 25);
		System.out.println(prismaRaum.getRaumInhalt());
	}
}
