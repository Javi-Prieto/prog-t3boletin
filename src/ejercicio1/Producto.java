package ejercicio1;

public class Producto {
	//Fields
	private String codProd;
	private String nombre;
	private double precioFabrica;
	private boolean fragil;
	private String categoria;
	
	//Constructors
	public Producto(String codProd, String nombre, double precioFabrica, boolean fragil, String categoria) {
		super();
		this.codProd = codProd;
		this.nombre = nombre;
		this.precioFabrica = precioFabrica;
		this.fragil = fragil;
		this.categoria = categoria;
	}
	
	//Getters and setters
	public String getCodProd() {
		return codProd;
	}

	public void setCodProd(String codProd) {
		this.codProd = codProd;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioFabrica() {
		return precioFabrica;
	}

	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
	}

	public boolean isFragil() {
		return fragil;
	}

	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	
	//To string 
	@Override
	public String toString() {
		return "Producto [codProd=" + codProd + ", nombre=" + nombre + ", precioFabrica=" + precioFabrica + ", fragil="
				+ fragil + ", categoria=" + categoria + "]";
	}
	
	
}
