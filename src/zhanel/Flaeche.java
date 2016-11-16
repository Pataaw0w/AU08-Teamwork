package goebbels;
/**
 * @author Christoph
 * @version 2016-11-10
 * Die Klasse wird verwendet um die Flächenformel von einem Kreis, Rechteck und Dreieck zu berechnen.
 */
public class Flaeche implements IFlaeche {
	private Object dreieck;
	private Object kreis;
	private Object rechteck;
	private double a;
	private double b;
	private double c;
	private double s;
	
	/**
	 * Erstellung Mehrerer Konstruktoren..
	 *  	Wenn 1 Wert, Kreis
	 */
	public Flaeche(double a){
		this.a = a;
	}
	
	/**
	 * Wenn 2 Werte, Rechteck
	 */
	public Flaeche(double a, double b){
		this.a = a;
		this.b = b;
	}
	
	/**
	 * Wenn 3 Werte, Dreieck
	 */
	public Flaeche(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
		s = (a+b+c)/2;
	}
	
	/**
	 * getFlaeche berechnet die Fläche von Kreis, Rechteck, Dreieck
	 * Wenn nur 1 Eingabe, Kreis
	 * Wenn 2 Eingaben, Rechteck
	 * Wenn 3 Eingaben, Dreieck
	 * @return flaeche
	 */
	@Override
	public double getFlaeche() {
		double flaeche;
		flaeche = 0;
	    /*if(this.s - this.a == 0 ) throw new NumberFormatException();
		if(this.s - this.b == 0 ) throw new NumberFormatException();
		if(this.s - this.c == 0 ) throw new NumberFormatException();
		if(a == 0) throw new NumberFormatException();*/
		if(a >= 1) flaeche = this.a*this.a*Math.PI;
		if((a >= 1)&&(b >= 1)) flaeche = this.a * this.b;
		if((a >= 1) && (b >= 1) && (c >= 1)) flaeche = Math.sqrt(this.s*(this.s-this.a)*(this.s-this.b)*(this.s-this.c));

		return flaeche;
	}
}