package Super;
import java.util.Scanner;
public class Gestor {
	
	public static void main(String[] args) {
	Scanner lec = new Scanner(System.in);	

	int op = 0;
	while (op != 4) {
		
		System.out.println("ingrese el nombre del producto");
		String nombre = lec.next();
		System.out.println("ingrese el ID del producto");
		int ID = lec.nextInt();
		System.out.println("ingrese el fabricante del producto");
		String fabricante= lec.next();
		
	  System.out.println("---------------------");
	  System.out.println("Elije una opcion");
	  System.out.println("---------------------");
		System.out.println("1-Electronica");
		System.out.println("2-Alimento");
		System.out.println("3-Ropa");
		op= lec.nextInt();
		
		
		switch (op) {
		  case 1:
		    System.out.println("ingrese la garantia");
		    int garantia = lec.nextInt();
		    break;
		  default:
		    System.out.println("No es una opcion valida");
		}
		
		
	}
  
	}

}
