package ejercicio2;

public class Hotel {
	//Fields
	private Habitacion [] lista;
	//Constructor

	public Hotel(Habitacion[] lista) {
		super();
		this.lista = lista;
	}
	//Methods
	public void comprarHabitacion(int pos, String tipo, String cl, int numD, String[] extras, double precioU) {
		if(lista[pos-1].isOcupada()) {
			System.out.println("Habitación ocupada");
		}else {
			lista[pos-1].setTipo(tipo);
			lista[pos-1].setNombreCli(cl);
			lista[pos-1].setNumD(numD);
			lista[pos-1].setExtraServ(extras);
			lista[pos-1].setOcupada(true);
			lista[pos-1].setLimpia(false);
			lista[pos-1].setPrecioUnit(precioU);
			System.out.println("Habitación comprada correctamente");
			System.out.println(lista[pos-1]);
		}
	}
	public boolean comprobarLimpieza(String cl ) {
		if (lista[findByName(cl)].isLimpia()) {
			return true;
		}else {
			return false;
		}
	}
	public void imprimirLimpio(String cl) {
		if(comprobarLimpieza(cl)) {
			System.out.println("Habitación Limpia");
		}else {
			System.out.println("Habitación Sucia");
		}
	}
	public boolean comprobarOcupada(int pos) {
		if(lista[pos-1].isOcupada()) {
			return true;
		}else{
			return false;
		}
	}
	public void imprimirOcupada(int pos) {
		if(comprobarOcupada(pos)) {
			System.out.println("Habitación ocupada");
		}else {
			System.out.println("Habitación libre");
		}
	}
	public void mostrarHabitaciones() {
		for(int i = 0;i < lista.length; i++) {
			System.out.println((i+1)+". " + lista[i]);
		}
	}
	public int findByName(String cl) {
		int i = 0;
		boolean encontrado = false;
		while(i < lista.length && !encontrado) {
			if(lista[i].getNombreCli() == null) {
				i++;
			}else if(lista[i].getNombreCli().equalsIgnoreCase(cl)) {
				encontrado = true;
				}	else {
					i++;
				}
			
		}
		return i;
	}
	public double calcularPrecioFinal(String cl, int miniB, double precioMiB) {
		double precioExt = 100;
		if(lista[findByName(cl)].getExtraServ() == null) {
			if(comprobarMiniB(miniB)) {
				return (lista[findByName(cl)].getPrecioUnit() * lista[findByName(cl)].getNumD()) + precioMiB;
			}else {
				return lista[findByName(cl)].getPrecioUnit() * lista[findByName(cl)].getNumD();
			}
		}else if(comprobarMiniB(miniB)) {
			return (lista[findByName(cl)].getPrecioUnit() * lista[findByName(cl)].getNumD()) + precioMiB + precioExt;
		}else {
			return lista[findByName(cl)].getPrecioUnit() * lista[findByName(cl)].getNumD() + precioExt;
		}
	}
	public boolean comprobarMiniB(int mini) {
		if(mini == 1) {
			return true;
		}else {
			return false;
		}
	}
	public void imprimirFactura(String nomC, int mini, double precioMiB) {
		
		System.out.println("----------------------");
		System.out.println("\t FACTURA");
		System.out.println("----------------------");
		System.out.println("1. Tipo de habitación ocupada " + lista[findByName(nomC)].getTipo());
		System.out.println("2. Número de dias de la estancia " + lista[findByName(nomC)].getNumD());
		System.out.println("3. Número de extras añadidos " + lista[findByName(nomC)].getExtraServ().length);
		System.out.println("4. Consumo del minibar " + comprobarMiniB(mini));
		System.out.println("Precio final " + calcularPrecioFinal(nomC, mini, precioMiB));
		System.out.println("------------------------------------------------------------------------");
		lista[findByName(nomC)].setOcupada(false);
	}
}
