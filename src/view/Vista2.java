package view;

import javax.swing.*;
import java.awt.*;

public class Vista2 extends JFrame {
    public Vista2() {
        getContentPane().setBackground(Color.CYAN);

        setTitle("Componentes básicos de la interfaz gráfica");
        setSize(1280, 720); // tamaño
        setLayout(null); // layout null
        setLocationRelativeTo(null); // centrar ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para terminar ejecución al cerrar
        setUndecorated(true);
        setVisible(true); // hacer ventana visible
    }
}
