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

public class MantenimientoEmpleados extends JDialog implements ActionListener {
	private JLabel lblCodigo;
	private JLabel lblNombres;
	private JLabel lblApellidoPaterno;
	private JLabel lblApellidoMaterno;
	private JLabel lblTipo;
	private JLabel lblUsuario;
	private JLabel lblContrasena;
	private JTextField txtApePat;
	private JTextField txtApeMat;
	private JTextField txtNombres;
	private JTextField txtCodigo;
	private JTextField txtUsuario;
	private JComboBox cboTipo;
	private JPasswordField txtContrasena;
	private JComboBox cboOpciones;
	private JButton btnGrabar;
	private JButton btnListado;
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
					MantenimientoEmpleados dialog = new MantenimientoEmpleados();
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
	public MantenimientoEmpleados() {
		setTitle("Mantenimiento - Empleados");
		setBounds(100, 100, 450, 230);
		getContentPane().setLayout(null);
		
		lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(10, 11, 33, 14);
		getContentPane().add(lblCodigo);
		
		lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(10, 36, 42, 14);
		getContentPane().add(lblNombres);
		
		lblApellidoPaterno = new JLabel("Apellido Paterno");
		lblApellidoPaterno.setBounds(10, 61, 78, 14);
		getContentPane().add(lblApellidoPaterno);
		
		lblApellidoMaterno = new JLabel("Apellido Materno");
		lblApellidoMaterno.setBounds(10, 86, 80, 14);
		getContentPane().add(lblApellidoMaterno);
		
		lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(10, 111, 20, 14);
		getContentPane().add(lblTipo);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(10, 136, 36, 14);
		getContentPane().add(lblUsuario);
		
		lblContrasena = new JLabel("Contrase\u00F1a");
		lblContrasena.setBounds(10, 161, 56, 14);
		getContentPane().add(lblContrasena);
		
		txtApePat = new JTextField();
		txtApePat.setBounds(98, 58, 91, 20);
		getContentPane().add(txtApePat);
		txtApePat.setColumns(10);
		
		txtApeMat = new JTextField();
		txtApeMat.setBounds(98, 83, 91, 20);
		getContentPane().add(txtApeMat);
		txtApeMat.setColumns(10);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(98, 33, 91, 20);
		getContentPane().add(txtNombres);
		txtNombres.setColumns(10);
		
		txtCodigo = new JTextField();
		txtCodigo.setEditable(false);
		txtCodigo.setBounds(98, 8, 91, 20);
		getContentPane().add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(98, 133, 91, 20);
		getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		cboTipo = new JComboBox();
		cboTipo.setModel(new DefaultComboBoxModel(new String[] {"Administrador", "Supervisor", "Cajero"}));
		cboTipo.setBounds(98, 108, 91, 20);
		getContentPane().add(cboTipo);
		
		txtContrasena = new JPasswordField();
		txtContrasena.setBounds(98, 158, 91, 20);
		getContentPane().add(txtContrasena);
		
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
		ListadoEmpleados x = new ListadoEmpleados();
		x.setLocationRelativeTo(this);
		x.setVisible(true);
	}
	protected void actionPerformedBtnGrabar(ActionEvent arg0) {
		String s = "�Esta seguro de Grabar?";
		JOptionPane.showConfirmDialog(this, s);
	}
}
