package BobConstruye;
import java.util.Scanner;
public class Gestor {

	public static void main(String[] args) {
		Scanner lec = new Scanner(System.in);
		
		int op =0;
		while(op!=3) {
			System.out.println("Nombre del edificio");
			String nombre= lec.next();
			System.out.println("Donde se encuentra el edificio");
			String lugar =lec.next();
			System.out.println("Cuanto cuesta el edificio");
			int presupuesto = lec.nextInt();
			System.out.println("elije una de estas 3 opciones");
			System.out.println("1: Casa");
			System.out.println("2: Apartamento");
			System.out.println("3: Salir");
			op = lec.nextInt();

			switch(op){
			case 1:
				System.out.println("Entraste a la opcion 1:Casa");
				System.out.println("----------------------------");
				System.out.println("Cuantos metros cuadrados tiene el patio");
				int M2patio = lec.nextInt();
				System.out.println("¿Tiene garage?. SI(true),NO(false)");
				boolean garage = lec.hasNextBoolean();
			case 2:
				System.out.println("Entraste a la opcion 2:Apartamento");
				System.out.println("----------------------------");
				System.out.println("Cuantos apartamentos son");
				int canApartamento = lec.nextInt();
				System.out.println("Cuantas personas en los apartamentos son");
				int canPersonas = lec.nextInt();
				System.out.println("¿Permiten mascotas?. SI(true),NO(false)");
				boolean PerMascotas = lec.hasNextBoolean();
			case 3:
				System.out.println("Entraste a la opcion 3:Salir");
				System.out.println("----------------------------");
				System.out.println("Procedemos a cerrar el programa");
				default:
					System.out.println("OPCION NO DISPONIBLE");
					
					
					
			}
		}
		
		
		
		
	}

}
