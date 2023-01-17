package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int op, tam, nDias = 0, posi = 0, miniB = 0;
		String type = null, nombreC = null;
		double priceD = 0;
		String [] extras = null;
		boolean occupied = false, clean = true;
		Habitacion [] habs;
		Hotel hot;
		System.out.println("Bienvenido al programa");
		System.out.println("¿Cuántas habitatciones tiene su hotel?");
		tam = Leer.datoInt();
		habs = new Habitacion [tam];
		for(int i = 0; i < habs.length; i++) {
			habs[i] = new Habitacion(type, nombreC, priceD, extras, nDias, occupied, clean);
		}
		hot = new Hotel(habs);
		do {
			System.out.println("1. Comprar habitación");
			System.out.println("2. Comprobar ocupación");
			System.out.println("3. Precio final");
			System.out.println("4. Mostrar factura");
			System.out.println("5. Comprobar limpieza");
			System.out.println("0. Salir");
			System.out.println("¿Qué desea hacer?");
			op = Leer.datoInt();
			switch(op) {
				case 1:
					hot.mostrarHabitaciones();
					System.out.println("¿Que habitación quiere comprar?");
					posi = Leer.datoInt();
					System.out.println("Indique el tipo de habitación");
					type = Leer.dato();
					System.out.println("Indique el precio unitario de dicha habitación");
					priceD = Leer.datoDouble();
					System.out.println("Indique el nombre del cliente");
					nombreC = Leer.dato();
					System.out.println("Indique el número de dias que se va a quedar");
					nDias = Leer.datoInt();
					System.out.println("Indique la cantidad de extras de los que dispone");
					tam = Leer.datoInt();
					extras = new String[tam];
					System.out.println("Indique los extras de los que dispone la habitación");
					for(int i= 0; i < extras.length; i++) {
						System.out.println("Diga el " + (i+1) + " extra");
						extras[i] = Leer.dato();
					}
					hot.comprarHabitacion(posi, type, nombreC, nDias, extras, priceD);
					break;
				case 2:
					hot.mostrarHabitaciones();
					System.out.println("¿Que habitación quiere comprar?");
					posi = Leer.datoInt();
					hot.imprimirOcupada(posi);
					break;
				case 3:
					System.out.println("Diga el nmbre del cliente que desea comprobar");
					nombreC = Leer.dato();
					System.out.println("Pulse 1 si ha consumido el minibar, en caso contrario pulse 0");
					miniB = Leer.datoInt();
					if(hot.comprobarMiniB(miniB)) {
						System.out.println("Indique el precio del miniBar");
						priceD = Leer.datoDouble();
					}
					System.out.println("El precio final de la habitación es " + hot.calcularPrecioFinal(nombreC, miniB, priceD));
					break;
				case 4:
					System.out.println("Diga el nombre del cliente del que quiere la factura");
					nombreC = Leer.dato();
					hot.imprimirFactura(nombreC, miniB, priceD);
					break;
				case 5:
					
					break;
				case 0:
					break;
				default:
					System.out.println("Error 543: Número inexistente");
			}
		}while(op != 0);

	}

}
