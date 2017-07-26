package ajedrez;

public class Tablero {
    private byte tamano;
    public Casilla[][] celda;
    
    public Tablero(byte tamano)
    {
        this.tamano = tamano;
        celda = new Casilla[tamano][tamano];
        
        ColorA color;
        EstadoC estado;
        for(int f = 0; f < tamano; f++)
        {
            if(f == 0 || f == 1 || f == (tamano - 2) || f == (tamano - 1))
                estado = EstadoC.OCUPADO;
            else
                estado = EstadoC.LIBRE;
            
            for(int c = 0; c < tamano; c++)
            {
                if(f % 2 == 0)
                {
                    if(c % 2 == 0)
                        color = ColorA.BLANCO;
                    else
                        color = ColorA.NEGRO;
                }       
                else
                {
                    if(c % 2 == 0)
                        color = ColorA.NEGRO;
                    else
                        color = ColorA.BLANCO;
                }
                celda[f][c] = new Casilla(color, estado);
            }
        }
    }
}
