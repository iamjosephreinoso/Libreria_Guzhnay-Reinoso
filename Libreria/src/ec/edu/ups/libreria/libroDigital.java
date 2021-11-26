package ec.edu.ups.libreria;

public class libroDigital extends libro {
	
	@Override
	public String toString() {
		return "libroDigital [titulo=" + titulo + ", edicion=" + edicion + ", autor=" + autor + ", precio=" + precio
				+ "]";
	}

	@Override
	public double calcularComision() {
		double comision = this.getPrecio()*0.12;
		System.out.println(comision);
		return comision;
	}

	@Override
	public double calcularVariable() {
		double variable = this.getPrecio();
		System.out.println(variable);
		return variable;
	}
	
}

