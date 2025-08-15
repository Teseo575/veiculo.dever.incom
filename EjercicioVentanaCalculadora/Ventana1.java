package EjercicioVentanaCalculadora;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Ventana1 extends JFrame{
	
	
	public Ventana1() {
		this.setTitle("Ventana prueba");
		this.setSize(400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	
	
	JPanel panel1 = new JPanel();
	this.add(panel1);
	panel1.setBackground(Color.white);
	
	JPanel panel2 = new JPanel();
	this.add(panel2,BorderLayout.SOUTH);
	panel2.setBackground(Color.green);
	
	JPanel panel3 = new JPanel();
	this.add(panel3,BorderLayout.EAST);
	panel3.setBackground(Color.white);
	
	JLabel eti1 = new JLabel("Numero 1:");
	panel1.add(eti1);
	JTextField tex1 =new JTextField(10);
	panel1.add(tex1);
	JLabel eti2 = new JLabel("Numero 2:");
	panel1.add(eti2);
	JTextField tex2 =new JTextField(10);
	panel1.add(tex2);
	
	
	JButton boton1 = new JButton("+");
	panel3.add(boton1);
	JButton boton2 = new JButton("-");
	panel3.add(boton2);
	JButton boton3 = new JButton("x");
	panel3.add(boton3);
	JButton boton4 = new JButton("/");
	panel3.add(boton4);
	
	JLabel eti3 = new JLabel();
	panel2.add(eti3);
	
	boton1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		
			double numero1 = Double.parseDouble(tex1.getText());
			double numero2 = Double.parseDouble(tex2.getText());
			double numero3= numero1 + numero2 ;
			
			eti3.setText("El Numero es: " + numero3);
		}
	});
	
	boton2.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		
			double numero1 = Double.parseDouble(tex1.getText());
			double numero2 = Double.parseDouble(tex2.getText());
			double numero3= numero1 - numero2 ;
			
			eti3.setText("El Numero es: " + numero3);
		
		}
	});
	
	boton3.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		
			double numero1 = Double.parseDouble(tex1.getText());
			double numero2 = Double.parseDouble(tex2.getText());
			double numero3= numero1 * numero2 ;
			
			eti3.setText("El Numero es: " + numero3);
		}
	});
	boton4.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		
			double numero1 = Double.parseDouble(tex1.getText());
			double numero2 = Double.parseDouble(tex2.getText());
			double numero3= numero1 / numero2 ;
			
			eti3.setText("El Numero es: " + numero3);
		}
	});
	
	
	
}
}