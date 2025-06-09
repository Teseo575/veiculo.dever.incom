package MegustaelArte;

public class Fotografia extends ObreaArte{

	private int resolucion;  // Ej: 1080 720
	private String digiOanaloga;
	public Fotografia(String nombre, String autor, String pais, int resolucion, String digiOanaloga) {
		super(nombre, autor, pais);
		this.resolucion = resolucion;
		this.digiOanaloga = digiOanaloga;
		
	}
	public int getResolucion() {
		return resolucion;
	}
	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}
	public String getDigiOanaloga() {
		return digiOanaloga;
	}
	public void setDigiOanaloga(String digiOanaloga) {
		this.digiOanaloga = digiOanaloga;
	} 
	
	
	
	
	
	
	
	
	
}
