package MegustaelArte;

public class Pintura extends ObreaArte{

	private String estilo;
	private String tecnica;
	public Pintura(String nombre, String autor, String pais, String estilo, String tecnica) {
		super(nombre, autor, pais);
		this.estilo = estilo;
		this.tecnica = tecnica;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	public String getTecnica() {
		return tecnica;
	}
	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}
	
	
	
}
