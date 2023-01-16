package ejercicio4;

public class Cliente {
	//Fields
	private String dni, nombre, apellidos;
	private boolean active;
	private double peso, altura;
	//Constructor
	public Cliente(String dni, String nombre, String apellidos, boolean active, double peso, double altura) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.active = active;
		this.peso = peso;
		this.altura = altura;
	}
	//Getter and setter
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	//to string
	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", active=" + active
				+ ", peso=" + peso + ", altura=" + altura + "]";
	}
	//Methods
	public double calcularIMC() {
		return peso / altura*altura;
	}
}
