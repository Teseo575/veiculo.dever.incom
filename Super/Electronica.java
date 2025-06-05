package Super;

public class Electronica extends Productro {

	private int garantia;
	
	
	public int getGarantia() {
		return garantia;
	}


	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}


	public Electronica(String nom, int iD, String fabri, int garantia) {
		super(nom, iD, fabri);
		this.garantia = garantia;
	}


	public static void main(String[] args) {
	

	}

}
