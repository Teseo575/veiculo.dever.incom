package PakageTercera;

import java.util.ArrayList;

public class Gestor {
	ArrayList<Libro> arreglo = new ArrayList<>();
	public static void main(String[] args) {
	
		Ventana ven1 = new Ventana();
		ven1.setVisible(true);
		

}
	public boolean guardarLibro(String isbn, String autor,String titulo) {
		boolean resultado = false;
		
		arreglo.add(new Libro(isbn,autor,titulo));
		
		return resultado;
		
	
}
	
}