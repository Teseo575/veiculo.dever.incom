package ElMundoacademico;

public class LIbro extends Publicacion {
	
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LIbro(String nombre, int fecha, String digital, int canPaginas, String tipo) {
		super(nombre, fecha, digital, canPaginas);
		this.tipo = tipo;
	}
	
	

}
