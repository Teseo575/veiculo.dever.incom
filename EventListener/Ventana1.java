package EventListener;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Ventana1 extends JFrame {
	Persona[] per1 = new Persona[10];

	public Ventana1() {
		this.setTitle("Ventana prueba");
		this.setSize(400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		JPanel panel1 = new JPanel();
		this.add(panel1);

		
	
		JLabel lab1 = new JLabel("Nombre");
		panel1.add(lab1);
		JTextField text1 = new JTextField(10);
		panel1.add(text1);
		JLabel lab2 = new JLabel("Apellido");
		panel1.add(lab2);
		JTextField text2 = new JTextField(10);
		panel1.add(text2);
		

		JButton bot = new JButton("Inicier Secion");
		panel1.add(bot);

		

		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Nombre");
		modelo.addColumn("Apellido");
		

		
		bot.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fun1(per1, modelo);

				String nombre = text1.getText();
				String apellido = text2.getText();
			

				for (int i = 0; i < per1.length; i++) {
					if (per1[i] == null) {

						per1[i] = new Persona(nombre,apellido);
						break;
					}
					System.out.println("Nombre: "+nombre+" Apellido: "+apellido);
				}	
			}

		});
	}

	public static void fun1(Persona[] n, DefaultTableModel modelo) {
		for (int i = 0; i < n.length; i++) {
			if (n[i] != null) {
				Object[] rowData = { n[i].getNombre(), n[i].getApellido()};
				modelo.addRow(rowData);

			} else {
				continue;
				
			}
		
		}
		}

	}
