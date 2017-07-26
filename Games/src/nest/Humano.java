/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nest;

/**
 *
 * @author sistemas-16
 */
public class Humano {
    private String name;
    private float levelDefense;
    private float levelAtack;
    private float levelLife;
    private estadoLife estado;
    

    public Humano(String name) {
        this.name = name;
        this.levelDefense = 3;
        this.levelAtack = 1;
        this.levelLife = 20;
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
    
    public void Atacar(Monster monster) {
        float descuento;
        descuento = this.getLevelAtack() * 1 / monster.getLevelDefense();
        monster.setLevelLife(monster.getLevelLife() - descuento);        
    }
    
    @Override
    public String toString() {
        return ("Human: N:" + this.name + " D:" + this.levelDefense + ", A:" + 
                this.levelAtack + ", L:" + this.levelLife + ", E:" + this.estado);
    }
    
    public void modificar(int numero) {
        numero  = numero -5;
    }
}
