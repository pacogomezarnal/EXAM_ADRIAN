package Vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import Model.Cadete;
import Model.Datos;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Iterator;

public class PerfilUsuario extends JPanel {
	private JTextField nombre_text, id_text, apellidos_text, edad_text, nacionalidad_text;
	private JLabel labelApellidos,labelNombre,labelId,labelNacionalidad,labelEdad,labelFoto;
	private JButton botonSiguiente;
	private FramePrincipal frame;
	private String nombre;
	private Cadete cadete = new Cadete();


	/**
	 * Create the panel.
	 */
	public PerfilUsuario(FramePrincipal frame) {
		setLayout(null);
		
		//ME CREO ESTA VARIABLE PARA NO CREAR UN MAIN PRINCIPAL, Y ASI PASO EL CORRECTO. HAGO LO MISMO EN COMPROBACION Y PERFIL EQUIPO
		this.frame = frame;
		
		
		labelNombre = new JLabel("Nombre");
		labelNombre.setBounds(197, 53, 46, 14);
		add(labelNombre);
		
		nombre_text = new JTextField();
		nombre_text.setEditable(false);
		nombre_text.setBounds(197, 80, 86, 20);
		add(nombre_text);
		nombre_text.setColumns(10);
		nombre_text.setText(cadete.getNombre());
		
		labelId = new JLabel("Id");
		labelId.setBounds(341, 53, 46, 14);
		add(labelId);
		
		id_text = new JTextField();
		id_text.setEditable(false);
		id_text.setBounds(341, 80, 86, 20);
		add(id_text);
		id_text.setColumns(10);
		
		apellidos_text = new JTextField();
		apellidos_text.setEditable(false);
		apellidos_text.setColumns(10);
		apellidos_text.setBounds(197, 150, 86, 20);
		add(apellidos_text);
		
		labelApellidos = new JLabel("Apellidos");
		labelApellidos.setBounds(197, 123, 46, 14);
		add(labelApellidos);
		
		labelEdad = new JLabel("Edad");
		labelEdad.setBounds(197, 194, 46, 14);
		add(labelEdad);
		
		edad_text = new JTextField();
		edad_text.setEditable(false);
		edad_text.setColumns(10);
		edad_text.setBounds(197, 221, 86, 20);
		add(edad_text);
		
		labelNacionalidad = new JLabel("Nacionalidad");
		labelNacionalidad.setBounds(197, 264, 79, 14);
		add(labelNacionalidad);
		
		nacionalidad_text = new JTextField();
		nacionalidad_text.setEditable(false);
		nacionalidad_text.setColumns(10);
		nacionalidad_text.setBounds(197, 291, 86, 20);
		add(nacionalidad_text);
		
		botonSiguiente = new JButton("Siguiente >>");
		botonSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c1 = (CardLayout) (frame.getContentPane().getLayout());
				c1.show(frame.getContentPane(), "PERFIL EQUIPO");
			}
		});
		botonSiguiente.setBounds(256, 325, 107, 23);
		add(botonSiguiente);
		
		labelFoto = new JLabel("");
		labelFoto.setIcon(new ImageIcon(PerfilUsuario.class.getResource("/Img/usuario.png")));
		labelFoto.setBounds(29, 66, 150, 159);
		add(labelFoto);

	}
}
