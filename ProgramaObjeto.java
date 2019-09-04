package ejercicioPunto;

public class ProgramaObjeto {

	//private boolean run;
	private String palabra;

	public ProgramaObjeto(String palabra) {
		this.setPalabra(palabra);
	}

	public Punto ejecutar() {
		double contx = 0;
		double conty = 0;
		char[] ch = this.getPalabra().toCharArray();

		for (int i = 0 ; i < this.getPalabra().length()-1 ; i ++) {
			if (ch[i] == 'N') {
				conty = conty + 1;
			}	if (ch[i] == 'S') {
				conty = conty - 1;
			}	if (ch[i] == 'E') {
				contx = contx + 1;
			}	if (ch[i] == 'O') {
				contx = contx - 1;
			}
		}
		Punto p1 = new Punto (contx, conty);
		return p1;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	public String toString(){
		return ""+this.getPalabra()+"";
	}

	/*public void setRun(boolean run) {
		this.run = run;
	}
	public boolean getRun() {
		return run;
	}*/
}
