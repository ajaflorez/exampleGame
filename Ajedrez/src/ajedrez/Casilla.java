package ajedrez;

public class Casilla {
    private ColorA color;
    private EstadoC estado;
    private TipoF tipoFicha;
    
    public Casilla(ColorA color, EstadoC estado)
    {
        this.color = color;
        this.estado = estado;        
    }

    public ColorA getColor() {
        return color;
    }
    public void setColor(ColorA color) {
        this.color = color;
    }
    public EstadoC getEstado() {
        return estado;
    }
    public void setEstado(EstadoC estado) {
        this.estado = estado;
    }
    public TipoF getTipoFicha() {
        return tipoFicha;
    }
    public void setTipoFicha(TipoF tipoFicha) {
        this.tipoFicha = tipoFicha;
    }
}
