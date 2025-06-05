package Super;

public class Productro {
	
	private String nombre;
	private int ID;
	private String fabricante;
    
	public Productro(String nom, int iD, String fabri) {
		this.nombre = nom;
		this.ID = iD;
		this.fabricante = fabri;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	

}
