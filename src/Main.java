import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Color colorPrincipal = new Color(60, 78, 120);
        Color colorGrisOscuro = new Color(80, 80, 80);

        Font fuenteTituloPrincipal = new Font("Tahoma", Font.PLAIN, 24);
        Font fuenteTitulo = new Font("Calibri (Body)", Font.BOLD, 18);
        Font fuenteTexto = new Font("Calibri Light", Font.PLAIN, 14);

        Cursor cMano = new Cursor(Cursor.HAND_CURSOR);
        Border bInferiorAzul = BorderFactory.createMatteBorder(0, 0, 2, 0, colorPrincipal);
        ImageIcon iFondo = new ImageIcon("resources/images/fondo.png");
        ImageIcon iLogo = new ImageIcon("resources/images/logo.png");
        ImageIcon iUsuario2 = new ImageIcon("resources/images/usuario2.png");
        ImageIcon iClave2 = new ImageIcon("resources/images/clave2.png");
        ImageIcon iPunto1 = new ImageIcon("resources/images/punto1.png");
        ImageIcon iFacebook1 = new ImageIcon("resources/images/facebook1.png");
        ImageIcon iTwitter1 = new ImageIcon("resources/images/twitter1.png");
        ImageIcon iYoutube1 = new ImageIcon("resources/images/youtube1.png");
        ImageIcon iImg = new ImageIcon("resources/images/imagen1.png");
        ImageIcon iCerrar = new ImageIcon("resources/images/cerrar.png");

        JFrame ventana = new JFrame("Componentes básicos de la interfaz gráfica");

        JPanel pIzquierdo = new JPanel();
        pIzquierdo.setBounds(0, 0, 853, 720); // coordenadas y tamaño
        pIzquierdo.setBackground(Color.WHITE);
        pIzquierdo.setLayout(null);
        ventana.add(pIzquierdo);

        JPanel pDerecho = new JPanel();
        pDerecho.setBounds(853, 0, 427, 720);
        pDerecho.setBackground(Color.WHITE);
        pDerecho.setLayout(null);
        ventana.add(pDerecho);

        JLabel lLogo = new JLabel();
        lLogo.setBounds(50, 20, 40, 40);
        lLogo.setIcon(new ImageIcon(
                iLogo.getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)
        ));
        pIzquierdo.add(lLogo);

        JLabel lTituloApp = new JLabel("Login de usuario");
        lTituloApp.setBounds(100, 18, 220, 40);
        lTituloApp.setForeground(Color.WHITE);
        lTituloApp.setFont(fuenteTituloPrincipal);
        pIzquierdo.add(lTituloApp);

        JLabel lSvg1 = new JLabel();
        lSvg1.setBounds(150, 120, 600, 414);
        lSvg1.setIcon(new ImageIcon(
                iImg.getImage().getScaledInstance(600, 414, Image.SCALE_AREA_AVERAGING)
        ));
        pIzquierdo.add(lSvg1);

        JLabel lEslogan = new JLabel("Te ayudamos con todo"); // etiqueta de texto
        lEslogan.setBounds(138, 110, 150, 20);
        lEslogan.setForeground(colorGrisOscuro); // cambiar el color de la fuente
        lEslogan.setHorizontalAlignment(JLabel.CENTER); // centrar con respecto al ancho
        lEslogan.setFont(fuenteTexto);
        pDerecho.add(lEslogan);

        JLabel lTituloLogin = new JLabel("Registra tus datos");
        lTituloLogin.setBounds(110, 140, 200, 30);
        lTituloLogin.setForeground(colorGrisOscuro); // cambiar el color de la fuente
        lTituloLogin.setHorizontalAlignment(JLabel.CENTER);
        lTituloLogin.setFont(fuenteTitulo);
        pDerecho.add(lTituloLogin);

        JLabel lNotificaciones = new JLabel("¿Desea recibir notificaciones?");
        lNotificaciones.setBounds(100, 400, 200, 20);
        lNotificaciones.setForeground(colorGrisOscuro);
        lNotificaciones.setFont(fuenteTexto);
        lNotificaciones.setHorizontalAlignment(JLabel.CENTER);
        pDerecho.add(lNotificaciones);

        JLabel lUsuario = new JLabel();
        lUsuario.setBounds(40, 200, 30, 30);
        lUsuario.setIcon(new ImageIcon(
                iUsuario2.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING)
        ));
        pDerecho.add(lUsuario);

        JLabel lClave = new JLabel();
        lClave.setBounds(40, 270, 30, 30);
        lClave.setIcon(new ImageIcon(
                iClave2.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING)
        ));
        pDerecho.add(lClave);

        JTextField tNombreUsuario = new JTextField("Nombre de usuario");
        tNombreUsuario.setBounds(80, 200, 260, 40);
        tNombreUsuario.setForeground(colorPrincipal);
        tNombreUsuario.setBackground(Color.WHITE);
        tNombreUsuario.setCaretColor(colorGrisOscuro); // Color de la línea que parpadea
        tNombreUsuario.setBorder(bInferiorAzul);
        tNombreUsuario.setHorizontalAlignment(JTextField.CENTER);
        pDerecho.add(tNombreUsuario);

        JPasswordField tClaveUsuario = new JPasswordField("Clave usuario");
        tClaveUsuario.setBounds(80, 250, 260, 40);
        tClaveUsuario.setForeground(colorPrincipal);
        tClaveUsuario.setBackground(Color.WHITE);
        tClaveUsuario.setCaretColor(colorGrisOscuro);
        tClaveUsuario.setBorder(bInferiorAzul);
        tClaveUsuario.setHorizontalAlignment(JPasswordField.CENTER);
        pDerecho.add(tClaveUsuario);

        JComboBox<String> cbTipoUsuario = new JComboBox<>();
        cbTipoUsuario.addItem("Cliente");
        cbTipoUsuario.addItem("Cajero");
        cbTipoUsuario.addItem("Administrador");
        cbTipoUsuario.setBounds(120, 330, 180, 30);
        cbTipoUsuario.setForeground(colorPrincipal);
        cbTipoUsuario.setBackground(Color.WHITE);
        ((JLabel) cbTipoUsuario.getRenderer()).setHorizontalAlignment(JLabel.CENTER);
        pDerecho.add(cbTipoUsuario);

        JButton bEntrar = new JButton("Entrar");
        bEntrar.setBounds(110,490, 200, 40);
        bEntrar.setFocusable(false);
        bEntrar.setBackground(colorPrincipal);
        bEntrar.setForeground(Color.white);
        bEntrar.setCursor(cMano);
        pDerecho.add(bEntrar);

        JButton bCerrar = new JButton();
        bCerrar.setBounds(350, 15, 45, 30);
        bCerrar.setFocusable(false);
        bCerrar.setBackground(Color.BLUE);
        bCerrar.setForeground(Color.WHITE);
        bCerrar.setCursor(cMano);
        bCerrar.setIcon(new ImageIcon(
                iCerrar.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING)
        ));
        bCerrar.setContentAreaFilled(false);
        bCerrar.setFocusable(false);
        bCerrar.setBorder(null);
        pDerecho.add(bCerrar);

        JButton bOpcion1 = new JButton();
        bOpcion1.setBounds(32, 250, 30, 20);
        bOpcion1.setCursor(cMano);
        bOpcion1.setIcon(new ImageIcon(
                iPunto1.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        ));
        bOpcion1.setContentAreaFilled(false);
        bOpcion1.setFocusable(false);
        bOpcion1.setBorder(null);
        pIzquierdo.add(bOpcion1);

        JButton bOpcion2 = new JButton();
        bOpcion2.setBounds(32, 300, 30, 20);
        bOpcion2.setCursor(cMano);
        bOpcion2.setIcon(new ImageIcon(
                iPunto1.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        ));
        bOpcion2.setContentAreaFilled(false);
        bOpcion2.setFocusable(false);
        bOpcion2.setBorder(null);
        pIzquierdo.add(bOpcion2);

        JButton bOpcion3 = new JButton();
        bOpcion3.setBounds(32, 350, 30, 20);
        bOpcion3.setCursor(cMano);
        bOpcion3.setIcon(new ImageIcon(
                iPunto1.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        ));
        bOpcion3.setContentAreaFilled(false);
        bOpcion3.setFocusable(false);
        bOpcion3.setBorder(null);
        pIzquierdo.add(bOpcion3);

        JLabel lFacebook = new JLabel();
        lFacebook.setBounds(30, 630, 30, 30);
        lFacebook.setIcon(new ImageIcon(
                iFacebook1.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING)
        ));
        lFacebook.setCursor(cMano);
        pIzquierdo.add(lFacebook);

        JLabel lTwitter = new JLabel();
        lTwitter.setBounds(80, 630, 30, 30);
        lTwitter.setIcon(new ImageIcon(
                iTwitter1.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING)
        ));
        lTwitter.setCursor(cMano);
        pIzquierdo.add(lTwitter);

        JLabel lYoutube = new JLabel();
        lYoutube.setBounds(130, 630, 30, 30);
        lYoutube.setIcon(new ImageIcon(
                iYoutube1.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING)
        ));
        lYoutube.setCursor(cMano);
        pIzquierdo.add(lYoutube);

        JLabel lFondo = new JLabel();
        lFondo.setBounds(0, 0, 720, 720);
        lFondo.setIcon(new ImageIcon(
                iFondo.getImage().getScaledInstance(721, 721, Image.SCALE_AREA_AVERAGING)
        ));
        pIzquierdo.add(lFondo);

        JRadioButton checkNo = new JRadioButton("No");
        checkNo.setBounds(170, 420, 40, 40);
        checkNo.setFocusable(false);
        checkNo.setBackground(Color.WHITE);
        pDerecho.add(checkNo);

        JRadioButton checkSi = new JRadioButton("Si");
        checkSi.setBounds(220, 420, 40, 40);
        checkSi.setFocusable(false);
        checkSi.setBackground(Color.WHITE);
        pDerecho.add(checkSi);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(checkNo);
        grupo.add(checkSi);

        ventana.setSize(1280, 720); // tamaño
        ventana.setLayout(null); // layout null
        ventana.setLocationRelativeTo(null); // centrar ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para terminar ejecución al cerrar
        ventana.setUndecorated(true); // elimina barra superior por defecto
        ventana.setVisible(true); // hacer ventana visible
    }
}