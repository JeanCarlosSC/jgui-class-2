package view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Ventana extends JFrame {
    private Color colorPrincipal;
    private Font fuenteTituloPrincipal, fuenteTitulo, fuenteTexto;
    private Cursor cMano;
    private Border bordeTextField;
    private ImageIcon iFondo, iFacebook;

    public Ventana() {
        cargarRecursos();
        cargarComponentes();
        cargarPropiedades();
    }

    private void cargarRecursos() {
        colorPrincipal = new Color(60,78,120);

        fuenteTituloPrincipal = new Font("Tahoma", Font.PLAIN, 24);
        fuenteTitulo = new Font("Calibri (Body)", Font.BOLD, 18);
        fuenteTexto = new Font("Calibri Light", Font.PLAIN, 14);

        cMano = new Cursor(Cursor.HAND_CURSOR);

        bordeTextField = BorderFactory.createMatteBorder(0, 0, 2, 0, colorPrincipal);

        iFondo = new ImageIcon("resources/images/fondo.png");
        iFacebook = new ImageIcon("resources/images/facebook1.png");
    }

    private void cargarComponentes() {JPanel pIzquierdo = new JPanel();
        pIzquierdo.setBounds(0, 0, 853, 720); // coordenadas y tamaño
        pIzquierdo.setBackground(Color.WHITE);
        pIzquierdo.setLayout(null);
        add(pIzquierdo);

        JPanel pDerecho = new JPanel();
        pDerecho.setBounds(853, 0, 427, 720);
        pDerecho.setBackground(Color.WHITE);
        pDerecho.setLayout(null);
        add(pDerecho);

        JLabel lFondo = new JLabel();
        lFondo.setIcon(iFondo);
        lFondo.setBounds(0, 0, 721, 721);
        pIzquierdo.add(lFondo);

        JLabel lFacebook = new JLabel();
        lFacebook.setIcon(
                new ImageIcon(iFacebook.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING))
        );
        lFacebook.setBounds(30, 630, 30, 30);
        pIzquierdo.add(lFacebook);

        JLabel iTituloApp = new JLabel("Login de usuario");
        iTituloApp.setBounds(350, 20, 220, 30);
        iTituloApp.setForeground(Color.WHITE);
        iTituloApp.setFont(fuenteTituloPrincipal);
        pIzquierdo.add(iTituloApp);

        JLabel lEslogan = new JLabel("Te ayudamos con todo"); // etiqueta de texto
        lEslogan.setBounds(138, 110, 150, 20);
        lEslogan.setForeground(Color.DARK_GRAY); // cambiar el color de la fuente
        lEslogan.setHorizontalAlignment(JLabel.CENTER); // centrar con respecto al ancho
        lEslogan.setFont(fuenteTexto);
        pDerecho.add(lEslogan);

        JLabel lTituloLogin = new JLabel("Registra tus datos");
        lTituloLogin.setBounds(105, 140, 200, 30);
        lTituloLogin.setForeground(Color.DARK_GRAY); // cambiar el color de la fuente
        lTituloLogin.setHorizontalAlignment(JLabel.CENTER);
        lTituloLogin.setFont(fuenteTitulo);
        pDerecho.add(lTituloLogin);

        JLabel lNotificaciones = new JLabel("¿Recibir Notificaciones?");
        lNotificaciones.setBounds(138, 370, 150, 20);
        lNotificaciones.setForeground(Color.DARK_GRAY);
        lNotificaciones.setHorizontalAlignment(JLabel.CENTER);
        lNotificaciones.setFont(fuenteTexto);
        pDerecho.add(lNotificaciones);

        JTextField tNombreUsuario = new JTextField("Nombre de usuario");
        tNombreUsuario.setBounds(80, 200, 260, 40);
        tNombreUsuario.setForeground(Color.DARK_GRAY);
        tNombreUsuario.setBackground(Color.WHITE);
        tNombreUsuario.setCaretColor(Color.BLUE); // Color de la línea que parpadea
        tNombreUsuario.setHorizontalAlignment(JTextField.CENTER);
        tNombreUsuario.setBorder(bordeTextField);
        pDerecho.add(tNombreUsuario);

        JPasswordField tClaveUsuario = new JPasswordField("Clave usuario");
        tClaveUsuario.setBounds(80, 250, 260, 40);
        tClaveUsuario.setForeground(Color.DARK_GRAY);
        tClaveUsuario.setCaretColor(Color.BLUE);
        tClaveUsuario.setHorizontalAlignment(JPasswordField.CENTER);
        tClaveUsuario.setBorder(bordeTextField);;
        pDerecho.add(tClaveUsuario);

        JComboBox<String> tipoUsuario = new JComboBox<>();
        tipoUsuario.addItem("Cliente");
        tipoUsuario.addItem("Cajero");
        tipoUsuario.addItem("Administrador");
        tipoUsuario.setBounds(120, 300, 180, 30);
        pDerecho.add(tipoUsuario);

        JRadioButton checkNo = new JRadioButton("No");
        checkNo.setBounds(170, 400, 40, 40);
        checkNo.setFocusable(false);
        checkNo.setBackground(Color.WHITE);
        pDerecho.add(checkNo);

        JRadioButton checkSi = new JRadioButton("Si");
        checkSi.setBounds(220, 400, 40, 40);
        checkSi.setFocusable(false);
        checkSi.setBackground(Color.WHITE);
        pDerecho.add(checkSi);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(checkNo);
        grupo.add(checkSi);

        JButton bEntrar = new JButton("Entrar");
        bEntrar.setBounds(110,490, 200, 40);
        bEntrar.setFocusable(false);
        bEntrar.setBackground(Color.BLUE);
        bEntrar.setForeground(Color.white);
        bEntrar.setCursor(cMano);
        pDerecho.add(bEntrar);
    }

    private void cargarPropiedades() {
        setTitle("Componentes básicos de la interfaz gráfica");
        setSize(1280, 720); // tamaño
        setLayout(null); // layout null
        setLocationRelativeTo(null); // centrar ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para terminar ejecución al cerrar
        setUndecorated(true);
        setVisible(true); // hacer ventana visible
    }

}
