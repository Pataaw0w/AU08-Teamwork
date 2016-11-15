package zhanel;

import java.util.ArrayList;

public class Tsst {
	
	public static void main(String[] args) {
		
		Zahlen z = new Zahlen();
		
		z.add(10);
		z.add(20);
		z.add(30);
		
		System.out.println(z.getSumme());
		System.out.println(z.getMinimum());
		System.out.println(z.getMaximum());
		
	}

}
