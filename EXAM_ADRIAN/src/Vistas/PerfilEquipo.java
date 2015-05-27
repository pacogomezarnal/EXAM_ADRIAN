package Vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PerfilEquipo extends JPanel {
	private JLabel labelEquipo, labelId;
	private JComboBox comboBox_Equipo;
	private JTextField nombre_text, id_text, apellido1_text, apellido2_text, nacionalidad_text;
	private JLabel labelApellido1, labelApellido2, labelNacionalidad, labelNombre;
	private JButton botonAtras, botonSiguiente;
	private FramePrincipal frame;
	
	/**
	 * Create the panel.
	 */
	public PerfilEquipo(FramePrincipal frame) {
		setLayout(null);
		
		this.frame = frame;
		
		labelEquipo = new JLabel("Equipo");
		labelEquipo.setBounds(45, 48, 46, 14);
		add(labelEquipo);
		
		comboBox_Equipo = new JComboBox();
		comboBox_Equipo.setBounds(45, 84, 100, 20);
		add(comboBox_Equipo);
		
		labelNombre = new JLabel("Nombre");
		labelNombre.setBounds(176, 48, 46, 14);
		add(labelNombre);
		
		labelId = new JLabel("Id");
		labelId.setBounds(309, 48, 46, 14);
		add(labelId);
		
		nombre_text = new JTextField();
		nombre_text.setEditable(false);
		nombre_text.setBounds(176, 84, 86, 20);
		add(nombre_text);
		nombre_text.setColumns(10);
		
		id_text = new JTextField();
		id_text.setEditable(false);
		id_text.setBounds(283, 84, 86, 20);
		add(id_text);
		id_text.setColumns(10);
		
		apellido1_text = new JTextField();
		apellido1_text.setEditable(false);
		apellido1_text.setColumns(10);
		apellido1_text.setBounds(176, 174, 86, 20);
		add(apellido1_text);
		
		labelApellido1 = new JLabel("1er Apellido");
		labelApellido1.setBounds(178, 139, 65, 14);
		add(labelApellido1);
		
		labelApellido2 = new JLabel("2\u00BA Apellido");
		labelApellido2.setBounds(176, 232, 57, 14);
		add(labelApellido2);
		
		apellido2_text = new JTextField();
		apellido2_text.setEditable(false);
		apellido2_text.setColumns(10);
		apellido2_text.setBounds(176, 271, 86, 20);
		add(apellido2_text);
		
		labelNacionalidad = new JLabel("Nacionalidad");
		labelNacionalidad.setBounds(176, 322, 67, 14);
		add(labelNacionalidad);
		
		nacionalidad_text = new JTextField();
		nacionalidad_text.setEditable(false);
		nacionalidad_text.setColumns(10);
		nacionalidad_text.setBounds(176, 361, 86, 20);
		add(nacionalidad_text);
		
		botonSiguiente = new JButton("Siguiente >>");
		botonSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c1 = (CardLayout) (frame.getContentPane().getLayout());
				c1.show(frame.getContentPane(), "COMPROBACION");
			}
		});
		botonSiguiente.setBounds(309, 360, 110, 23);
		add(botonSiguiente);
		
		botonAtras = new JButton("<< Atras");
		botonAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c1 = (CardLayout) (frame.getContentPane().getLayout());
				c1.show(frame.getContentPane(), "PERFIL USUARIO");
			}
		});
		botonAtras.setBounds(45, 360, 89, 23);
		add(botonAtras);

	}
}
