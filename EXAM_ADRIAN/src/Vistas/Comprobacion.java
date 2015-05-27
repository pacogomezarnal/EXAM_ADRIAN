package Vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Comprobacion extends JPanel {
	private JLabel labelApellido, labelId;
	private JTextField id_text, apellido1_text, mensajeDevuelto_text;
	private JButton botonAtras, botonComprobar;
	private FramePrincipal frame;
	
	/**
	 * Create the panel.
	 */
	public Comprobacion(FramePrincipal frame) {
		setLayout(null);
		
		this.frame = frame;
		
		labelId = new JLabel("Id");
		labelId.setBounds(45, 51, 46, 14);
		add(labelId);
		
		labelApellido = new JLabel("1er Apellido");
		labelApellido.setBounds(161, 51, 71, 14);
		add(labelApellido);
		
		botonComprobar = new JButton("Comprobar");
		botonComprobar.setBounds(45, 197, 347, 23);
		add(botonComprobar);
		
		id_text = new JTextField();
		id_text.setBounds(45, 106, 86, 20);
		add(id_text);
		id_text.setColumns(10);
		
		apellido1_text = new JTextField();
		apellido1_text.setColumns(10);
		apellido1_text.setBounds(161, 106, 86, 20);
		add(apellido1_text);
		
		mensajeDevuelto_text = new JTextField();
		mensajeDevuelto_text.setBounds(45, 278, 347, 20);
		add(mensajeDevuelto_text);
		mensajeDevuelto_text.setColumns(10);
		
		botonAtras = new JButton("<< Atras");
		botonAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c1 = (CardLayout) (frame.getContentPane().getLayout());
				c1.show(frame.getContentPane(), "PERFIL EQUIPO");
			}
		});
		botonAtras.setBounds(45, 338, 89, 23);
		add(botonAtras);

	}

}
