package PakageTercera;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.*;

	public class Ventana extends JFrame {
		
		Gestor logica = new Gestor();
		
		public Ventana() {
			this.setTitle("Biblioteca");
			this.setSize(500, 200);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			this.setLayout(new FlowLayout());

			JLabel L1 = new JLabel("ISBN");
			JLabel L2 = new JLabel("AUTOR");
			JLabel L3 = new JLabel("TITULO");
			JTextField T1 = new JTextField(6);
			JTextField T2 = new JTextField(6);
			JTextField T3 = new JTextField(6);
			JButton B1 = new JButton("REGISTRAR");

			this.add(L1);
			this.add(T1);
			this.add(L2);
			this.add(T2);
			this.add(L3);
			this.add(T3);
			this.add(B1);
			
			B1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					logica.guardarLibro(T1.getText(), T2.getText(),T2.getText());
					
				}

			});
		}
	}
