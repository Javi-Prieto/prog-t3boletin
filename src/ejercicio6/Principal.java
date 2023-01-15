package ejercicio6;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int numIdEntr = 0, numIdSal, row = 1, seat = 1, locNum, op;
		double priceEnt, precioT = 0;
		boolean occupied = false;
		Entrada ent;
		Entrada[] locs;
		Sala sal;
		System.out.println("Indique el id de la sala");
		numIdSal = Leer.datoInt();
		System.out.println("Indique el número total de localidades");
		locNum = Leer.datoInt();
		locs = new Entrada[locNum];
		System.out.println("Indique el precio de una entrada");
		priceEnt = Leer.datoDouble();
		ent = new Entrada(numIdEntr, row, seat, priceEnt, occupied);
		for(int i = 0; i < locs.length; i++) {
			locs[i] = new Entrada(numIdEntr, row, seat, priceEnt, occupied);
			numIdEntr ++;
			seat ++;
			if(seat < 10) {
			}else {
				row ++;
			}
		}
		sal = new Sala(numIdSal, locNum, ent, locs);
		do {
			System.out.println("**************************************");
			System.out.println("1. Ver cartelera");
			System.out.println("2. Comprar entrada");
			System.out.println("3. Ver ganancias totales");
			System.out.println("4. Modificar precio de una entrada");
			System.out.println("0. Salir");
			System.out.println("**************************************");
			System.out.println("¿Qué desea hacer?");
			op = Leer.datoInt();
			switch (op) {
				case 1:
					sal.imprimirCartelera();
					break;
				case 2:
					System.out.println("Indique el id de la entrada a comprar");
					numIdEntr = Leer.datoInt();
					
					if(sal.findByNumIdV2(numIdEntr).isOcupada()) {
					}else {
						precioT += priceEnt;
					}
					sal.comprarEntrada(numIdEntr);
					break;
				case 3:
					System.out.printf("La ganancia total es %.2f\n", precioT);
					break;
				case 4:
					System.out.println("Indique el nuevo precio de las entrada");
					priceEnt = Leer.datoDouble();
					ent.setPrecio(priceEnt);
					break;
				case 0:
					System.out.println("Gracias por usar el programa");
					break;
				default:
					System.out.println("Número incorrecto");
			}
			
			
		}while(op != 0);
	}

}
