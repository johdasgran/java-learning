package reto_4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Panel;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main_window extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtHorasExtra;
	private JTextField txtAuxTrasporte;
	private JTextField txtSalario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_window frame = new Main_window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main_window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Contratar Empleado");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 34));
		
		JLabel lblNewLabel_1 = new JLabel("Nombre ");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 22));
		
		JLabel lblNewLabel_2 = new JLabel("Horas extra");
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.PLAIN, 22));
		
		JLabel lblNewLabel_3 = new JLabel("Auxilio Trasporte");
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.PLAIN, 22));
		
		JLabel lblSalario = new JLabel("Salario");
		lblSalario.setFont(new Font("Century Gothic", Font.PLAIN, 22));
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		
		txtHorasExtra = new JTextField();
		txtHorasExtra.setColumns(10);
		
		txtAuxTrasporte = new JTextField();
		txtAuxTrasporte.setColumns(10);
		
		txtSalario = new JTextField();
		txtSalario.setColumns(10);
		
		JButton btnContratar = new JButton("Contratar");
		btnContratar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnContratar.setFont(new Font("Century Gothic", Font.PLAIN, 22));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 255));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(50)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1)
										.addComponent(lblNewLabel_2)
										.addComponent(lblNewLabel_3)
										.addComponent(lblSalario))
									.addGap(14)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(txtNombre)
										.addComponent(txtHorasExtra)
										.addComponent(txtSalario)
										.addComponent(txtAuxTrasporte, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(138)
									.addComponent(btnContratar)))
							.addGap(64)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(105)
							.addComponent(lblNewLabel)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(50)
							.addComponent(lblNewLabel)
							.addGap(100)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1))
							.addGap(44)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2)
								.addComponent(txtHorasExtra, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
							.addGap(50)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3)
								.addComponent(txtAuxTrasporte, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
							.addGap(48)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblSalario)
								.addComponent(txtSalario, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
							.addGap(85)
							.addComponent(btnContratar))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(96)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 495, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(137, Short.MAX_VALUE))
		);
		
		JButton btnLiquidarNominaYParafiscales = new JButton("Liquidaci\u00F3n N\u00F3mina y Parafiscales");
		btnLiquidarNominaYParafiscales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLiquidarNominaYParafiscales.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		
		JButton btnContratar_2 = new JButton("Liquidaci\u00F3n Seguridad y Prestaciones");
		btnContratar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnContratar_2.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(57, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnContratar_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnLiquidarNominaYParafiscales, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE))
					.addGap(42))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(68)
					.addComponent(btnLiquidarNominaYParafiscales, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addGap(128)
					.addComponent(btnContratar_2, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(140, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
