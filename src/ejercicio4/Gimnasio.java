package ejercicio4;

public class Gimnasio {
	//Fields
	private Cliente[] lista;
	
	//Constructor
	public Gimnasio(Cliente[] lista) {
		super();
		this.lista = lista;
	}
	
	//Methods
	public int findByDNI(String dni) {
		int i=0;
		boolean encontrado = false;
		while (i < lista.length && !encontrado) {
			if(lista[i].getDni() == null) {
				i++;
			}else if(lista[i].getDni().equalsIgnoreCase(dni)) {
					encontrado = true;
				}else {
					i ++;
				}
			
		}
		return i;
	}
	public double calcularIMC(String dni) {
		return lista[findByDNI(dni)].calcularIMC();
	}
	
	public void addClient(int pos, Cliente cl) {
		lista[pos] = cl;
		System.out.println("Cliente añadido");
	}
	
	public void eliminarCliente(String dni) {
		if(lista[findByDNI(dni)].isActive()) {
			lista[findByDNI(dni)].setActive(false);
			System.out.println("Cliente eliminado correctatmente");
		}else {
			System.out.println("Cliente inexistente");
		}
	}
	public double calcularMediaIMC() {
		double media = 0;
		for(int i = 0; i < lista.length; i++) {
			media += calcularIMC(lista[i].getDni());
		}
		return media / lista.length;
	}
}
