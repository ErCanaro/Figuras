package figuras;

import java.util.Objects;

public class Cuadrado extends Figuras implements Desplazable, Comparable<Figuras> {
	private double lado;
	
	public Cuadrado (Punto inferiorIz, double lado) {
		super(inferiorIz);
		this.lado =  lado;
	}
	
	@Override
	public Double getArea() {
		return this.lado*this.lado;
	}

	public double getPerimetro() {
		return lado*4;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(lado);
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
		Cuadrado other = (Cuadrado) obj;
		return Double.doubleToLongBits(lado) == Double.doubleToLongBits(other.lado);
	}

}
