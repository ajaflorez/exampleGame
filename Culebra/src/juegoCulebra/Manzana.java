package juegoCulebra;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Manzana 
{
    // Atributos
    private Image imagen;   // Imagen de la manzana
    private int fila;   // Coordenada fila de la manzana
    private int columna;    // Coordenada columna de la manzana
    
    private int seccion;    // tamaño de la manzana
    private int area;       // El área del juego
    
    private Random random;  // objeto ramdon para la aleatorización
    
    public Manzana(int area, int seccion)
    {               
        // Abre la imagen de la manzana
        ImageIcon  iiManzana = new ImageIcon(this.getClass().getResource("manzana.png"));
        imagen = iiManzana.getImage();
                
        // Inicializa el random
        random = new Random();
        
        // Establece el área y sección 
        this.area = area;
        this.seccion = seccion;
        
        // ubica la manzana en coordenadas
        this.ubicar();        
    }
    // Método que ubica la manzana 
    public void ubicar()
    {
        // Estable la fila y columna en forma aleatoria
        fila = random.nextInt(area);
        columna = random.nextInt(area);
    }
    // Método que dibuja la manzana
    public void dibuja(Graphics g)
    {
        g.drawImage(imagen, columna * seccion, fila * seccion, null);
    }
    // Método que devuelve la fila de la manzana
    public int getFila() 
    {
        return fila;
    }
    // Método que devuelve la columna de la manzana
    public int getColumna() 
    {
        return columna;
    }    
}
