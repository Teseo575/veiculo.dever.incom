package BobConstruye;

public class Edificio {
private String nombre;
private String lugar;
private int tiempo;
private int presupuesto;

public Edificio(String nombre, String lugar, int tiempo, int presupuesto) {
	this.nombre = nombre;
	this.lugar = lugar;
	this.tiempo = tiempo;
	this.presupuesto = presupuesto;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getLugar() {
	return lugar;
}
public void setLugar(String lugar) {
	this.lugar = lugar;
}
public int getTiempo() {
	return tiempo;
}
public void setTiempo(int tiempo) {
	this.tiempo = tiempo;
}
public int getPresupuesto() {
	return presupuesto;
}
public void setPresupuesto(int presupuesto) {
	this.presupuesto = presupuesto;
}

}
