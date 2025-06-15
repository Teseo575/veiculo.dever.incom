package ElMundoacademico;

public class Publicacion {
private String nombre;
private int fecha;
private String digital;
private int canPaginas;
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}


public int getFecha() {
	return fecha;
}
public void setFecha(int fecha) {
	this.fecha = fecha;
}
public String isDigital() {
	return digital;
}
public void setDigital(String digital) {
	this.digital = digital;
}
public int getCanPaginas() {
	return canPaginas;
}
public void setCanPaginas(int canPaginas) {
	this.canPaginas = canPaginas;
}
public Publicacion(String nombre,int fecha, String digital, int canPaginas) {
	this.fecha = fecha;
	this.digital = digital;
	this.canPaginas = canPaginas;
	this.nombre=nombre;
}
}
