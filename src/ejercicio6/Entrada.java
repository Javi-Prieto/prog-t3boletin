package ejercicio6;

public class Entrada {
	//Fields
	private int numId, fila, butaca;
	private double precio;
	private boolean ocupada;
	//Constructor
	public Entrada(int numId, int fila, int butaca, double precio, boolean ocupada) {
		super();
		this.numId = numId;
		this.fila = fila;
		this.butaca = butaca;
		this.precio = precio;
		this.ocupada = ocupada;
	}
	//Getter and Setter
	public int getNumId() {
		return numId;
	}
	public void setNumId(int numId) {
		this.numId = numId;
	}
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public int getButaca() {
		return butaca;
	}
	public void setButaca(int butaca) {
		this.butaca = butaca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isOcupada() {
		return ocupada;
	}
	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}
	
}
