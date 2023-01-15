package ejercicio3;

public class Movil {
	//Fields
	private String marca, model;
	private boolean vendido;
	private double precioU;
	//Constructor
	public Movil(String marca, String model, boolean vendido, double precioU) {
		super();
		this.marca = marca;
		this.model = model;
		this.vendido = vendido;
		this.precioU = precioU;
	}
	//Getter and setter
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public boolean isVendido() {
		return vendido;
	}
	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}
	public double getPrecioU() {
		return precioU;
	}
	public void setPrecioU(double precioU) {
		this.precioU = precioU;
	}
	//to string
	@Override
	public String toString() {
		return "Movil [marca=" + marca + ", model=" + model + ", vendido=" + vendido + ", precioU=" + precioU + "]";
	}
	
}
