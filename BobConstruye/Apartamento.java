package BobConstruye;

public class Apartamento extends Edificio{
private int canApartamento;
private int canPersonas;
private boolean PerMascotas;
public Apartamento(String nombre, String lugar, int tiempo, int presupuesto, int cantidadA, int canPersonas) {
	super(nombre, lugar, tiempo, presupuesto);
	this.canApartamento = cantidadA;
	this.canPersonas = canPersonas;
	
}
public int getCantidad() {
	return canApartamento;
}
public void setCantidad(int cantidadA) {
	this.canApartamento= cantidadA;
}
public int getCanPersonas() {
	return canPersonas;
}
public void setCanPersonas(int canPersonas) {
	this.canPersonas = canPersonas;
}

}
