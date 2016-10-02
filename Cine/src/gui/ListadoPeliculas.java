package gui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListadoPeliculas extends JDialog implements ActionListener {
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
					ListadoPeliculas dialog = new ListadoPeliculas();
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
	public ListadoPeliculas() {
		setTitle("Listado Peliculas");
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
		imprimir("Cantidad de Cines           : 1");
		
		imprimir("");
		imprimir("Codigo                      : 1234");
		imprimir("Nombre                      : Pardo");
		imprimir("Departamento                : Lima");
		imprimir("Provincia                   : Lima");
		imprimir("Distrito                    : Miraflores");
		imprimir("Fecha de Inicio Operaciones : 02/04/1984");
		imprimir("Tipo                        : Prime");		
	}
	
	void imprimir(String x) {
		txtS.append(x + "\n");
	}
	
}
