package Super;

public class Alimento extends Productro{
public int getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(int vencimiento) {
		this.vencimiento = vencimiento;
	}
public Alimento(String nom, int iD, String fabri, int vencimiento) {
		super(nom, iD, fabri);
		this.vencimiento = vencimiento;
	}
private int vencimiento;
	public static void main(String[] args) {

	}

}
