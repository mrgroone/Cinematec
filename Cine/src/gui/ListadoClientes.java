package gui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListadoClientes extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnCerrar;

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
					ListadoClientes dialog = new ListadoClientes();
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
	public ListadoClientes() {
		setTitle("Listado Clientes");
		setBounds(100, 100, 370, 450);
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 334, 355);
		getContentPane().add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setEditable(false);
		scrollPane.setViewportView(txtS);
		/*
		 * 
		 */
		pruebaListado();
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(10, 377, 334, 23);
		getContentPane().add(btnCerrar);

	}	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	
	/*
	 * 
	 */
	void pruebaListado() {
		imprimir("Cantidad de Clientes : 1");
		
		imprimir("");
		imprimir("Codigo                : 1234");
		imprimir("Nombres               : Mateo");
		imprimir("Apellido Paterno      : Ramos");
		imprimir("Apellido Materno      : Ramirez");
		imprimir("Direcci�n             : Av. Ejercito 104");
		imprimir("Fecha de Nacimiento   : 02/04/1984");
		imprimir("Fecha de Afiliaci�n   : 11/05/2016");
		imprimir("Estado Civil          : Soltero");
		imprimir("Tel�fono              : 785 5124");
		imprimir("DNI                   : 45278542");
		imprimir("Usuario               : MatRamos");
		imprimir("Contrase�a            : 321654");
		
	}
	
	void imprimir(String x) {
		txtS.append(x + "\n");
	}
	
}
