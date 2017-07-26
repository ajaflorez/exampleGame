package ajedrez;

public class Ficha {
    private TipoF tipo;
    private ColorA color;
    private EstadoF estado;
    private byte fila;
    private byte columna;
    private byte[][] movimiento;
    private byte distancia;
    
    public Ficha(TipoF tipo, ColorA color, EstadoF estado, byte fila, byte columna)
    {
        this.tipo = tipo;
        this.color = color;
        this.estado = estado;
        this.fila = fila;
        this.columna = columna;
        this.movimiento = MovimientoF.getMovimiento(tipo, color);        
        this.distancia = MovimientoF.getDistanciaAvance(tipo);
        
        System.out.println("Distancia de Ficha: " + distancia);
        System.out.println("Movimiento de Ficha: ");
        for(byte[] celda : movimiento)
        {
            for(int valor: celda)
            {
                System.out.print(valor);
            }
            System.out.println();
        }
    }

    public TipoF getTipo() {
        return tipo;
    }
    public void setTipo(TipoF tipo) {
        this.tipo = tipo;
    }
    public ColorA getColor() {
        return color;
    }
    public void setColor(ColorA color) {
        this.color = color;
    }
    public EstadoF getEstado() {
        return estado;
    }
    public void setEstado(EstadoF estado) {
        this.estado = estado;
    }
    public byte getFila() {
        return fila;
    }
    public void setFila(byte fila) {
        this.fila = fila;
    }
    public byte getColumna() {
        return columna;
    }
    public void setColumna(byte columna) {
        this.columna = columna;
    }
            
}
