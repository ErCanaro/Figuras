package figuras;

import java.util.Objects;

public class Segmento implements Desplazable, Comparable<Segmento> {
	private Punto puntoI;
	private Punto puntoF;

	public Segmento(Punto inicio, Punto fin) {
		this.puntoI = inicio;
		this.puntoF = fin;
	}

	public Double getLargo() {
		return this.puntoI.distanciaConPunto(puntoF);
	}

	@Override
	public void desplazar(double deltaX, double deltaY) {
		this.puntoI.setX(this.puntoI.getX() + deltaX);
		this.puntoI.setY(this.puntoI.getY() + deltaY);
		this.puntoF.setX(this.puntoF.getX() + deltaX);
		this.puntoF.setY(this.puntoF.getY() + deltaY);
	}

	public boolean esParaleloAX() {
		return puntoI.getY() == puntoF.getY();
	}

	public boolean esParaleloAY() {
		return puntoI.getX() == puntoF.getX();
	}

	public boolean esParaleloCon(EsParalelo s) {
		if (s instanceof Segmento) {
			Segmento seg = (Segmento) s;

			double pendienteS1 = (puntoF.getY() - puntoI.getY()) / (puntoF.getX() - puntoI.getX());
			double pendienteS2 = (seg.puntoF.getY() - seg.puntoI.getY()) / (seg.puntoF.getX() - seg.puntoI.getX());

			return pendienteS1 == pendienteS2;
		}
		return false;
	}

	@Override
	public int compareTo(Segmento otro) {
		return this.getLargo().compareTo(otro.getLargo());
	}

	@Override
	public int hashCode() {
		return Objects.hash(puntoF, puntoI);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Segmento other = (Segmento) obj;
		return Objects.equals(puntoF, other.puntoF) && Objects.equals(puntoI, other.puntoI);
	}

	
}
