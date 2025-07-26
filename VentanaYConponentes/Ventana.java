package VentanaYConponentes;
import javax.swing.*;
import java.awt.*;
public class Ventana extends JFrame {

	
	
	
	public Ventana() {
		this.setTitle("Ventana prueba");
		this.setSize(333,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		
		JPanel panel1 =new JPanel();
		this.add(panel1);
		JLabel texto1=new JLabel("Bienvenido al Programa");
		JTextField intexto1=new JTextField("                            ");
		JLabel texto4=new JLabel("    ");
		panel1.add(texto4);
		panel1.add(texto1);
		JLabel texto2=new JLabel("                                                                              ");
		panel1.add(texto2);
		JLabel texto3=new JLabel("Nombre:");
		panel1.add(texto3);
		panel1.add(intexto1);
		JLabel texto5=new JLabel("                                                                                              ");
		panel1.add(texto5);
		JButton boton1 =new JButton("Aceptar");
		panel1.add(boton1);
		
		
}
	}
