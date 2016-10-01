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

public class MantenimientoPeliculas extends JDialog implements ActionListener {
	private JLabel lblCodigo;
	private JTextField txtTituloOriginal;
	private JTextField txtFechaEstreno;
	private JTextField txtTituloDistribucion;
	private JTextField txtCodigo;
	private JTextField txtGenero;
	private JComboBox cboOpciones;
	private JButton btnGrabar;
	private JButton btnListado;
	private JButton btnCerrar;
	private JLabel lblPaisDeOrigen;
	private JLabel lblGenero;
	private JLabel lblTituloDeDistribucion;
	private JLabel lblTituloOriginal;
	private JLabel lblFechaDeEstreno;
	private JLabel lblTipoDeProyeccion;
	private JComboBox cboTipoProyeccion;
	private JTextField txtPaisOrigen;
	private JLabel lblSinopsis;
	private JTextField textSinopsis;
	private JLabel lblDuracion;
	private JTextField txtDuracion;
	private JLabel lblTipoDeCensura;
	private JTextField txtTipoCensura;
	private JLabel lblEstadoDeProyeccion;
	private JTextField txtEstadoProyeccion;
	private JLabel lblRecaudacin;
	private JTextField txtRecaudacion;

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
					MantenimientoPeliculas dialog = new MantenimientoPeliculas();
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
	public MantenimientoPeliculas() {
		setTitle("Mantenimiento - Peliculas");
		setBounds(100, 100, 450, 350);
		getContentPane().setLayout(null);
		
		lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(10, 11, 33, 14);
		getContentPane().add(lblCodigo);
		
		txtTituloOriginal = new JTextField();
		txtTituloOriginal.setBounds(170, 58, 108, 20);
		getContentPane().add(txtTituloOriginal);
		txtTituloOriginal.setColumns(10);
		
		txtFechaEstreno = new JTextField();
		txtFechaEstreno.setBounds(170, 83, 108, 20);
		getContentPane().add(txtFechaEstreno);
		txtFechaEstreno.setColumns(10);
		
		txtTituloDistribucion = new JTextField();
		txtTituloDistribucion.setBounds(170, 33, 108, 20);
		getContentPane().add(txtTituloDistribucion);
		txtTituloDistribucion.setColumns(10);
		
		txtCodigo = new JTextField();
		txtCodigo.setEditable(false);
		txtCodigo.setBounds(170, 8, 108, 20);
		getContentPane().add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtGenero = new JTextField();
		txtGenero.setBounds(170, 133, 108, 20);
		getContentPane().add(txtGenero);
		txtGenero.setColumns(10);
		
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
		
		lblPaisDeOrigen = new JLabel("Pa\u00EDs de origen");
		lblPaisDeOrigen.setBounds(10, 161, 67, 14);
		getContentPane().add(lblPaisDeOrigen);
		
		lblGenero = new JLabel("Genero");
		lblGenero.setBounds(10, 136, 35, 14);
		getContentPane().add(lblGenero);
		
		lblTituloDeDistribucion = new JLabel("T\u00EDtulo de distribuci\u00F3n");
		lblTituloDeDistribucion.setBounds(10, 36, 98, 14);
		getContentPane().add(lblTituloDeDistribucion);
		
		lblTituloOriginal = new JLabel("T\u00EDtulo original ");
		lblTituloOriginal.setBounds(10, 61, 66, 14);
		getContentPane().add(lblTituloOriginal);
		
		lblFechaDeEstreno = new JLabel("Fecha de estreno");
		lblFechaDeEstreno.setBounds(10, 86, 84, 14);
		getContentPane().add(lblFechaDeEstreno);
		
		lblTipoDeProyeccion = new JLabel("Tipo de proyecci\u00F3n");
		lblTipoDeProyeccion.setBounds(10, 111, 90, 14);
		getContentPane().add(lblTipoDeProyeccion);
		
		cboTipoProyeccion = new JComboBox();
		cboTipoProyeccion.setModel(new DefaultComboBoxModel(new String[] {"Estreno", "Fuera de Estreno"}));
		cboTipoProyeccion.setBounds(170, 108, 108, 20);
		getContentPane().add(cboTipoProyeccion);
		
		txtPaisOrigen = new JTextField();
		txtPaisOrigen.setBounds(170, 158, 108, 20);
		getContentPane().add(txtPaisOrigen);
		txtPaisOrigen.setColumns(10);
		
		lblSinopsis = new JLabel("Sinopsis");
		lblSinopsis.setBounds(10, 186, 46, 14);
		getContentPane().add(lblSinopsis);
		
		textSinopsis = new JTextField();
		textSinopsis.setBounds(170, 183, 108, 20);
		getContentPane().add(textSinopsis);
		textSinopsis.setColumns(10);
		
		lblDuracion = new JLabel("Duraci\u00F3n ");
		lblDuracion.setBounds(10, 211, 46, 14);
		getContentPane().add(lblDuracion);
		
		txtDuracion = new JTextField();
		txtDuracion.setBounds(170, 208, 108, 20);
		getContentPane().add(txtDuracion);
		txtDuracion.setColumns(10);
		
		lblTipoDeCensura = new JLabel("Tipo de censura ");
		lblTipoDeCensura.setBounds(10, 236, 79, 14);
		getContentPane().add(lblTipoDeCensura);
		
		txtTipoCensura = new JTextField();
		txtTipoCensura.setBounds(170, 233, 108, 20);
		getContentPane().add(txtTipoCensura);
		txtTipoCensura.setColumns(10);
		
		lblEstadoDeProyeccion = new JLabel("Estado de proyecci\u00F3n ");
		lblEstadoDeProyeccion.setBounds(10, 261, 106, 14);
		getContentPane().add(lblEstadoDeProyeccion);
		
		txtEstadoProyeccion = new JTextField();
		txtEstadoProyeccion.setBounds(170, 258, 108, 20);
		getContentPane().add(txtEstadoProyeccion);
		txtEstadoProyeccion.setColumns(10);
		
		lblRecaudacin = new JLabel("Recaudaci\u00F3n ");
		lblRecaudacin.setBounds(10, 286, 64, 14);
		getContentPane().add(lblRecaudacin);
		
		txtRecaudacion = new JTextField();
		txtRecaudacion.setBounds(170, 283, 108, 20);
		getContentPane().add(txtRecaudacion);
		txtRecaudacion.setColumns(10);

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
		ListadoPeliculas x = new ListadoPeliculas();
		x.setLocationRelativeTo(this);
		x.setVisible(true);
	}
	protected void actionPerformedBtnGrabar(ActionEvent arg0) {
		String s = "¿Esta seguro de Grabar?";
		JOptionPane.showConfirmDialog(this, s);
	}
}
