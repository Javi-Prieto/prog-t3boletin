package ejercicio5;


public class Tienda {
	//Fields
	private Electrodomestico[] lista;
	
	//Constructor

	public Tienda(Electrodomestico[] lista) {
		super();
		this.lista = lista;
	}
	
	//Methods
	public double precioFinal(int pos) {
		return lista[pos-1].precioFinal(lista[pos-1].getConsumoEnergetico());
	}
	public double precioTotal() {
		double precioT = 0;
		for(int i = 0; i < lista.length; i++) {
			precioT += lista[i].precioFinal(lista[i].getConsumoEnergetico());
		}
		return precioT;
	}
	public double mediaPrecio() {
		return precioTotal() / lista.length;
	}
	public void mostrarObjetos() {
		for(int i = 0; i < lista.length; i++) {
			System.out.println((i+1) +". "+ lista[i]);
		}
	}
	public void addElectrodomestico(Electrodomestico el, int pos) {
		lista[pos] = el;
	}
}
