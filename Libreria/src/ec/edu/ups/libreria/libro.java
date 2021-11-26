package ec.edu.ups.libreria;

public abstract class libro {
	
	protected String titulo;
	protected int edicion;
	protected String autor;
	protected double precio;

	public libro() {

	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getEdicion() {
		return edicion;
	}
	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public abstract double calcularComision();
	public abstract double calcularVariable();
	
	public void calcularPrecio() {
		double total = calcularComision() + calcularVariable();
		System.out.println("El valor final del libro es: "+total);
	}

}
