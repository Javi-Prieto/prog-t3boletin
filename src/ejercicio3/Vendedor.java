package ejercicio3;

public class Vendedor {
	//Fields
	private Movil[] lista;
	private double totalV;
	
	
	//Constructor
	public Vendedor(Movil[] lista) {
		super();
		this.lista = lista;
	}
	//Getter and setter
	
	public double getTotalV() {
		return totalV;
	}

	public void setTotalV(double totalV) {
		this.totalV = totalV;
	}

	//Methods
	public int comprobarMoviles() {
		int i;
		for( i = 0; i < lista.length; i++) {
			if(lista[i].isVendido()) {
				i++;
			}
		}
		return i;
	}
	public void imprimirMov() {
		if(comprobarMoviles() == 0) {
			System.out.println("No quedan móviles");
		}else {
			System.out.println("Quedan móviles");
		}
	}
	public void imprimirCantMovil() {
		if(comprobarMoviles() == 0) {
			System.out.println("No quedan móviles");
		}else {
			System.out.println("Quedan " + comprobarMoviles() + " móviles");
		}
	}
	public double[] precioFinal(double desc, String name) {
		double[] preciosF = new double [lista.length];
		for (int i = 0; i < findByModel(name).length; i++) {
			if(findByModel(name)[i] == null) {
				preciosF[i] = findByModel(name)[i].getPrecioU();
			}else {
				preciosF[i] = findByModel(name)[i].getPrecioU() * (desc /100);
			}
		}
		return preciosF;
	}
	public void imprimirPreciosFinales(double desc, String name) {
		for(int i = 0; i < precioFinal(desc,name).length; i++) {
			if(precioFinal(desc,name)[i] == 0) {
				
			}else {
				System.out.println("El precio del " + (i+1) + " movil es " + precioFinal(desc,name)[i]);
			}
		}
	}
	public Movil[] findByModel(String name) {
		int i = 0;
		Movil [] modls = new Movil[lista.length];
		while(i < lista.length) {
			if(lista[i].getModel().equalsIgnoreCase(name)) {
				modls[i] = lista[i];
			}else {
				modls[i] = null;
			}
			i++;
		}
		return modls;
	}
	public void totalRecibido() {
		for(int i = 0; i < lista.length; i++) {
			totalV += lista[i].getPrecioU();
		}
	}
}
