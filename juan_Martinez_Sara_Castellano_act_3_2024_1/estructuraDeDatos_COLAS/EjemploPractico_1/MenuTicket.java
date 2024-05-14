package EjemploPractico_1;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuTicket extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int nGeneral = 1;
	private int nPrioritario = 1;
	private static colaTickets colaG;
	private static colaTickets colaP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuTicket frame = new MenuTicket();
					frame.setVisible(true);
					colaG = new colaTickets();
					colaP = new colaTickets();
					MenuPantalla pantalla = new MenuPantalla(colaG, colaP);
					pantalla.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuTicket() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 689, 459);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 673, 420);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(155, 104, 163, 217);
		panel_1.setOpaque(false);
		panel_1.setVisible(false);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTurno = new JLabel("", SwingConstants.CENTER);
		lblTurno.setBounds(38, 88, 76, 23);
		lblTurno.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(lblTurno);
		
		JLabel lblfondoticket = new JLabel("");
		lblfondoticket.setIcon(new ImageIcon(MenuTicket.class.getResource("/EjemploPractico_1/img/fondoticket.png")));
		lblfondoticket.setBounds(27, 47, 100, 97);
		panel_1.add(lblfondoticket);
		
		JButton btnAceptar = new JButton("");
		btnAceptar.setIcon(new ImageIcon(MenuTicket.class.getResource("/EjemploPractico_1/img/btnAceptar.png")));
		btnAceptar.setOpaque(false);
		btnAceptar.setContentAreaFilled(false);
		btnAceptar.setBorderPainted(false);
		btnAceptar.setBounds(38, 155, 89, 23);
		panel_1.add(btnAceptar);
		
		JButton btnGeneral = new JButton("");
		btnGeneral.setIcon(new ImageIcon(MenuTicket.class.getResource("/EjemploPractico_1/img/btnGeneral.png")));
		btnGeneral.setBounds(177, 163, 114, 33);
		panel.add(btnGeneral);
		
		JButton btnPrioritario = new JButton("");
		btnPrioritario.setIcon(new ImageIcon(MenuTicket.class.getResource("/EjemploPractico_1/img/btnPrioritario.png")));
		btnPrioritario.setBounds(177, 227, 114, 33);
		panel.add(btnPrioritario);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(MenuTicket.class.getResource("/EjemploPractico_1/img/inicio.png")));
		lblFondo.setBounds(0, 0, 673, 420);
		panel.add(lblFondo);
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				btnGeneral.setVisible(true);
				btnPrioritario.setVisible(true);
			}
		});
		
		btnGeneral.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnGeneral.setVisible(false);
				btnPrioritario.setVisible(false);
				panel_1.setVisible(true);
				
				String turno = "G-" + nGeneral+"";
				lblTurno.setText(turno);
				colaG.Encolar(turno);
				nGeneral++;
				
				
			}
		});
		
		btnPrioritario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnGeneral.setVisible(false);
				btnPrioritario.setVisible(false);
				panel_1.setVisible(true);	
				
				String turno = "P-" + nPrioritario+"";
				lblTurno.setText(turno);
				colaP.Encolar(turno);
				nPrioritario++;
			}
		});
	}
}
