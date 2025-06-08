package BobConstruye;

public class Apartamento extends Edificio{
private int canApartamento;
private int canPersonas;
private boolean PerMascotas;
public Apartamento(String nombre, String lugar, int tiempo, int presupuesto, int cantidadA, int canPersonas,boolean perMascotas) {
	super(nombre, lugar, tiempo, presupuesto);
	this.canApartamento = cantidadA;
	this.canPersonas = canPersonas;
	PerMascotas = perMascotas;
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
public boolean isPerMascotas() {
	return PerMascotas;
}
public void setPerMascotas(boolean perMascotas) {
	PerMascotas = perMascotas;
}
}
