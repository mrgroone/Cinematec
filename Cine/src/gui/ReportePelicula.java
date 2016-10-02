package gui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class ReportePelicula extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblDe;
	private JLabel lblHasta;
	private JTextField txtHasta;
	private JTextField txtDe;
	private JButton btnBuscar;
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
					ReportePelicula dialog = new ReportePelicula();
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
	public ReportePelicula() {
		setTitle("Pel\u00EDcula m\u00E1s taquillera");
		setBounds(100, 100, 450, 200);
		getContentPane().setLayout(null);
		
		lblDe = new JLabel("De:");
		lblDe.setBounds(10, 11, 46, 14);
		getContentPane().add(lblDe);
		
		lblHasta = new JLabel("Hasta:");
		lblHasta.setBounds(10, 36, 46, 14);
		getContentPane().add(lblHasta);
		
		txtHasta = new JTextField();
		txtHasta.setBounds(66, 33, 86, 20);
		getContentPane().add(txtHasta);
		txtHasta.setColumns(10);
		
		txtDe = new JTextField();
		txtDe.setBounds(66, 8, 86, 20);
		getContentPane().add(txtDe);
		txtDe.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(this);
		btnBuscar.setBounds(335, 7, 89, 23);
		getContentPane().add(btnBuscar);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 32, 89, 23);
		getContentPane().add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 61, 414, 89);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnBuscar) {
			actionPerformedBtnBuscar(e);
		}
	}
	protected void actionPerformedBtnBuscar(ActionEvent e) {
		txtS.setText("Pelicula mas taquillera 01/01/2016 - 01/10/2016: Deadpool");
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
