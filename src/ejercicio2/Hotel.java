package ejercicio2;

public class Hotel {
	//Fields
	private Habitacion [] lista;
	//Constructor

	public Hotel(Habitacion[] lista) {
		super();
		this.lista = lista;
	}
	//Methods
	public void addHabitacion(Habitacion hab, int pos) {
		lista[pos] = hab;
	}
	public boolean comprobarLimpieza(int num) {
		if (num == 1) {
			return true;
		}else {
			return false;
		}
	}
}
