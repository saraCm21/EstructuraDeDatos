package EjemploPractico_1;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPantalla extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static colaTickets colaG;
	private static colaTickets colaP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPantalla frame = new MenuPantalla(null, null);
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
	public MenuPantalla(colaTickets colaG, colaTickets colaP) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 673, 420);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnGeneral = new JButton("");
		btnGeneral.setIcon(new ImageIcon(MenuPantalla.class.getResource("/EjemploPractico_1/img/nextGeneral.png")));
		btnGeneral.setBounds(129, 159, 114, 28);
		btnGeneral.setBorderPainted(false);
		btnGeneral.setContentAreaFilled(false);
		btnGeneral.setOpaque(false);
		panel.add(btnGeneral);
		
		JButton btnPrioritario = new JButton("");
		btnPrioritario.setIcon(new ImageIcon(MenuPantalla.class.getResource("/EjemploPractico_1/img/nextPrioritario.png")));
		btnPrioritario.setBounds(129, 242, 114, 28);
		btnPrioritario.setOpaque(false);
		btnPrioritario.setContentAreaFilled(false);
		btnPrioritario.setBorderPainted(false);
		panel.add(btnPrioritario);
		
		JLabel lblTicketGeneral = new JLabel("");
		lblTicketGeneral.setBounds(281, 74, 274, 28);
		lblTicketGeneral.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblTicketGeneral);
		
		JLabel lblTicketPrioritario = new JLabel("");
		lblTicketPrioritario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTicketPrioritario.setBounds(281, 136, 274, 28);
		panel.add(lblTicketPrioritario);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(MenuPantalla.class.getResource("/EjemploPractico_1/img/fondoPantalla.png")));
		lblFondo.setBounds(0, 0, 673, 420);
		panel.add(lblFondo);
		
		
		btnGeneral.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(colaG.size == 0) {
					lblTicketGeneral.setText("");
				}else {
					lblTicketGeneral.setText("Turno N° " + colaG.Frente() + " Ventana 1");
					colaG.Desencolar();
				}
				
			}
		});
		
		btnPrioritario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(colaP.size == 0) {
					lblTicketPrioritario.setText("");
				}else {
					lblTicketPrioritario.setText("Turno N° " + colaP.Frente() + " Ventana 2");
					colaP.Desencolar();
				}
				
				
			}
		});
	}
}
