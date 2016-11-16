package zhanel;
/**
 * @author Vincent Schwartz
 * @version 2016-11-10
 */
public class Rauminhalt extends Flaeche implements IRauminhalt{
	private double h;
	/**
	 * Constructor von Zylinder
	 * @param a
	 * @param h
	 */
	public Rauminhalt(double a, double h) {
		super(a);
		this.h = h;
	}
	/**
	 * Constructor von Quader
	 * @param a
	 * @param b
	 * @param h
	 */
	public Rauminhalt(double a, double b, double h) {
		super(a, b);
		this.h = h;
	}
	/**
	 * Constructor von Prisma
	 * @param a
	 * @param b
	 * @param c
	 * @param h
	 */
	public Rauminhalt(double a, double b, double c, double h) {
		super(a, b, c);
		this.h = h;
	}
	
	/**
	 * @return Volumen
	 */
	@Override
	public double getRaumInhalt() {
		return (this.getFlaeche() * this.h);
	}
	//Grundfläche G * Höhe h

}
