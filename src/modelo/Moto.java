package modelo;

public class Moto extends Vehiculo {

	int cilindrada;

	public Moto(String marca, String modelo, float precio, int cilindrada) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "\n Marca: " + marca + " // " + "Modelo: " + modelo + " // " + "Cilindrada: " + cilindrada + " // " + "Precio: " + "$" + precio ;
	}







}
