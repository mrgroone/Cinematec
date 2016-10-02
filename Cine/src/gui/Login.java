package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Login extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblUsuario;
	private JTextField txtUsuario;
	private JLabel lblContrasena;
	private JTextField txtContrasena;
	private JButton btnLogin;
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
					Login frame = new Login();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(122, 65, 46, 14);
		contentPane.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(188, 62, 86, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		lblContrasena = new JLabel("Contrase\u00F1a");
		lblContrasena.setBounds(122, 90, 56, 14);
		contentPane.add(lblContrasena);
		
		txtContrasena = new JTextField();
		txtContrasena.setBounds(188, 87, 86, 20);
		contentPane.add(txtContrasena);
		txtContrasena.setColumns(10);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(this);
		btnLogin.setBounds(110, 141, 89, 23);
		contentPane.add(btnLogin);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(225, 141, 89, 23);
		contentPane.add(btnCerrar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnLogin) {
			actionPerformedBtnLogin(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		System.exit(0);
	}
	protected void actionPerformedBtnLogin(ActionEvent e) {
		Menu x = new Menu();
		x.setLocationRelativeTo(this);
		x.setVisible(true);
		dispose();
	}
}
