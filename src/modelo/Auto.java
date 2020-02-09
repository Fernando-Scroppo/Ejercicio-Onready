package modelo;



public class Auto extends Vehiculo{

	private int puerta;


	public Auto(String marca, String modelo, float precio, int puerta) {
		super(marca, modelo, precio);
		this.puerta = puerta;

	}



	// Getters y Setters
	public int getPuerta() {
		return puerta;
	}

	public void setPuerta(int puerta) {
		this.puerta = puerta;
	}



	@Override
	public String toString() {
		return "\n Marca: " + marca + " // " + "Modelo: " + modelo + " // " + "Puertas: " + puerta + " // " + "Precio: " + "$" + precio;
	}











}
