package figuras;

import java.util.Objects;

public class Circulo extends Figuras implements Desplazable, Comparable<Figuras> {
	private double radio;

	public Circulo(Punto centro, double radio) {
		super(centro);
		this.radio = radio;
	}

	@Override
	public Double getArea() {
		return Math.PI * radio * radio;
	}

	public double getRadio() {
		return this.radio;
	}
	
	public double getDiametro() {
		return this.radio*2;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(radio);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		return Double.doubleToLongBits(radio) == Double.doubleToLongBits(other.radio);
	}

}
