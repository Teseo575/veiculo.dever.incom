package MegustaelArte;

public class Escultura extends ObreaArte{
	
	private String material;

	public Escultura(String nombre, String autor, String pais, String material) {
		super(nombre, autor, pais);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	
	

}
