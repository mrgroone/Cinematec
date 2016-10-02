package gui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ControlPago extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblCodigoDeReserva;
	private JTextField txtCodigoReserva;
	private JButton btnMostrar;
	private JButton btnPagar;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

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
					ControlPago dialog = new ControlPago();
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
	public ControlPago() {
		setTitle("Control de Pago");
		setBounds(100, 100, 450, 450);
		getContentPane().setLayout(null);
		
		lblCodigoDeReserva = new JLabel("Codigo de Reserva");
		lblCodigoDeReserva.setBounds(10, 11, 91, 14);
		getContentPane().add(lblCodigoDeReserva);
		
		txtCodigoReserva = new JTextField();
		txtCodigoReserva.setBounds(111, 8, 86, 20);
		getContentPane().add(txtCodigoReserva);
		txtCodigoReserva.setColumns(10);
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(this);
		btnMostrar.setBounds(335, 7, 89, 23);
		getContentPane().add(btnMostrar);
		
		btnPagar = new JButton("Pagar");
		btnPagar.setBounds(335, 41, 89, 23);
		getContentPane().add(btnPagar);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 75, 89, 23);
		getContentPane().add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 107, 414, 293);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnMostrar) {
			actionPerformedBtnMostrar(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedBtnMostrar(ActionEvent e) {
		imprimir("BOLETA");
	}
	
	void imprimir(String x) {
		txtS.append(x + "\n");
	}
}
