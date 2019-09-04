package ejercicioPunto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1 = new Punto();
		Punto p2 = new Punto(4.9, 4.9);
		System.out.println(p1.calcularDistancia(p2));
		System.out.println(p1);
		p1.setX(4);
		System.out.println(p1);
		p1.setY(1);
		System.out.println(p1);
		p1.reset();
		System.out.println(p1);


		System.out.println(Punto.calcularDistancia(p1,p2));

		String msg = new String ("CNNOOF");
		//System.out.println(msg);

		//System.out.println(Compilador.compilar("CNNOSEF"));

		ProgramaObjeto po = Compilador.compilar(msg);
		System.out.println(msg);
		System.out.println(po.ejecutar());

	}

}
