package ElMundoacademico;
import java.util.Scanner;
public class Gestor {

	public static void main(String[] args) {
		Scanner lec = new Scanner(System.in);
		
		LIbro[] lib1= new LIbro[10];
		ArticuloCientifico[] art1= new ArticuloCientifico[10];
		Revista[] rev1= new Revista[10];
		
		
		int op = 0;
		int al = 0;
		while(op != 4) {
			System.out.println("----------------------------");
			System.out.println("Ingrese la opcion deseada");
			System.out.println("----------------------------");
			System.out.println("1:Alta");
			System.out.println("2:Baja");
			System.out.println("3:Modificar");
			System.out.println("4:Listar");
			System.out.println("5:salir");
			op= lec.nextInt();
		
			switch (op){
			case 1:
				System.out.println("------------Alta------------");
				System.out.println("Elije una de las opciones");
				System.out.println("----------------------------");
				System.out.println("  1:Libro");
				System.out.println("  2:Articulo Cientifico");
				System.out.println("  3:Revista");
				System.out.println("  4:Salir");
			System.out.print("-");
				al= lec.nextInt();
				
				switch(al){
				case 1: 
					
					
					System.out.println("----------------------------");
					System.out.println("Elejiste la opcion 1:Libro");//String nombre, int fecha, boolean digital,int canPaginas, 
					System.out.println("----------------------------");// String tipo
					System.out.println("Cual es el nombre del libro");
					String nom1 = lec.next();
					System.out.println("Cual es la fecha en que se publico el libro");
					int fec1 = lec.nextInt();
					System.out.println("El libro es digital o fisico(escribe digital o fisico)");
					String digi1 = lec.next();
					System.out.println("Cuantas paginas tiene el libro");
				    int canp1 = lec.nextInt();
					System.out.println("De que es el libro(Eje:ficion)");
					String tipo = lec.next();
					for(int i=0;i<lib1.length; i ++) {
						if(lib1[i]== null) {
							
							lib1[i] = new LIbro(nom1,fec1,digi1,canp1,tipo);
						}
					}
							
					break;
				case 2:
					System.out.println("------------------------------");
					System.out.println("Elejiste la opcion 2:Articulo Cientifico");
					System.out.println("------------------------------");
					System.out.println("Cual es el nombre del articulo cientifico");
					String nom2 = lec.next();
					System.out.println("Cuando se publico el articulo cientiico");
					int fec2 = lec.nextInt();
					System.out.println("El articulo cientifico es digital o fisico(escribe digital o fisico)");
					String digi2 = lec.next();
					System.out.println("Cuantas paginas tiene el articulo cientifico");
				    int canp2 = lec.nextInt();
					System.out.println("Cuatos cientificos trabajaron en el articulo cientifico");
					int canC = lec.nextInt();
					for(int i=0;i<art1.length; i ++) {
						if(art1[i]== null) {
							
							art1[i] = new ArticuloCientifico(nom2,fec2,digi2,canp2,canC);
						}
					}	
					break;
				case 3:
					System.out.println("------------------------------");
					System.out.println("Elejiste la opcion 3:Revista");
					System.out.println("------------------------------");
					System.out.println("Como se llama la revista");
					String nom3 = lec.next();
					System.out.println("Cuando fue la fecha de publicacion de la revista");
					int fec3 = lec.nextInt();
					System.out.println("El revista es digital o fisico(escribe digital o fisico)");
					String digi3 = lec.next();
					System.out.println("Cuantas paginas tiene la revista");
				    int canp3 = lec.nextInt();
					System.out.println("Quien es el ilustrador de la revista");
					String ilus = lec.next();
					System.out.println("Quien es el Fotografo de la revista");
					String foto = lec.next();
					for(int i=0;i<rev1.length; i ++) {
						if(rev1[i]== null) {
							
							rev1[i] = new Revista(nom3,fec3,digi3,canp3,ilus,foto);
						}
					}	
					break;
			default:
				System.out.println("");
				System.out.println("OPCION NO VALIDA");
			    System.out.println("");
			    break;  
				}
				
			case 2:
			System.out.println("------------Baja------------");
			System.out.println("Elije una de las opciones");
			System.out.println("----------------------------");
				
				System.out.println("Ingrese el nombre de la publicacion que quieres eliminar");
				break;
			case 3:
				System.out.println("----------Modificar---------");
				System.out.println("Elije una de las opciones");
				System.out.println("----------------------------");
				break;
			case 4:
				System.out.println("----------------------------");
				System.out.println("------------Listar----------");
				System.out.println("----------------------------");
				System.out.println( lib1= new LIbro[10]);
				break;
			case 5:
				System.out.println("saliendo....");
				System.out.println("            ......");
				System.out.println("Saliste Exitosamente");
				
			}
		}
	}
}