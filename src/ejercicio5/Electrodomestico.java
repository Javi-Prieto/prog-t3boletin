package ejercicio5;

public class Electrodomestico {
	//Fields
	private double precioBase = 100, peso;
	private String color = "blanco";
	private char consumoEnergetico = 'F';
	//Constructor
	public Electrodomestico() {
		super();
	}
	public Electrodomestico(double precioBase, double peso, String color, char consumoEnergetico) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
	}
	public Electrodomestico(double precioBase, double peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
	}
	//Getter and setter
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}
	//Methods
	public char comprobarConsumoElectrico(char cons) {
		int i= 0;
		boolean encontrado = false;
		char[] consumos = {'A', 'B', 'C', 'D', 'E', 'F'};
		while(i < consumos.length && !encontrado) {
			if(cons == consumos[i]) {
				encontrado = true;
			}else {
				i++;
			}
		}
		if(encontrado) {
			return consumos[i];
		}else {
			return consumoEnergetico;
		}
		
	}
	public String comprobarColor(String colorU) {
		int i= 0;
		boolean encontrado = false;
		String[] colores = {"blanco", "rojo", "azul", "negro", "gris"};
		while(i < colores.length && !encontrado) {
			if(colores[i].equalsIgnoreCase(colorU)) {
				encontrado = true;
			}else {
				i++;
			}
		}
		if(encontrado) {
			return colorU;
		}else {
			return color;
		}
	}
	public double precioFinal(char cons) {
		switch (cons) {
			case 'A':
				return precioBase + 100;
			case 'B':
				return precioBase + 80;
				
			case 'C':
				return precioBase + 60;
				
			case 'D':
				return precioBase + 50;
				
			case 'E':
				return precioBase + 30;
				
			case 'F':
				return precioBase + 10;
			default:
				return precioBase;
		}
	}
	public int compareTo(Electrodomestico el) {
		if(this.getColor().equalsIgnoreCase(el.getColor())
				&& this.getConsumoEnergetico() == el.getConsumoEnergetico()
				&& this.getPeso() == el.getPeso()
				&& this.getPrecioBase() == el.getPrecioBase()) {
			return 0;
		}
		return 1;
	}
	//To string
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", peso=" + peso + ", color=" + color
				+ ", consumoEnergetico=" + consumoEnergetico + "]";
	}
	
	
}
