package Super;
import java.util.Scanner;

import MegustaelArte.Escultura;
import MegustaelArte.Fotografia;
import MegustaelArte.ObreaArte;
import MegustaelArte.Pintura;
public class Gestor {
	
	public static void main(String[] args) {
	Scanner lec = new Scanner(System.in);	
	
	Alimento[] alim1 = new Alimento[10];
	Electronica[] ele1= new Electronica[10];
	 Ropa[] rop1= new Ropa[10];
	


	int op = 0;
	while (op != 4) {
		
	
		
	  System.out.println("---------------------");
	  System.out.println("Elije una opcion");
	  System.out.println("---------------------");
		System.out.println("1-Alimento");
		System.out.println("2-Electronica");
		System.out.println("3-Ropa");
		
		op= lec.nextInt();
		
		
		switch (op) {
		case 1: 
			
			System.out.println("----------------------------");
			System.out.println("Elejiste la opcion 1:Alimento");
			System.out.println("----------------------------");
			System.out.println("Cual es el nombre del Alimento");
			String nom1 = lec.next();
			System.out.println("Cual es el ID del Alimento");
			int id1 = lec.nextInt();
			System.out.println("Cual es el fabricante del Alimento");
			String fab1 = lec.next();
			System.out.println("Cual es el vencimiento del Alimento");
			int venci1 = lec.nextInt();
		
			for(int i=0;i<alim1.length; i ++) {
				if(alim1[i]== null) {
					
					alim1[i] = new Alimento(nom1,id1,fab1,venci1);
				}
			}
					
			break;
		case 2:
			System.out.println("------------------------------");
			System.out.println("Elejiste la opcion 2:Electronica");
			System.out.println("------------------------------");
			System.out.println("Cual es el nombre de la electronica");
			String nom2 = lec.next();
			System.out.println("Cual es la ID de la electronica");
			int id2 = lec.nextInt();
			System.out.println("Cual es el fabricante de la electronica");
			String fab2 = lec.next();
			System.out.println("Cual es la garantia de la electronica");
			int gar1 = lec.nextInt();
			for(int i=0;i<ele1.length; i ++) {
				if(ele1[i]== null) {
					
					ele1[i] = new Electronica(nom2,id2,fab2,gar1);
				}
			}	
			break;
	
		case 3:
			System.out.println("------------------------------");
			System.out.println("Elejiste la opcion 3:Ropa");
			System.out.println("------------------------------");
			System.out.println("Cual es el nombre de la ropa");
			String nom3 = lec.next();
			System.out.println("Cual es la ID de la ropa");
			int id3 = lec.nextInt();
			System.out.println("Cual es el país de la ropa");
			String fab3 = lec.next();
			System.out.println("Cual es el tipo de la ropa");
			String tipo= lec.next();
			System.out.println("Cual es el marca de la ropa");
			String marca= lec.next();
			for(int i=0;i<rop1.length; i ++) {
				if(rop1[i]== null) {
					
					rop1[i] = new Ropa(nom3,id3,fab3,tipo,marca);
				}
			}	
			break;
		case 4:
			System.out.println("Saliendoo....");
			System.out.println("---------------------------------");
			System.out.println("saliste exitosamente del programa");
		
		default:
				System.out.println("OPCION INVALIDA");
				
				break;	
		}
		}
		
		
	}
  
	}

}
