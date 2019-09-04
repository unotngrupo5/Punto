package ejercicioPunto;

public class Punto {
	private double x;
	private double y;
	private double xi;
	private double yi;
	//private static int cont = 0;

	public Punto(double x, double y) {
		this.setX(x);
		this.setY(y);
		this.setXi(x);
		this.setYi(y);
	}

	public double getXi() {
		return xi;
	}

	public void setXi(double xi) {
		this.xi = xi;
	}

	public double getYi() {
		return yi;
	}

	public void setYi(double yi) {
		this.yi = yi;
	}

	public Punto() {
		this(0,0);
	}

	public Punto(double xy) {
		this(xy,xy);
	}

	public Punto(Punto p1) {
		this.setX(p1.getX());
		this.setY(p1.getY());
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public static double calcularDistancia(Punto p1, Punto p2) {
		return Math.hypot(p1.getX() - p2.getX(), p1.getY() - p2.getY());
	}

	public double calcularDistancia(Punto p1) {
		return Punto.calcularDistancia(this, p1);
	}

	public void reset() {
		this.setX(this.getXi());
		this.setY(this.getYi());
	}

	public String toString(){
		return "("+this.getX()+","+this.getY()+")";
	}
	/*public double norte() {
		return this.getX() + 1;
	}	
	public double sur() {
		return this.getX() - 1;
	}
	public double oeste() {
		return this.getY() - 1;
	}
	public double este() {
		return this.getY() + 1;
	}*/	
}

