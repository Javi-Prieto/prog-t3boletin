package ejercicio6;

public class Sala {
	//Fields
	private int numId, numLocs;
	private Entrada ent;
	private Entrada[] localidades;
	
	//Constructor
	public Sala(int numId, int numLocs, Entrada ent, Entrada[] localidades) {
		super();
		this.numId = numId;
		this.numLocs = numLocs;
		this.ent = ent;
		this.localidades = localidades;
	}
	//Methods
	public void imprimirCartelera() {
		System.out.println("1. Iron Man");
		System.out.println("2. Spider-Man");
		System.out.println("3. VelociPastor");
		System.out.println("4. Bocadillo");
	}
	
	public void comprarEntrada(int num) {
		if(localidades[findByNumId(num)].isOcupada()) {
			System.out.println("Asiento ocupado");
		}else {
			System.out.println("Asiento libre entrada comprada");
			localidades[findByNumId(num)].setOcupada(true);
		}
	}
	public int findByNumId(int num) {
		boolean encontrado = false;
		int i= 0;
		while (i < localidades.length && !encontrado) {
			if(localidades[i].getNumId() == num) {
				encontrado = true;
			}else {
				i++;
			}
		}
		return i;
	}
	public Entrada findByNumIdV2(int num) {
		boolean encontrado = false;
		int i= 0;
		while (i < localidades.length && !encontrado) {
			if(localidades[i].getNumId() == num) {
				encontrado = true;
			}else {
				i++;
			}
		}
		return localidades[i];
	}
	
}
