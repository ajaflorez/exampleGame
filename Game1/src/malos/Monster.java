package malos;

// Heredando todas las caracteristicas de los Thread
public abstract class Monster extends Thread {
    private final int identificador;
    private static int contador = 1;
    private int nivelAtaque;
    private int nivelDefensa;
    private int nivelVida;
    private int velocidad;
    private Direccion direccion;
    private int ejeX;
    private int ejeY;
    

    public Monster() {
        this.identificador = (int)contador++;
        this.nivelAtaque = 2;
        this.nivelDefensa = 2;
        this.nivelVida = 20;
        this.direccion = Direccion.DERECHA;
        this.ejeX = 0;
        this.ejeY = 100;
        this.velocidad = 2;
    }    
    public Monster(int velocidad) {
        this.velocidad = velocidad;
        this.identificador = (int)contador++;
        this.nivelAtaque = 2;
        this.nivelDefensa = 2;
        this.nivelVida = 20;
        this.direccion = Direccion.DERECHA;
        this.ejeX = 0;
        this.ejeY = 100;        
    }
    
    public int getNivelAtaque() {
        return nivelAtaque;
    }
    public void setNivelAtaque(int nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }
    public int getNivelDefensa() {
        return nivelDefensa;
    }
    public void setNivelDefensa(int nivelDefensa) {
        this.nivelDefensa = nivelDefensa;
    }
    public int getNivelVida() {
        return nivelVida;
    }
    public void setNivelVida(int nivelVida) {
        this.nivelVida = nivelVida;
    }
    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public int getEjeX() {
        return ejeX;
    }
    public void setEjeX(int ejeX) {
        this.ejeX = ejeX;
    }
    public int getEjeY() {
        return ejeY;
    }
    public void setEjeY(int ejeY) {
        this.ejeY = ejeY;
    }
    public int getIdentificador() {
        return identificador;
    }
    public int getVelocidad() {
        return velocidad;
    }
  
    @Override
    public String toString() {
        return "M[" + this.identificador + "]: V-" + this.nivelVida + ", D-" + 
                this.direccion + "(" + this.ejeX + "," + this.ejeY + ")";
    }
    
    public void avanzar(int cantidad) {
        switch(this.direccion) {
            case DERECHA: this.ejeX+=cantidad;
                break;
            case IZQUIERDA: this.ejeX-=cantidad;
                break;
            case ARRIBA: this.ejeY-=cantidad;
                break;
            case ABAJO: this.ejeY+=cantidad;
                break;
        }
    }
    public void avanzar() {
        switch(this.direccion) {
            case DERECHA: this.ejeX++;
                break;
            case IZQUIERDA: this.ejeX--;
                break;
            case ARRIBA: this.ejeY--;
                break;
            case ABAJO: this.ejeY++;
                break;
        }
    }
    public void retroceder(int cantidad) {
        switch(this.direccion) {
            case DERECHA: this.ejeX-=cantidad;
                break;
            case IZQUIERDA: this.ejeX+=cantidad;
                break;
            case ARRIBA: this.ejeY+=cantidad;
                break;
            case ABAJO: this.ejeY-=cantidad;
                break;
        }
    }
    
    public void girarIzquierda() {
        switch(this.direccion) {
            case DERECHA: this.direccion = Direccion.ARRIBA;    break;
            case IZQUIERDA: this.direccion = Direccion.ABAJO;   break;
            case ARRIBA: this.direccion = Direccion.IZQUIERDA;   break;
            case ABAJO: this.direccion = Direccion.DERECHA;   break;
        }
    }
    public void girarDerecha() {
        switch(this.direccion) {
            case DERECHA: this.direccion = Direccion.ABAJO;    break;
            case IZQUIERDA: this.direccion = Direccion.ARRIBA;   break;
            case ARRIBA: this.direccion = Direccion.DERECHA;   break;
            case ABAJO: this.direccion = Direccion.IZQUIERDA;   break;
        }
    }
    
    public abstract void Atacar();
    
    
    
}
