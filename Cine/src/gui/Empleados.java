package gui;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.UIManager;

public class Empleados extends JDialog {
	private JLabel lblCodigo;
	private JLabel lblNombres;
	private JLabel lblApellidoPaterno;
	private JLabel lblApellidoMaterno;
	private JLabel lblTipo;
	private JLabel lblUsuario;
	private JLabel lblContrasena;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JComboBox comboBox;
	private JPasswordField passwordField;
	private JComboBox comboBox_1;
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
					Empleados dialog = new Empleados();
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
	public Empleados() {
		setTitle("Mantenimiento - Empleados");
		setBounds(100, 100, 450, 300);
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
		
		textField = new JTextField();
		textField.setBounds(98, 58, 91, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(98, 83, 91, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(98, 33, 91, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(98, 8, 91, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(98, 133, 91, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Administrador", "Supervisor", "Cajero"}));
		comboBox.setBounds(98, 108, 91, 20);
		getContentPane().add(comboBox);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(98, 158, 91, 20);
		getContentPane().add(passwordField);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Ingreso", "Modificaci\u00F3n", "Eliminaci\u00F3n"}));
		comboBox_1.setBounds(335, 8, 89, 20);
		getContentPane().add(comboBox_1);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.setBounds(335, 32, 89, 23);
		getContentPane().add(btnGrabar);
		
		btnListado = new JButton("Listado");
		btnListado.setBounds(335, 57, 89, 23);
		getContentPane().add(btnListado);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(335, 82, 89, 23);
		getContentPane().add(btnCerrar);

	}
}
