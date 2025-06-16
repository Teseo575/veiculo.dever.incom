package BobConstruye;
import java.util.Scanner;
public class Gestor {

	public static void main(String[] args) {
		Scanner lec = new Scanner(System.in);
		
		
		Casa[] cas1= new Casa[10];
		 Apartamento[] apa1= new Apartamento[10];
		
		int op =0;
		while(op!=3) {
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
					System.out.println("  1:Casa");
					System.out.println("  2:Apartamento");
					al= lec.nextInt();
					
					switch(al){
					case 1: 
						
						
						System.out.println("----------------------------");
						System.out.println("Elejiste la opcion 1:Casa"); 
						System.out.println("----------------------------");
						System.out.println("Cual es el nombre de la casa");
						String nom1 = lec.next();
						System.out.println("Donde queda la casa");
						String lug1 = lec.next();
						System.out.println("Cuantos meses demoro la construcion de la casa");
						int tiem1 = lec.nextInt();
						System.out.println("Cual fue el presupuesto de la casa");
					    int pres1 = lec.nextInt();
						System.out.println("cuantos metros cuadrados tiene la casa");
						int m2p = lec.nextInt();
						for(int i=0;i<cas1.length; i ++) {
							if(cas1[i]== null) {
								
								cas1[i] = new Casa(nom1,lug1,tiem1,pres1,m2p);
//String nombre, String lugar, int tiempo, int presupuesto, int m2patio							
							}
						}
								
						break;
					case 2:
						System.out.println("------------------------------");
						System.out.println("Elejiste la opcion 2:Apartamento");
						System.out.println("------------------------------");
						System.out.println("Cual es el nombre del edificio");
						String nom2 = lec.next();
						System.out.println("Donde queda el edificio");
						String lug2 = lec.next();
						System.out.println("Cuanto meses demoro la constricion del edificio");
						int tiem2 = lec.nextInt();
						System.out.println("Cual fue el presupuesto del edificio");
					    int pres2 = lec.nextInt();
						System.out.println("Caul es la cantiad de apartamentos");
						int canA = lec.nextInt();
						System.out.println("Cantidad de personas");
						int canP = lec.nextInt();
						for(int i=0;i<apa1.length; i ++) {
							if(apa1[i]== null) {
								
								apa1[i] = new Apartamento(nom2,lug2,tiem2,pres2,canA,canP);
//String nombre, String lugar, int tiempo, int presupuesto, int cantidadA, int canPersonas							
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
					System.out.println("------------Listar----------");//le pregunte a chat gpt la parte de listar
					System.out.println("----------------------------");//igual no lo termine a tiempo
					
					break;
				case 5:
					System.out.println("saliendo....");
					System.out.println("            ......");
					System.out.println("Saliste Exitosamente");
					
				
			}
				}
			}
		}
	}
		
	

