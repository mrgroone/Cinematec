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

public class MantenimientoCines extends JDialog implements ActionListener {
	private JLabel lblCodigo;
	private JLabel lblNombre;
	private JLabel lblDepartamento;
	private JLabel lblProvincia;
	private JTextField txtApePat;
	private JTextField txtApeMat;
	private JTextField txtNombre;
	private JTextField txtCodigo;
	private JTextField txtFechaInicioOperaciones;
	private JComboBox cboOpciones;
	private JButton btnGrabar;
	private JButton btnListado;
	private JButton btnCerrar;
	private JLabel lblDistrito;
	private JTextField txtDistrito;
	private JLabel lblTipo;
	private JComboBox comboBox;
	private JLabel lblFechaDeInicio;

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
					MantenimientoCines dialog = new MantenimientoCines();
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
	public MantenimientoCines() {
		setTitle("Mantenimiento - Cines");
		setBounds(100, 100, 450, 230);
		getContentPane().setLayout(null);
		
		lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(10, 11, 33, 14);
		getContentPane().add(lblCodigo);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 36, 42, 14);
		getContentPane().add(lblNombre);
		
		lblDepartamento = new JLabel("Departamento");
		lblDepartamento.setBounds(10, 61, 78, 14);
		getContentPane().add(lblDepartamento);
		
		lblProvincia = new JLabel("Provincia");
		lblProvincia.setBounds(10, 86, 80, 14);
		getContentPane().add(lblProvincia);
		
		txtApePat = new JTextField();
		txtApePat.setBounds(170, 58, 91, 20);
		getContentPane().add(txtApePat);
		txtApePat.setColumns(10);
		
		txtApeMat = new JTextField();
		txtApeMat.setBounds(170, 83, 91, 20);
		getContentPane().add(txtApeMat);
		txtApeMat.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(170, 33, 91, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCodigo = new JTextField();
		txtCodigo.setEditable(false);
		txtCodigo.setBounds(170, 8, 91, 20);
		getContentPane().add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtFechaInicioOperaciones = new JTextField();
		txtFechaInicioOperaciones.setBounds(170, 133, 91, 20);
		getContentPane().add(txtFechaInicioOperaciones);
		txtFechaInicioOperaciones.setColumns(10);
		
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
		
		lblDistrito = new JLabel("Distrito");
		lblDistrito.setBounds(10, 111, 43, 14);
		getContentPane().add(lblDistrito);
		
		txtDistrito = new JTextField();
		txtDistrito.setBounds(170, 108, 91, 20);
		getContentPane().add(txtDistrito);
		txtDistrito.setColumns(10);
		
		lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(10, 161, 58, 14);
		getContentPane().add(lblTipo);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Est\u00E1ndar", "Prime"}));
		comboBox.setBounds(170, 158, 91, 20);
		getContentPane().add(comboBox);
		
		lblFechaDeInicio = new JLabel("Fecha de Inicio de Operaciones");
		lblFechaDeInicio.setBounds(10, 136, 150, 14);
		getContentPane().add(lblFechaDeInicio);

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
		ListadoCines x = new ListadoCines();
		x.setLocationRelativeTo(this);
		x.setVisible(true);
	}
	protected void actionPerformedBtnGrabar(ActionEvent arg0) {
		String s = "�Esta seguro de Grabar?";
		JOptionPane.showConfirmDialog(this, s);
	}
}
