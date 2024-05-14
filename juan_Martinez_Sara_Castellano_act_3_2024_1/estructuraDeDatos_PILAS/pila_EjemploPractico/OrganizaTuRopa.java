package pila_EjemploPractico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrganizaTuRopa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrganizaTuRopa frame = new OrganizaTuRopa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OrganizaTuRopa() {
		this.setLocationRelativeTo(null);
		this.setTitle("Organiza Tu Ropa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(OrganizaTuRopa.class.getResource("/pila_EjemploPractico/img/btnS.png")));
		btnNewButton.setBounds(366, 225, 68, 59);
		btnNewButton.setOpaque(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(OrganizaTuRopa.class.getResource("/pila_EjemploPractico/img/fondoInicio.png")));
		lblNewLabel.setBounds(0, 0, 707, 449);
		contentPane.add(lblNewLabel);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(lblNewLabel, 
						"El siguinte programa tiene el fin de simular un ecenario de la vida "
						+ "\n" + "real donde se apila ropa a modo de ejemplo practico para el concepto "
						+ "\n" + "y uso de pilas, este programa organiza de manera aleatoria un conjunto "
						+ "\n" + "de elementos (la ropa) en una pila, para posteriormente mostrar un "
						+ "\n" + "conjunto de elementos en pantalla que simularian la accion de tomar "
						+ "\n" + "una prenda en una pila de ropa");
				
				pilaClothes pila = new pilaClothes();
				pilaClothes pila2 = new pilaClothes();
				pilaClothes pila3 = new pilaClothes();
				zonaDeJuego pagina = new zonaDeJuego(pila, pila2, pila3);
				pagina.setVisible(true);
				dispose();
			}
		});
		
		
	}
}
