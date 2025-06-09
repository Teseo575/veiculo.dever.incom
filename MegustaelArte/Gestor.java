package MegustaelArte;
import java.util.Scanner;
public class Gestor {

	public static void main(String[] args) {
		Scanner lec = new Scanner(System.in);
		
		ObreaArte obra1 = new ObreaArte("monalisa", "juan", "italia");
		
		
		
		int op = 0;
		while(op!=4) {
		System.out.println("----------------------------");
		System.out.println("Nombre de la obra de arte");
		String setNombre= lec.next();
		System.out.println("Autor de la obra de arte");
		String setAutor = lec.next();
		System.out.println("País de la obra de arte");
		String setPais = lec.next();
		System.out.println("----------------------------");
		System.out.println("Elije una de las 4 opciones");
		System.out.println("----------------------------");
		System.out.println("Opcion 1:Pintura");
		System.out.println("Opcion 2:Escultura");
		System.out.println("Opcion 3:Fotografia");
		System.out.println("Opcion 4:Salir");
		op = lec.nextInt();
			switch(op){
			case 1: 
				System.out.println("----------------------------");
				System.out.println("Elejiste la opcion 1:Pintura");
				System.out.println("----------------------------");
				System.out.println("Cual es el estilo de la pintura");
				String estilo= lec.next();
				System.out.println("Cual es la tecnica de la pintura");
				String tecnica= lec.next();
				break;
			case 2:
				System.out.println("----------------------------");
				System.out.println("Elejiste la opcion 2:Escultura");
				System.out.println("----------------------------");
				System.out.println("Cual es el material de la escultura");
				String matrerial= lec.next();
				break;
			case 3:
				System.out.println("----------------------------");
				System.out.println("Elejiste la opcion 3:Fotografia");
				System.out.println("----------------------------");
				System.out.println("Cual es la resolucion de la fotografia(Eje.1080 720) ");
				int resolucion= lec.nextInt();
				System.out.println("La fotografia es digital o analogica");
				String digiOanaloga= lec.next();
				break;
				
			case 4:
				System.out.println("Saliendoo....");
				System.out.println("----------------------------");
				System.out.println("saliste exitosamente del programa");
			case 575:
				
				System.out.println("el nombre es "+ obra1.getNombre() );
				
				
				break;
				
			default:
					System.out.println("OPCION INVALIDA");
					break;
				
					
					
					
					
			}
			
			
			
			
			
		}
		
		
		

	}

}
