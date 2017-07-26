package juegoCulebra;

import java.awt.*;
import javax.swing.*;

public class Culebra 
{
    // Atributos
    private Image imagenCabeza; // Imagen de la cabeza de la culebra
    private Image imagenCuerpo; // Imagen del cuerpo de la culebra
    private int fila[]; // coordenadas fila de la culebra
    private int columna[];  // coordenadas columna de la culebra
    private int tamano; // tamaño de la culebra
    
    private int seccion;    // tamaño de cada porcio de la culebra
    private int area;       // El área del juego
    private Direccion direccion;    // la direccion de la culebra
    
    // Constructor de la culebra
    public Culebra(int area, int seccion)
    {
        // Abre la imagen de la cabeza de la culebra
        ImageIcon iiCabeza = new ImageIcon(this.getClass().getResource("cabeza.png"));
        this.imagenCabeza = iiCabeza.getImage();
        
        // Abre la imagen del cuerpode la culebra
        ImageIcon iiCuerpo = new ImageIcon(this.getClass().getResource("cuerpo.png"));
        this.imagenCuerpo = iiCuerpo.getImage();                
        
        // establece el tamaño de las coordenadas 
        this.fila = new int[area * area];
        this.columna = new int[area * area];
        
        // Establece el tamaño inicial de la culebra
        this.tamano = 1;
        
        // Establece el área, sección y direccion de la culebra
        this.area = area;
        this.seccion = seccion;
        this.direccion = Direccion.DERECHA;
        
        // Ubica a la culebra en el centro 
        int medio = (int)(area / 2);
        for(int i = 0; i < tamano; i++)
        {
            fila[i] = medio;
            columna[i] = medio - i;
        }
    }
    // Método que mueve la culebra en una dirección
    public void mover()
    {
        // Se copia la ubicación del último al segundo
        for(int i = tamano - 1; i > 0; i--)
        {
            fila[i] = fila[i - 1];
            columna[i] = columna[i - 1];
        }
        // la cabeza se mueve en la dirección
        if(direccion == Direccion.ABAJO)
            fila[0]++;
        if(direccion == Direccion.ARRIBA)
            fila[0]--;
        if(direccion == Direccion.DERECHA)
            columna[0]++;
        if(direccion == Direccion.IZQUIERDA)
            columna[0]--;
    }
    // Método que verifica que la cabeza choca o no
    public boolean verificaChoque()
    {
        // Si la culebra se choca el el borde
        if(fila[0] < 0)
            return true;
        if(fila[0] == area)
            return true;
        if(columna[0] < 0)
            return true;
        if(columna[0] == area)
            return true;
        
        // Si la culebra choca con su cuerpo
        for(int i = tamano - 1; i > 2; i--)
        {
            if(fila[0] == fila[i] && columna[0] == columna[i])
                return true;
        }
        return false;
    }
    // Médoto que dibuja la culebra
    public void dibuja(Graphics g)
    {
        g.drawImage(this.imagenCabeza, columna[0] * seccion, fila[0] * seccion, null);
        for(int i = 1; i < tamano; i++)
        {
            g.drawImage(this.imagenCuerpo, columna[i] * seccion, fila[i] * seccion, null);
        }
        
    }
    // Método que aumenta el tamaño de la culebra
    public void aumentarTamano()
    {
        tamano++;
    }
    // Método que establece la dirección de la cabeza de la culebra
    public void setDireccion(Direccion direccion) 
    {
        if((direccion == Direccion.ABAJO && this.direccion != Direccion.ARRIBA) ||
                (direccion == Direccion.ARRIBA && this.direccion != Direccion.ABAJO) ||
                (direccion == Direccion.IZQUIERDA && this.direccion != Direccion.DERECHA) ||
                (direccion == Direccion.DERECHA && this.direccion != Direccion.IZQUIERDA))
            this.direccion = direccion;
    }
    // Método que retorna la fila de la cabeza de la culebra
    public int getFilaCabeza()
    {
        return fila[0];
    }
    // Método que retorna la columna de la cabeza de la culebra
    public int getColumnaCabeza()
    {
        return columna[0];
    }
    // Método que retorna el tamaño de la culebra como String
    public String tamano() 
    {
        Integer itamano = tamano;
        return itamano.toString();
    }
}
