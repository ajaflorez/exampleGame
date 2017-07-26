package juegoCulebra;

import javax.swing.*;

public class Ventana extends JFrame
{
    // Constructor 
    public Ventana()
    {
        // Agrega el objeto Manager a la Ventana
        add(new Manager());
        
        // Sentencia que permite cerrar la aplicacion
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Establece el tamaño de la Ventana
        this.setSize(350, 330);
        
        // Localiza la ventana en el centro de la pantalla
        this.setLocationRelativeTo(null);
        
        // Establece el título de la ventana
        this.setTitle("La Culebrita");
        
        // Establece que no se puede cambiar el tamaño de la ventana
        this.setResizable(false);
        
        // Hace visible la ventana
        this.setVisible(true);
        
    }
}
