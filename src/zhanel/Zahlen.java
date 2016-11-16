package zhanel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Klasse zur Erstellung eines Objektes und Berechnung von Zahlen (Summe, Maximum und Minimum)
 * 
 * @author Patrick Zhanel
 * @version 2016-11-10
 */

public class Zahlen implements IZahlen {
	
	private ArrayList<Double> list;
	
	/**
	 * Konstruktor der Zahlen Klasse zum initialisieren der Liste
	 */
	
	public Zahlen(){
		
		this.list = new ArrayList<Double>();
		
	}
	
	/**
	 * Klasse zum berechnen der Summer der Elemente in der Liste
	 * 
	 * @return d die Summe der gesamten Liste
	 */

	@Override
	public double getSumme() {
		
		double d = 0;
		
		for(int i = 0; i < list.size(); i++){
			
			d += list.get(i);
			
		}
		
		return d;
		
	}
	
	/**
	 * Klasse um die kleinste Zahl der Liste zur�ckzugeben
	 * 
	 * @return Collection.min(list) die kleinste Zahl
	 */

	@Override
	public double getMinimum() {
		
		return Collections.min(list);
		
	}
	
	/**
	 * Klasse um die gr��te Zahl der Liste zur�ckzugeben
	 * 
	 * @return Collection.max(list) die gr��te Zahl
	 */

	@Override
	public double getMaximum() {
		
		return Collections.max(list);
		
	}
	
	/**
	 * F�gt ein Element in die Liste ein
	 */

	@Override
	public void add(double value) {
		
		this.list.add(value);
		
	}

}
