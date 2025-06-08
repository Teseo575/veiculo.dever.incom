package BobConstruye;

public class Casa extends Edificio{
	
private int M2patio;
private boolean garage;

public Casa(String nombre, String lugar, int tiempo, int presupuesto, int m2patio, boolean garage) {
	super(nombre, lugar, tiempo, presupuesto);
	M2patio = m2patio;
	this.garage = garage;

}
public int getM2patio() {
	return M2patio;
}
public void setM2patio(int m2patio) {
	M2patio = m2patio;
}
public boolean isGarage() {
	return garage;
}
public void setGarage(boolean garage) {
	this.garage = garage;
}

}
