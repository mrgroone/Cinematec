package gui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MantenimientoFunciones extends JDialog implements ActionListener {
	private JTextField txtCodigoSala;
	private JTextField txtCodigoPelicula;
	private JTextField txtCodigoCine;
	private JTextField txtCodigoFuncion;
	private JTextField txtHoraFuncion;
	private JComboBox cboOpciones;
	private JButton btnGrabar;
	private JButton btnListado;
	private JButton btnCerrar;
	private JTextField txtFechaFuncion;
	private JLabel lblCodigoCine;
	private JLabel lblCodigoFuncion;
	private JLabel lblCodigoSala;
	private JLabel lblCodigoPelicula;
	private JLabel lblFechaDeLa;
	private JLabel lblHoraDeLa;

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
					MantenimientoFunciones dialog = new MantenimientoFunciones();
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
	public MantenimientoFunciones() {
		setTitle("Mantenimiento - Funciones");
		setBounds(100, 100, 450, 200);
		getContentPane().setLayout(null);
		
		txtCodigoSala = new JTextField();
		txtCodigoSala.setEditable(false);
		txtCodigoSala.setBounds(170, 58, 91, 20);
		getContentPane().add(txtCodigoSala);
		txtCodigoSala.setColumns(10);
		
		txtCodigoPelicula = new JTextField();
		txtCodigoPelicula.setEditable(false);
		txtCodigoPelicula.setBounds(170, 83, 91, 20);
		getContentPane().add(txtCodigoPelicula);
		txtCodigoPelicula.setColumns(10);
		
		txtCodigoCine = new JTextField();
		txtCodigoCine.setEditable(false);
		txtCodigoCine.setBounds(170, 33, 91, 20);
		getContentPane().add(txtCodigoCine);
		txtCodigoCine.setColumns(10);
		
		txtCodigoFuncion = new JTextField();
		txtCodigoFuncion.setEditable(false);
		txtCodigoFuncion.setBounds(170, 8, 91, 20);
		getContentPane().add(txtCodigoFuncion);
		txtCodigoFuncion.setColumns(10);
		
		txtHoraFuncion = new JTextField();
		txtHoraFuncion.setBounds(170, 133, 91, 20);
		getContentPane().add(txtHoraFuncion);
		txtHoraFuncion.setColumns(10);
		
		cboOpciones = new JComboBox();
		cboOpciones.setModel(new DefaultComboBoxModel(new String[] {"Ingreso", "Modificaci\u00F3n", "Eliminaci\u00F3n"}));
		cboOpciones.setBounds(335, 8, 89, 20);
		getContentPane().add(cboOpciones);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(335, 32, 89, 23);
		getContentPane().add(btnGrabar);
		
		btnListado = new JButton("Listado");
		btnListado.addActionListener(this);
		btnListado.setBounds(335, 57, 89, 23);
		getContentPane().add(btnListado);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 82, 89, 23);
		getContentPane().add(btnCerrar);
		
		txtFechaFuncion = new JTextField();
		txtFechaFuncion.setBounds(170, 108, 91, 20);
		getContentPane().add(txtFechaFuncion);
		txtFechaFuncion.setColumns(10);
		
		lblCodigoCine = new JLabel("Codigo Cine");
		lblCodigoCine.setBounds(10, 36, 57, 14);
		getContentPane().add(lblCodigoCine);
		
		lblCodigoFuncion = new JLabel("Codigo Funcion");
		lblCodigoFuncion.setBounds(10, 11, 73, 14);
		getContentPane().add(lblCodigoFuncion);
		
		lblCodigoSala = new JLabel("Codigo Sala");
		lblCodigoSala.setBounds(10, 61, 56, 14);
		getContentPane().add(lblCodigoSala);
		
		lblCodigoPelicula = new JLabel("Codigo Pelicula");
		lblCodigoPelicula.setBounds(10, 86, 71, 14);
		getContentPane().add(lblCodigoPelicula);
		
		lblFechaDeLa = new JLabel("Fecha de la Funci\u00F3n");
		lblFechaDeLa.setBounds(10, 111, 95, 14);
		getContentPane().add(lblFechaDeLa);
		
		lblHoraDeLa = new JLabel("Hora de la Funci\u00F3n");
		lblHoraDeLa.setBounds(10, 136, 89, 14);
		getContentPane().add(lblHoraDeLa);

	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(arg0);
		}
		if (arg0.getSource() == btnListado) {
			actionPerformedBtnListado(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}
	protected void actionPerformedBtnListado(ActionEvent arg0) {
		ListadoFunciones x = new ListadoFunciones();
		x.setLocationRelativeTo(this);
		x.setVisible(true);
	}
	protected void actionPerformedBtnGrabar(ActionEvent arg0) {
		String s = "¿Esta seguro de Grabar?";
		JOptionPane.showConfirmDialog(this, s);
	}
}
