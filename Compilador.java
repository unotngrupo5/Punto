package ejercicioPunto;

public class Compilador {

	private static String palabra;

	public Compilador(String palabra) {
		this.setPalabra(palabra);
	}


	public String getPalabra() {
		return palabra;
	}


	public void setPalabra(String palabra) {
		Compilador.palabra = palabra;
	}


	public static ProgramaObjeto compilar(String palabra) {
		if (palabra == null) return null;
		if (palabra.length() < 2) return null;
		return (palabra.matches("[C]([O|S|N|E])*[F]")) ? new ProgramaObjeto(palabra):null;
		//ProgramaObjeto po = new ProgramaObjeto(palabra);

	}

	public String toString(){
		return ""+this.getPalabra()+"";
	}


}	

