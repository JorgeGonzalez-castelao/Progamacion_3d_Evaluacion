package boletin28.GUI;

import java.awt.Color;
import java.awt.ComponentOrientation;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author Jorge_Gonzalez
 */
public class Interfaz {
    
    JFrame marco;
    JPanel panel;
    JLabel etiqueta1, etiqueta2;
    JTextField lTexto1;
    JPasswordField lTexto2;
    JTextArea aTexto;
    JButton b1, b2;
    
    public void iniciar(){
        //declaramos compoñentes
        marco = new JFrame("Boletin 28");
        panel = new JPanel();
        etiqueta1 = new JLabel("NOME");
        etiqueta2 = new JLabel("PASSWORD");
        lTexto1 = new JTextField();
        lTexto2 = new JPasswordField();
        aTexto = new JTextArea("   Area de texto");
        b1 = new JButton("PREMER");
        b2 = new JButton("LIMPAR");
        
        //le damos características
        
        //marco
        marco.setSize(800, 800);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
 //panel
        panel.setBounds(50, 50, 600, 600);
        panel.setLayout(null);

// Componentes:
        etiqueta1.setBounds(120, 60, 120, 60);
        lTexto1.setBounds(380, 60, 320, 80);
        etiqueta2.setBounds(120, 180, 120, 60);
        lTexto2.setBounds(380, 180, 320, 80);
        lTexto2.setEchoChar('●');

        aTexto.setBounds(100, 340, 520, 225);
//aTexto.setText("Área de texto.");

        b1.setBounds(150, 620, 200, 50);

        b2.setBounds(400, 620, 200, 50);

// Añadimos los componentes al panel
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        panel.add(lTexto1);
        panel.add(lTexto2);
        panel.add(aTexto);
        panel.add(b1);
        panel.add(b2);

// Añadimos el panel al marco
        marco.add(panel);
    }
}
