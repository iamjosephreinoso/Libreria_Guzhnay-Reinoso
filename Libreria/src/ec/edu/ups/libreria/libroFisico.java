package ec.edu.ups.libreria;

public class libroFisico extends libro{
	
	@Override
	public String toString() {
		return "libroFisico [titulo=" + titulo + ", edicion=" + edicion + ", autor=" + autor + ", precio=" + precio
				+ "]";
	}

	@Override
	public double calcularComision() {
		double comision = this.getPrecio()*0.02;
		System.out.println(comision);
		return comision;
	}

	@Override
	public double calcularVariable() {
		double variable = this.getPrecio()+20;
		System.out.println(variable);
		return variable;
	}
	
}
