package modelo;



public abstract class Vehiculo {

	// Atributos
	protected String marca;
	protected String modelo;
	protected float precio;


	// Constructor
	public Vehiculo(String marca, String modelo, float precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;

	}


	// Getters y setters	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(long precio) {
		this.precio = precio;
	}


}
