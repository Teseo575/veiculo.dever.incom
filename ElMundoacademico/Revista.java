package ElMundoacademico;

public class Revista extends Publicacion{
	private String ilustrador;
	private String Fotografo;
	
	public String getIlustrador() {
		return ilustrador;
	}

	public void setIlustrador(String ilustrador) {
		this.ilustrador = ilustrador;
	}

	public String getFotografo() {
		return Fotografo;
	}

	public void setFotografo(String fotografo) {
		Fotografo = fotografo;
	}

	public Revista(String nombre, int fecha, boolean digital, int canPaginas, String ilustrador, String fotografo) {
		super(nombre, fecha, digital, canPaginas);
		this.ilustrador = ilustrador;
		Fotografo = fotografo;
	}

}
