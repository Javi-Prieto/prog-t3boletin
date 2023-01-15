package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int op, tam, nDias, posi = 0, clean;
		String type, nombreC;
		double priceD;
		String [] extras;
		/*
		 * I put occupied on true because I think that when you add a room
		 * you are adding an occupied room and when you give them the bill
		 * is when you established your room on free room. Thats why i question
		 * how many rooms does the hotel have.
		 * */
		boolean occupied = true, miniBar;
		Habitacion [] habs;
		Hotel hot;
		System.out.println("Bienvenido al programa");
		System.out.println("¿Cuántas habitatciones tiene su hotel?");
		tam = Leer.datoInt();
		habs = new Habitacion [tam];
		hot = new Hotel(habs);
		do {
			System.out.println("1. Crear habitación");
			System.out.println("2. Comprobar ocupación");
			System.out.println("3. Precio final");
			System.out.println("4. Mostrar factura");
			System.out.println("5. Comprobar limpieza");
			System.out.println("0. Salir");
			System.out.println("¿Qué desea hacer?");
			op = Leer.datoInt();
			switch(op) {
				case 1:
					System.out.println("Indique el tipo de habitción");
					type = Leer.dato();
					System.out.println("Indique el nombre del cliente");
					nombreC = Leer.dato();
					System.out.println("Indique el precio de la habitación");
					priceD = Leer.datoDouble();
					System.out.println("Indique el número de extras del que dispone");
					tam = Leer.datoInt();
					extras = new String [tam];
					for(int i = 0; i < extras.length; i++) {
						System.out.println("Indique el extra");
						extras[i] = Leer.dato();
					}
					System.out.println("Indique el número de dias que se va a quedar el cliente");
					nDias = Leer.datoInt();
					System.out.println("Pulse 1 si la habitación esta limpia, en caso contrario pulse 0");
					clean = Leer.datoInt();
					hot.addHabitacion(new Habitacion(type, nombreC, priceD, extras, nDias, occupied, hot.comprobarLimpieza(clean)), posi);
					posi ++;
					System.out.println("Se ha añadido la "  + (posi +1)+ " habitacion");
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
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
