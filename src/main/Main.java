package main;
import java.util.Collections;
import modelo.Concesionaria;

public class Main {

	public static void main(String[] args) {

		Concesionaria concesionaria = new Concesionaria();
		concesionaria.cargarDatos();
		System.out.println(concesionaria.getLstVehiculos());

		System.out.println("-------------------------------");

		System.out.println("Veh�culo m�s caro: " + concesionaria.vehiculoMasCaro());
		System.out.println("Veh�culo m�s barato: " + concesionaria.vehiculoMasBarato());
		System.out.println("Vehiculo que contiene en el modelo la letra 'Y': " + concesionaria.vehiculoContieneModeloLaLetraY());

		System.out.println("---------------------------------");




	}

}
