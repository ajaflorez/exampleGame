package ajedrez;

public final class MovimientoF {
    private static byte[][] recto = {{0, -1}, {-1,0}, {0,1}, {0,-1}};
    private static byte[][] diagonal = {{-1, -1}, {-1,1}, {1,-1}, {1,1}};
    private static byte[][] ele = {{-1, -2}, {1,-2}, {-2,-1}, {-2,1}, {-1, 2}, {1,2}, {2, -1}, {2,1}};
    private static byte[][] adelanteBlanco = {{-1, 0}};
    private static byte[][] adelanteNegro = {{1, 0}};
    
    private static byte uno = 1;
    private static byte varios = 7;
    
    /** Este método permite obtener a las fichas 
     * los movimientos en un tablero de ajedrez
     * @param tipo
     * @param color
     * @return 
     */
    public static byte[][] getMovimiento(TipoF tipo, ColorA color)
    { 
        int tamanoArray = 0;
        byte[][] movidas;
        
        // Definiendo tamaño del array de las movidas
        if(tipo == TipoF.REY || tipo == TipoF.REYNA)
            tamanoArray = recto.length + diagonal.length;        
        else if(tipo == TipoF.ALFIL)
            tamanoArray = diagonal.length;
        else if(tipo == TipoF.CABALLO)
            tamanoArray = ele.length;
        else if(tipo == TipoF.TORRE)
            tamanoArray = recto.length;
        else if(tipo == TipoF.PEON)
        {
            if(color == ColorA.NEGRO)
                tamanoArray = adelanteNegro.length;
            else if(color == ColorA.BLANCO)
                tamanoArray = adelanteBlanco.length;
        }
        
        // Definiendo el tamaño del array de movidas
        movidas = new byte[tamanoArray][2];
        
        // Las movida recta de la ficha
        if(tipo == TipoF.REY || tipo == TipoF.REYNA || tipo == TipoF.TORRE)
        {
            for(int f = 0;f < recto.length; f++)
            {
                movidas[f][0] = recto[f][0];
                movidas[f][1] = recto[f][1];
            }
        }
        // La movida diagonal de la ficha
        if(tipo == TipoF.REY || tipo == TipoF.REYNA || tipo == TipoF.ALFIL)
        {
            for(int f = 0;f < diagonal.length; f++)
            {
                if(tipo == TipoF.ALFIL)
                {
                    movidas[f][0] = diagonal[f][0];
                    movidas[f][1] = diagonal[f][1];
                }
                else
                {
                    movidas[f + recto.length][0] = diagonal[f][0];
                    movidas[f + recto.length][1] = diagonal[f][1];
                }
            }
        }
        // La movida ele de la ficha
        if(tipo == TipoF.CABALLO)
        {
            for(int f = 0;f < ele.length; f++)
            {
                movidas[f][0] = ele[f][0];
                movidas[f][1] = ele[f][1];
            }
        }
        // La movida adelante de la ficha
        if(tipo == TipoF.PEON)
        {
            if(color == ColorA.NEGRO)
            {
                for(int f = 0; f < adelanteNegro.length; f++)
                {
                    movidas[f][0] = adelanteNegro[f][0];
                    movidas[f][1] = adelanteNegro[f][1];
                }
            }
            else if(color == ColorA.BLANCO)
            {
                for(int f = 0; f < adelanteBlanco.length; f++)
                {
                    movidas[f][0] = adelanteBlanco[f][0];
                    movidas[f][1] = adelanteBlanco[f][1];
                }
            }
                
            
        }               
        return movidas;
    }
    
    public static byte getDistanciaAvance(TipoF tipo)
    {
        byte distancia = 0;
        
        if(tipo == TipoF.ALFIL || tipo == TipoF.REYNA || tipo == TipoF.TORRE)
            distancia = varios;
        else if(tipo == TipoF.CABALLO || tipo == TipoF.PEON || tipo == TipoF.REY)
            distancia = uno;
        
        return distancia;
    }
}
