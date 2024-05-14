package pila_EjemploPractico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class zonaDeJuego extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	private static ImageIcon s1 = new ImageIcon(zonaDeJuego.class.getResource("/pila_EjemploPractico/img/s1.png"));
	private static ImageIcon s2 = new ImageIcon(zonaDeJuego.class.getResource("/pila_EjemploPractico/img/s2.png"));
	private static ImageIcon s3 = new ImageIcon(zonaDeJuego.class.getResource("/pila_EjemploPractico/img/s3.png"));
	private static ImageIcon s4 = new ImageIcon(zonaDeJuego.class.getResource("/pila_EjemploPractico/img/s4.png"));
	   
	private static ImageIcon p1 = new ImageIcon(zonaDeJuego.class.getResource("/pila_EjemploPractico/img/p1.png"));
	private static ImageIcon p2 = new ImageIcon(zonaDeJuego.class.getResource("/pila_EjemploPractico/img/p2.png"));
	private static ImageIcon p3 = new ImageIcon(zonaDeJuego.class.getResource("/pila_EjemploPractico/img/p3.png"));
	private static ImageIcon p4 = new ImageIcon(zonaDeJuego.class.getResource("/pila_EjemploPractico/img/p4.png"));
	
	private static ImageIcon a1 = new ImageIcon(zonaDeJuego.class.getResource("/pila_EjemploPractico/img/a1.png"));
	private static ImageIcon a2 = new ImageIcon(zonaDeJuego.class.getResource("/pila_EjemploPractico/img/a2.png"));
	private static ImageIcon a3 = new ImageIcon(zonaDeJuego.class.getResource("/pila_EjemploPractico/img/a3.png"));
	private static ImageIcon a4 = new ImageIcon(zonaDeJuego.class.getResource("/pila_EjemploPractico/img/a4.png"));

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pilaClothes pila = new pilaClothes();
					pilaClothes pila2 = new pilaClothes();
					pilaClothes pila3 = new pilaClothes();

					zonaDeJuego frame = new zonaDeJuego(pila, pila2, pila3);
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
	public zonaDeJuego(pilaClothes pila, pilaClothes pila2, pilaClothes pila3) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton btnApilar = new JButton("");
		btnApilar.setBackground(new Color(255, 255, 255));
		btnApilar.setIcon(new ImageIcon(zonaDeJuego.class.getResource("/pila_EjemploPractico/img/btnApilar.png")));
		btnApilar.setBounds(48, 150, 100, 37);
		btnApilar.setOpaque(false);
		btnApilar.setContentAreaFilled(false);
		btnApilar.setBorderPainted(false);
		contentPane.add(btnApilar);
        
		JButton btnOptener = new JButton("");
		btnOptener.setIcon(new ImageIcon(zonaDeJuego.class.getResource("/pila_EjemploPractico/img/btnObtener.png")));
		btnOptener.setBounds(207, 158, 129, 29);
		btnOptener.setOpaque(false);
		btnOptener.setContentAreaFilled(false);
		btnOptener.setBorderPainted(false);
		contentPane.add(btnOptener);
		
		JLabel lblClothes1 = new JLabel("");
		lblClothes1.setBounds(43, 39, 69, 67);
		contentPane.add(lblClothes1);
		
		JLabel lblClothes2 = new JLabel("");
		lblClothes2.setBounds(147, 39, 69, 67);
		contentPane.add(lblClothes2);
		
		JLabel lblClothes3 = new JLabel("");
		lblClothes3.setBounds(255, 39, 69, 67);
		contentPane.add(lblClothes3);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(zonaDeJuego.class.getResource("/pila_EjemploPractico/img/fondoPrincipal.png")));
		lblFondo.setBounds(0, 0, 707, 455);
		contentPane.add(lblFondo);
		
		JLabel label = new JLabel("New label");
		label.setBounds(150, 43, 46, 14);
		contentPane.add(label);
		
		btnApilar.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent e) {
				
				pila.PUSH(s1);
				pila.PUSH(s2);
				pila.PUSH(s3);
				pila.PUSH(s4);
				pila.aleatorio();
				
				pila2.PUSH(p1);
				pila2.PUSH(p2);
				pila2.PUSH(p3);
				pila2.PUSH(p4);
				pila2.aleatorio();
				
				pila3.PUSH(a1);
				pila3.PUSH(a2);
				pila3.PUSH(a3);
				pila3.PUSH(a4);
				pila3.aleatorio();
				
				btnOptener.setEnabled(true);
				btnApilar.setEnabled(false);
				
			}
		});
		
		btnOptener.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (pila.EMPTY() && pila2.EMPTY() && pila3.EMPTY()) {
					JOptionPane.showMessageDialog(label, "La pila esta vacia");
					btnApilar.setEnabled(true);
					btnOptener.setEnabled(false);
				}
				
				lblClothes1.setIcon(pila.TOP());
				pila.POP();
				
				lblClothes2.setIcon(pila2.TOP());
				pila2.POP();
				
				lblClothes3.setIcon(pila3.TOP());
				pila3.POP();
				
				
			}
		});
		
	
	}
}
