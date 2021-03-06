package gui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListadoEmpleados extends JDialog implements ActionListener {
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
					ListadoEmpleados dialog = new ListadoEmpleados();
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
	public ListadoEmpleados() {
		setTitle("Listado Empleados");
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
		imprimir("Cantidad de Empleados : 3");
		
		imprimir("");
		imprimir("Codigo                : 1234");
		imprimir("Nombres               : Mateo");
		imprimir("Apellido Paterno      : Ramos");
		imprimir("Apellido Materno      : Ramirez");
		imprimir("Tipo                  : Administrador");
		imprimir("Usuario               : MatRamos");
		imprimir("Contraseņa            : 321654");
		
		imprimir("");
		imprimir("Codigo                : 4567");
		imprimir("Nombres               : Julia");
		imprimir("Apellido Paterno      : Salas");
		imprimir("Apellido Materno      : Perez");
		imprimir("Tipo                  : Supervisor");
		imprimir("Usuario               : Julia12");
		imprimir("Contraseņa            : 388854");
		
		imprimir("");
		imprimir("Codigo                : 7531");
		imprimir("Nombres               : Estefano");
		imprimir("Apellido Paterno      : Chavez");
		imprimir("Apellido Materno      : Miro");
		imprimir("Tipo                  : Cajero");
		imprimir("Usuario               : EsteCh");
		imprimir("Contraseņa            : 88775");
		
	}
	
	void imprimir(String x) {
		txtS.append(x + "\n");
	}
	
}
