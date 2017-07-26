package juegoCulebra;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Manager extends JPanel implements ActionListener
{
    // Atributos constantes del juego
    private final int ANCHO = 300;
    private final int ALTO = 300;
    private final int SECCION = 10;
    private final int RETARDO = 140;
    private final int AREA = 30;
    
    // Objetos del Juego
    private Culebra culebra;
    private Manzana manzana;
    
    // Atributos controladores del juego
    private boolean perdio;
    private Timer timer;    // para el bucle del juego
    
    // Fuente a utilizar
    private Font font;
    
    // Constructor
    public Manager()
    {
        // inicialización de los objetos
        culebra = new Culebra(AREA, SECCION);
        manzana = new Manzana(AREA, SECCION);
        perdio = false;     // Flag de control (juega/pierde)
        timer = new Timer(RETARDO, this);   // Timer de repetitibilidad
        font = new Font("Arial", Font.BOLD, 14);    // Fuente del texto
        
        // Agrega el Escucha de eventos a la clase actual
        this.addKeyListener(new KeyEscucha());
                
        // Establece el foco a la clase actual
        this.setFocusable(true);
        
        // Establece el color de fondo
        this.setBackground(Color.BLACK);
        
        // inicia el juego
        iniciarJuego();
    }    
    public void iniciarJuego()
    {
        // Inicia el timer (bucle)
        timer.start();
        
        // Ubica las nuevas coordenadas de la manzana
        manzana.ubicar();
    }
    // Método que Verifica si la culebra comio la manzana
    public void verificaComer()
    {
        // Si las coordenadas de la cabeza de la culebra son iguales que la manzana
        if(culebra.getFilaCabeza() == manzana.getFila() && culebra.getColumnaCabeza() == manzana.getColumna())
        {
            // Aumenta el tamaño de la culebra
            culebra.aumentarTamano();
            
            // Ubica las nuevas coordenadas de la manzana
            manzana.ubicar();
        }
    }
    // Función que dibuja el juego
    @Override
    public void paint(Graphics g)
    {
        // pinta la clase base
        super.paint(g);
        
        // dibuja el limite del area de juego
        g.setColor(Color.WHITE);
        g.drawRect(0, 0, ANCHO, ALTO);
        
        // Dibuja el tamaño de la culebra
        g.setColor(Color.green);
        g.setFont(font);
        g.drawString(culebra.tamano(), ANCHO + 10, 20);
        
        // si no comio o choco con el limite
        if(!perdio)
        {
            // Dibuja la manzana
            manzana.dibuja(g);
            
            // Dibuja la Culebra
            culebra.dibuja(g);
        }
        else
        {
            // El bucle termina
            timer.stop();
        }
    }
    // Función que se llama en el bucle del timer
    @Override
    public void actionPerformed(ActionEvent e)
    {
        // si no comio o choco con el limite
        if(!perdio)
        {
            // Verifica si la culebra comio la manzana
            verificaComer();
            
            // Si la culebra se come o choca con el límite
            if(culebra.verificaChoque())
                perdio = true;  // Pierde el juego
            else    // Si no se come o choca se mueve
                culebra.mover();
        }
        // Repinta el juego
        repaint();
    }
    
    // Atributo clase KeyEscucha que hereda de la clase KeyAdapter
    // Clase que captura la tecla presionada
    private class KeyEscucha extends KeyAdapter
    {
        // El método se ejecuta cuando la tecla se presiona
        // El objeto e de la Clase KeyEvent contiene inf. de la tecla
        @Override
        public void keyPressed(KeyEvent e) 
        {
            // El codigo de tecla presionada
            int key = e.getKeyCode();
            
            if(key == KeyEvent.VK_UP)   // Tecla Arriba
                culebra.setDireccion(Direccion.ARRIBA);
            if(key == KeyEvent.VK_DOWN) // Tecla Abajo
                culebra.setDireccion(Direccion.ABAJO);
            if(key == KeyEvent.VK_LEFT) // Tecla Izquierda
                culebra.setDireccion(Direccion.IZQUIERDA);
            if(key == KeyEvent.VK_RIGHT)// Tecla derecha
                culebra.setDireccion(Direccion.DERECHA);
        }
    }
}
