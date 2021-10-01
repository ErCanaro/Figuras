package figuras;

import java.util.Objects;

public abstract class Figuras implements Desplazable, Comparable<Figuras> {
	Punto punto;

	public Figuras(Punto punto) {
		this.punto = punto;
	}

	public abstract Double getArea();

	@Override
	public void desplazar(double deltaX, double deltaY) {
		this.punto.desplazar(deltaX, deltaY);
	}

	public int compareTo(Figuras f) {
		return this.getArea().compareTo(f.getArea());
	}

	@Override
	public int hashCode() {
		return Objects.hash(punto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figuras other = (Figuras) obj;
		return Objects.equals(punto, other.punto);
	}

}
