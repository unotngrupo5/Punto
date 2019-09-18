package ejercicioPunto;

import java.util.ArrayList;

public class Plano {
	private ArrayList<Punto> puntos;
	
	public Plano(ArrayList<Punto> puntos) {
		this.setPuntos(puntos);
	}
	public Plano() {
		this(new ArrayList<Punto>());
	}
	public void agregarPunto(Punto punto) {
		if (punto != null) {
			this.getPuntos().add(punto);
		}
	}
	public int getCantPuntos(Cuadrante cuadrante) {
		int cont = 0;
		for(Punto puntos: this.getPuntos()) {
			if (puntos.getCuadrante().equals(cuadrante)) {
				cont ++;
			}
		}
		return cont;
	}
	
	
	
	public ArrayList<Punto> getPuntos() {
		return puntos;
	}
	public void setPuntos(ArrayList<Punto> puntos) {
		this.puntos = puntos;
	}
}
