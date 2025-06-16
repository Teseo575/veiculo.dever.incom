package BobConstruye;

public class Casa extends Edificio{
	
private int M2patio;
private boolean garage;

public Casa(String nombre, String lugar, int tiempo, int presupuesto, int m2patio) {
	super(nombre, lugar, tiempo, presupuesto);
	M2patio = m2patio;
	

}
public int getM2patio() {
	return M2patio;
}
public void setM2patio(int m2patio) {
	M2patio = m2patio;
}

@Override
	public String toString() {
		
		return "casa"+M2patio ;
	}

}
