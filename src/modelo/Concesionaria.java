package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Concesionaria implements ICargarVehiculos {

	private List<Vehiculo> lstVehiculos;

	public Concesionaria() {
		this.lstVehiculos = new ArrayList<Vehiculo>();
	}

	//Metodos

	public String vehiculoMasCaro() {
		Iterator<Vehiculo> iterador = lstVehiculos.iterator();
		float precioN=0;
		String modelo="";
		while(iterador.hasNext()) {
			// Recorremos la lista de vehiculos y vamos guardando el precio nuevo, siempre y cuando sea mayor
			//  al precio almacenado anteriormente.
			Vehiculo vehiculo=iterador.next();
			if(vehiculo.precio>=precioN) {
				modelo= vehiculo.marca +" " + vehiculo.modelo;
				precioN=vehiculo.precio;
			}

		}
		return modelo;
	}

	public String vehiculoMasBarato() {
		Iterator<Vehiculo> iterador = lstVehiculos.iterator();
		float precioN=999999;
		String modelo="";
		while(iterador.hasNext()) {
			// Recorremos la lista de vehiculos y vamos guardando el precio nuevo, siempre y cuando sea mayor
			//  al precio almacenado anteriormente.
			Vehiculo vehiculo=iterador.next();

			if(vehiculo.precio<=precioN) {
				modelo= vehiculo.marca +" " + vehiculo.modelo;
				precioN=vehiculo.precio;
			}

		}
		return modelo;
	}

	public String vehiculoContieneModeloLaLetraY() {
		Iterator<Vehiculo> iterador = lstVehiculos.iterator();
		String letraABuscar = "Y";
		String letra;
		int bandera=0;
		String modeloADevolver="";
		while(iterador.hasNext() && bandera!=1) {
			Vehiculo vehiculo = iterador.next();

			// Tomamos el modelo del vehiculo y lo convertimos en un vector del tipo char. Luego reccorremos dicho vector, hasta encontrar
			// si es que posee la letra 'Y'.

			char[] modeloVector=vehiculo.modelo.toCharArray();
			for(int x=0; x<vehiculo.modelo.length();x++) {
				letra = String.valueOf(modeloVector[x]);
				if (letraABuscar.equalsIgnoreCase(letra)) {
					modeloADevolver = vehiculo.marca + " " + vehiculo.modelo + " " +"$"+ vehiculo.precio;
					bandera=1;
				}
			}


		}
		return modeloADevolver;
	}


	// Implemente una interfaz para cargar los datos de los vehiculos, lo cual tambien se podria haber resuelto
	// colocando un metodo directamente en la superclase Concesionaria.

	@Override
	public void cargarDatos() {
		this.lstVehiculos.add(new Auto("Peugeot", "206",200000f, 4));
		this.lstVehiculos.add(new Moto("Honda", "Titan", 60000f,125));
		this.lstVehiculos.add(new Auto("Peugeot", "208",250000f,5));
		this.lstVehiculos.add(new Moto("Yamaha","YBR",80500.50f, 160));
	}

	// Getters y Setters

	public List<Vehiculo> getLstVehiculos() {
		return lstVehiculos;
	}

	public void setLstVehiculos(List<Vehiculo> lstVehiculos) {
		this.lstVehiculos = lstVehiculos;
	}





}
