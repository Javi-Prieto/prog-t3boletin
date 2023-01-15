package ejercicio2;

import java.util.Arrays;

public class Habitacion {
	//Fields
	private String tipo, nombreCli;
	private double precioUnit;
	private String[] extraServ;
	private int numD;
	private boolean ocupada, limpia;
	//Constructor
	public Habitacion(String tipo, String nombreCli, double precioUnit, String[] extraServ, int numD, boolean ocupada,
			boolean limpia) {
		super();
		this.tipo = tipo;
		this.nombreCli = nombreCli;
		this.precioUnit = precioUnit;
		this.extraServ = extraServ;
		this.numD = numD;
		this.ocupada = ocupada;
		this.limpia = limpia;
	}
	//Getters and setters
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombreCli() {
		return nombreCli;
	}
	public void setNombreCli(String nombreCli) {
		this.nombreCli = nombreCli;
	}
	public double getPrecioUnit() {
		return precioUnit;
	}
	public void setPrecioUnit(double precioUnit) {
		this.precioUnit = precioUnit;
	}
	public String[] getExtraServ() {
		return extraServ;
	}
	public void setExtraServ(String[] extraServ) {
		this.extraServ = extraServ;
	}
	public int getNumD() {
		return numD;
	}
	public void setNumD(int numD) {
		this.numD = numD;
	}
	public boolean isOcupada() {
		return ocupada;
	}
	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}
	public boolean isLimpia() {
		return limpia;
	}
	public void setLimpia(boolean limpia) {
		this.limpia = limpia;
	}
	//To String
	@Override
	public String toString() {
		return "Habitacion [tipo=" + tipo + ", nombreCli=" + nombreCli + ", precioUnit=" + precioUnit + ", extraServ="
				+ Arrays.toString(extraServ) + ", numD=" + numD + ", ocupada=" + ocupada + ", limpia=" + limpia + "]";
	}
	
}
