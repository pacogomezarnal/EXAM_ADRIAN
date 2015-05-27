package Vistas;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;

public class FramePrincipal extends JFrame {

	private JPanel contentPane;
	private PerfilUsuario usuario = new PerfilUsuario(this);
	private PerfilEquipo equipo = new PerfilEquipo(this);
	private Comprobacion comprobacion = new Comprobacion(this);

	public FramePrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 446);
		setTitle("THE LABY");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		add(usuario,"PERFIL USUARIO");
		add(equipo,"PERFIL EQUIPO");
		add(comprobacion,"COMPROBACION");
	}

}
