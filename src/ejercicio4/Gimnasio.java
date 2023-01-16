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
			if(lista[0].getDni().equalsIgnoreCase(dni)) {
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
}
