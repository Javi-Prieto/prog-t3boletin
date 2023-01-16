package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		Producto [] productos;
		Gestion gest;
		String cod, name, cat;
		double precioFabrica;
		int tam, op;
		int fragil;
		System.out.println("Bienvenido al programa de gestión de productos");
		System.out.println("Indique cuantos productos va a añadir");
		tam = Leer.datoInt();
		productos = new Producto [tam];
		gest = new Gestion(productos);
		do {
			System.out.println("******************************************");
			System.out.println("1. Añadir producto");
			System.out.println("2. Listar productos");
			System.out.println("3. Calcular PPV");
			System.out.println("4. Comprobar Fragilidad");
			System.out.println("5. Buscar producto por nombre");
			System.out.println("0. Salir");
			System.out.println("******************************************");
			System.out.println("¿Qué desea hacer?");
			op = Leer.datoInt();
			switch (op) {
				case 1:
					for(int i = 0; i < productos.length; i++) {
						System.out.println("Introduce el nombre del producto " + (i+1));
						name = Leer.dato();
						System.out.println("Introduce el código del producto " + (i+1));
						cod = Leer.dato();
						System.out.println("Introduce el precio del proucto " + (i+1));
						precioFabrica = Leer.datoDouble();
						System.out.println("Introduce 1 si el producto es fragil, en caso contrario pulse 0");
						fragil = Leer.datoInt();
						System.out.println("Introduce la categoria a la que pertenece");
						cat = Leer.dato();
						gest.addProducts(new Producto(cod, name, precioFabrica, gest.addFragil(i, fragil), cat), i);
						System.out.println();
					}
					break;
				case 2:
					gest.imprimirTodosLosProdctos();
					break;
				case 3:
					gest.imprimirTodosLosProdctos();
					System.out.println("Introduzca el código del producto que desea calcular el PPV");
					cod = Leer.dato();
					System.out.printf("El PPV del producto es: %.2f \n", gest.calcularPPV(gest.findById(cod)));
					break;
				case 4:
					System.out.println("Introduzca el código del producto que desea comprobar su fragilidad");
					cod = Leer.dato();
					if(gest.comprobarFragil(gest.findById(cod))) {
						System.out.println("El producto es frágil");
					}else {
						System.out.println("El producto no es frágil");
					}
					break;
				case 5:
					System.out.println("Diga el nombre");
					name = Leer.dato();
					System.out.println("Los productos son: ");
					gest.imprimirMismoNombre(name);
					break;
				case 0:
					System.out.println("Gracias por usar el programa");
					break;
				default:
					System.out.println("Error: Número inexistente");
			}
		}while(op != 0);

	}

}
