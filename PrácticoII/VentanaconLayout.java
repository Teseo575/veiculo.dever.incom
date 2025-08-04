package PrácticoII;
import javax.swing.*;
import java.awt.*;
public class VentanaconLayout extends JFrame {

	public VentanaconLayout() {
		this.setTitle("Reguistrar Usuario");
		this.setSize(250,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JPanel panel1 =new JPanel();
		this.add(panel1);
		
		
		this.add(panel1);
		JLabel L1= new JLabel("Nombre:    ");
		panel1.add(L1);
		JTextField T1= new JTextField("                                        ");
		panel1.add(T1);
		JLabel L2= new JLabel("Apellido:  ");
		panel1.add(L2);
		JTextField T2= new JTextField("                                        ");
		panel1.add(T2);
		JLabel L3= new JLabel("Cedula:     ");
		panel1.add(L3);
		JTextField T3= new JTextField("                                        ");
		panel1.add(T3);
		JLabel L4= new JLabel("Edad:        ");
		panel1.add(L4);
		JTextField T4= new JTextField("                                        ");
		panel1.add(T4);
		JLabel L5= new JLabel("Rol:         ");
		panel1.add(L5);
		String[] opcion = {"Estudiante","Prefesor","POB","Externo"};
		JComboBox CB1= new JComboBox(opcion);
		panel1.add(CB1);
		JButton B1= new JButton("   Reguistrar   ");
		panel1.add(B1);
		
		
}
	}
