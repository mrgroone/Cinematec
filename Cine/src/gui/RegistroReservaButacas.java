package gui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.UIManager;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistroReservaButacas extends JDialog implements ActionListener {
	private JToggleButton A1;
	private JToggleButton A2;
	private JToggleButton A3;
	private JToggleButton A4;
	private JToggleButton A5;
	private JToggleButton A6;
	private JToggleButton A7;
	private JToggleButton tglbtnB;
	private JToggleButton B2;
	private JToggleButton B3;
	private JToggleButton B4;
	private JToggleButton B5;
	private JToggleButton B6;
	private JToggleButton B7;
	private JToggleButton tglbtnC;
	private JToggleButton C2;
	private JToggleButton C3;
	private JToggleButton C4;
	private JToggleButton C5;
	private JToggleButton C6;
	private JToggleButton C7;
	private JToggleButton tglbtnD;
	private JToggleButton D2;
	private JToggleButton D3;
	private JToggleButton D4;
	private JToggleButton D5;
	private JToggleButton D6;
	private JToggleButton D7;
	private JToggleButton tglbtnE;
	private JToggleButton E2;
	private JToggleButton E3;
	private JToggleButton E4;
	private JToggleButton E5;
	private JToggleButton E6;
	private JToggleButton E7;
	private JToggleButton tglbtnF;
	private JToggleButton F2;
	private JToggleButton F3;
	private JToggleButton F4;
	private JToggleButton F5;
	private JToggleButton F6;
	private JToggleButton F7;
	private JLabel lblPantalla;
	private JButton btnReservar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroReservaButacas dialog = new RegistroReservaButacas();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public RegistroReservaButacas() {
		setTitle("Registro Reservas Butacas");
		setBounds(100, 100, 450, 335);
		getContentPane().setLayout(null);
		
		A1 = new JToggleButton("A1");
		A1.setBounds(10, 57, 51, 23);
		getContentPane().add(A1);
		
		A2 = new JToggleButton("A2");
		A2.setBounds(71, 57, 51, 23);
		getContentPane().add(A2);
		
		A3 = new JToggleButton("A3");
		A3.setBounds(132, 57, 51, 23);
		getContentPane().add(A3);
		
		A4 = new JToggleButton("A4");
		A4.setBounds(193, 57, 51, 23);
		getContentPane().add(A4);
		
		A5 = new JToggleButton("A5");
		A5.setBounds(254, 57, 51, 23);
		getContentPane().add(A5);
		
		A6 = new JToggleButton("A6");
		A6.setBounds(315, 57, 51, 23);
		getContentPane().add(A6);
		
		A7 = new JToggleButton("A7");
		A7.setBounds(376, 57, 51, 23);
		getContentPane().add(A7);
		
		tglbtnB = new JToggleButton("B1");
		tglbtnB.setBounds(10, 91, 51, 23);
		getContentPane().add(tglbtnB);
		
		B2 = new JToggleButton("B2");
		B2.setBounds(71, 91, 51, 23);
		getContentPane().add(B2);
		
		B3 = new JToggleButton("B3");
		B3.setBounds(132, 91, 51, 23);
		getContentPane().add(B3);
		
		B4 = new JToggleButton("B4");
		B4.setBounds(193, 91, 51, 23);
		getContentPane().add(B4);
		
		B5 = new JToggleButton("B5");
		B5.setBounds(254, 91, 51, 23);
		getContentPane().add(B5);
		
		B6 = new JToggleButton("B6");
		B6.setBounds(315, 91, 51, 23);
		getContentPane().add(B6);
		
		B7 = new JToggleButton("B7");
		B7.setBounds(376, 91, 51, 23);
		getContentPane().add(B7);
		
		tglbtnC = new JToggleButton("C1");
		tglbtnC.setBounds(10, 125, 51, 23);
		getContentPane().add(tglbtnC);
		
		C2 = new JToggleButton("C2");
		C2.setBounds(71, 125, 51, 23);
		getContentPane().add(C2);
		
		C3 = new JToggleButton("C3");
		C3.setBounds(132, 125, 51, 23);
		getContentPane().add(C3);
		
		C4 = new JToggleButton("C4");
		C4.setBounds(193, 125, 51, 23);
		getContentPane().add(C4);
		
		C5 = new JToggleButton("C5");
		C5.setBounds(254, 125, 51, 23);
		getContentPane().add(C5);
		
		C6 = new JToggleButton("C6");
		C6.setBounds(315, 125, 51, 23);
		getContentPane().add(C6);
		
		C7 = new JToggleButton("C7");
		C7.setBounds(376, 125, 51, 23);
		getContentPane().add(C7);
		
		tglbtnD = new JToggleButton("D1");
		tglbtnD.setBounds(10, 159, 51, 23);
		getContentPane().add(tglbtnD);
		
		D2 = new JToggleButton("D2");
		D2.setBounds(71, 159, 51, 23);
		getContentPane().add(D2);
		
		D3 = new JToggleButton("D3");
		D3.setBounds(132, 159, 51, 23);
		getContentPane().add(D3);
		
		D4 = new JToggleButton("D4");
		D4.setBounds(193, 159, 51, 23);
		getContentPane().add(D4);
		
		D5 = new JToggleButton("D5");
		D5.setBounds(254, 159, 51, 23);
		getContentPane().add(D5);
		
		D6 = new JToggleButton("D6");
		D6.setBounds(315, 159, 51, 23);
		getContentPane().add(D6);
		
		D7 = new JToggleButton("D7");
		D7.setBounds(376, 159, 51, 23);
		getContentPane().add(D7);
		
		tglbtnE = new JToggleButton("E1");
		tglbtnE.setBounds(10, 193, 51, 23);
		getContentPane().add(tglbtnE);
		
		E2 = new JToggleButton("E2");
		E2.setBounds(71, 193, 51, 23);
		getContentPane().add(E2);
		
		E3 = new JToggleButton("E3");
		E3.setBounds(132, 193, 51, 23);
		getContentPane().add(E3);
		
		E4 = new JToggleButton("E4");
		E4.setBounds(193, 193, 51, 23);
		getContentPane().add(E4);
		
		E5 = new JToggleButton("E5");
		E5.setBounds(254, 193, 51, 23);
		getContentPane().add(E5);
		
		E6 = new JToggleButton("E6");
		E6.setBounds(315, 193, 51, 23);
		getContentPane().add(E6);
		
		E7 = new JToggleButton("E7");
		E7.setBounds(376, 193, 51, 23);
		getContentPane().add(E7);
		
		tglbtnF = new JToggleButton("F1");
		tglbtnF.setBounds(10, 227, 51, 23);
		getContentPane().add(tglbtnF);
		
		F2 = new JToggleButton("F2");
		F2.setBounds(71, 227, 51, 23);
		getContentPane().add(F2);
		
		F3 = new JToggleButton("F3");
		F3.setBounds(132, 227, 51, 23);
		getContentPane().add(F3);
		
		F4 = new JToggleButton("F4");
		F4.setBounds(193, 227, 51, 23);
		getContentPane().add(F4);
		
		F5 = new JToggleButton("F5");
		F5.setBounds(254, 227, 51, 23);
		getContentPane().add(F5);
		
		F6 = new JToggleButton("F6");
		F6.setBounds(315, 227, 51, 23);
		getContentPane().add(F6);
		
		F7 = new JToggleButton("F7");
		F7.setBounds(376, 227, 51, 23);
		getContentPane().add(F7);
		
		lblPantalla = new JLabel("PANTALLA");
		lblPantalla.setForeground(Color.BLACK);
		lblPantalla.setBackground(Color.WHITE);
		lblPantalla.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPantalla.setHorizontalAlignment(SwingConstants.CENTER);
		lblPantalla.setBounds(10, 11, 417, 17);
		getContentPane().add(lblPantalla);
		
		btnReservar = new JButton("Reservar");
		btnReservar.addActionListener(this);
		btnReservar.setBounds(10, 262, 417, 23);
		getContentPane().add(btnReservar);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnReservar) {
			actionPerformedBtnReservar(e);
		}
	}
	protected void actionPerformedBtnReservar(ActionEvent e) {
		dispose();
	}
}
