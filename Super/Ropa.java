package Super;

public class Ropa extends Productro {
private String tipo;
private String marca;
	public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
	public Ropa(String nom, int iD, String fabri, String tipo, String marca) {
	super(nom, iD, fabri);
	this.tipo = tipo;
	this.marca = marca;
}
	public static void main(String[] args) {

	}

}
