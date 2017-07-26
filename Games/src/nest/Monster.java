package nest;

public abstract class Monster {
    private float levelDefense;
    private float levelAtack;
    private float levelLife;
    private estadoLife estado;
    

    public Monster() {
        this.levelDefense = 2;
        this.levelAtack = 2;
        this.levelLife = 10;
        this.estado = estadoLife.VIVO;
    }

    public float getLevelDefense() {
        return levelDefense;
    }
    public void setLevelDefense(float levelDefense) {
        this.levelDefense = levelDefense;
    }
    public float getLevelAtack() {
        return levelAtack;
    }
    public void setLevelAtack(float levelAtack) {
        this.levelAtack = levelAtack;
    }
    public float getLevelLife() {
        return levelLife;
    }
    public void setLevelLife(float levelLife) {
        this.levelLife = levelLife;
    }
    public estadoLife getEstado() {
        return estado;
    }
    public void setEstado(estadoLife estado) {
        this.estado = estado;
    }
    
     
    public abstract void Atacar(Humano human);
    public abstract void Comer(Humano human);
    
    @Override
    public String toString() {
        return ("Monster: D:" + this.levelDefense + ", A:" + this.levelAtack + 
                ", L:" + this.levelLife);
    }
        
}
