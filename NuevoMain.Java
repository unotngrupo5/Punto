package ejercicioPunto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1 = new Punto(1, 1);
		Punto p2 = new Punto(4.9, 4.9);
	
		
		// Ejercicio Punto
		/* System.out.println("La distancia de P1 a P2 es: "+p1.calcularDistancia(p2));
		System.out.println("P1: " + p1);
		p1.setX(4);
		System.out.println("P1 luego de setear X con 4: " + p1);
		p1.setY(1);
		System.out.println("P1 luego de setear Y con 1: " + p1);
		p1.reset();
		System.out.println("P1 luego de resetear sus valores: " + p1);
		*/
		
		
		// Ejercicio Compliación
		/*System.out.println("Distancia de P1 a P2 desde un método estatico: " + Punto.calcularDistancia(p1,p2));
		String msg = new String ("CNNOOF");
		System.out.println("Mensaje creado: "+ msg +"Largo del mensaje: " + msg.length());
		//System.out.println(msg);
		//System.out.println(Compilador.compilar("CNNOSEF"));
		ProgramaObjeto po = Compilador.compilar(msg);
		//System.out.println(msg);
		System.out.println("P1 luego de haber compilado y ejecutado el Programa Objeto: " + po.ejecutar());
		*/
		
		// Ejercicio Plano
		Plano plano1 = new Plano();
		plano1.agregarPunto(p1);
		plano1.agregarPunto(p2);
		System.out.println(plano1.getCantPuntos(Cuadrante.I));
		
	}

}
