package ejercicio5;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		Tienda ti;
		Electrodomestico [] eles;
		Electrodomestico el = new Electrodomestico();
		double basePrice, weight;
		int tam, op;
		String color;
		char consEner;
		System.out.println("Bienvenido al programa");
		System.out.println("Indique la cantidad de Electrodomesticos que tiene");
		tam = Leer.datoInt();
		eles = new Electrodomestico[tam];
		ti = new Tienda(eles);
		for(int i = 0; i < eles.length; i++) {
			System.out.println("Indique el precio base del " + (i+1)+ " producto");
			basePrice = Leer.datoDouble();
			System.out.println("Indique el peso del " + (i+1) + " producto");
			weight = Leer.datoDouble();
			System.out.println("Indique el color del " + (i+1) + " producto");
			color = Leer.dato();
			
			System.out.println("Indique el consumo del " + (i+1) + " producto en mayúscula");
			consEner = Leer.datoChar();
			ti.addElectrodomestico(new Electrodomestico(basePrice, weight, el.comprobarColor(color), el.comprobarConsumoElectrico(consEner)), i);
		}
		do {
			System.out.println("-----------------------------------------------");
			System.out.println("1. Ver el precio final de un producto");
			System.out.println("2. Ver suma total de precios");
			System.out.println("3. Ver la media de precio");
			System.out.println("0. Salir");
			System.out.println("---------------------------------------------");
			System.out.println("¿Qué desea hacer?");
			op = Leer.datoInt();
		}while(op != 0);

	}

}
