package ejercicio1;


public class Gestion {
	Producto [] lista;

	public Gestion(Producto[] lista) {
		super();
		this.lista = lista;
	}
	
	public void addProducts(Producto p, int pos) {
		lista[pos] = p;
	}
	
	public double calcularPPV(int pos) {
		return lista[pos].getPrecioFabrica() + (lista[pos].getPrecioFabrica()*0.5);
	}
	
	public boolean comprobarFragil(int pos) {
		if(lista[pos].isFragil()) {
			return true;
		}else {
			return false;
		}
	}
	
	public int findById(String codigo) {
		int i = 0;
		boolean encontrado = false;
		while(i < lista.length && !encontrado) {
			Producto deLista = lista[i];
			if(deLista.getCodProd().equalsIgnoreCase(codigo)) {
				encontrado = true;
			}else {
				i++;
			}
		}
		if(encontrado) {
			return i;
		}else {
			return -1;		
		}
	}
	public Producto[] findByName(String name) {
		int i = 0;
		Producto[] mismoNombre = new Producto [lista.length];
		while(i < lista.length) {
			Producto deLista = lista[i];
			if(deLista.getNombre().equalsIgnoreCase(name)) {
				mismoNombre[i] = deLista;
				i++;
			}else {
				i++;
			}
			
		}
		return mismoNombre;
	}
	public void imprimirMismoNombre(String name) {
		for(int i = 0; i < findByName(name).length; i++) {
			if(findByName(name)[i] == null) {
				
			}else {
				System.out.println((i +1)+". "+ findByName(name)[i]);
			}
		}
	}

	public void imprimirTodosLosProdctos() {
		for(int i =0; i < lista.length; i++) {
			System.out.println((i+1) + "- " + lista[i]);
		}
	}
	public boolean addFragil(int pos, int fr) {
		if(fr == 1) {
			return true;
		}else {
			return false;
		}
	}
	
}
