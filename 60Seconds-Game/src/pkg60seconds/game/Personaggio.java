/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg60seconds.game;

/**
 *
 * @author nardi
 */
public abstract class Personaggio {

    protected int cibo;
    protected int acqua;
    protected int stamina=100;
    protected StatoPersonaggio stato;
    protected Inventario inventario;
    protected int giorniSenzaCibo;
    protected int giorniSenzaAcqua;
    protected int saluteMentale=100;
    protected int salute =100;

    public Personaggio(Inventario inventario) {
    }

    public void consumaRisorse() {
    }

    public void aggiornaStato() {
    }

    public StatoPersonaggio getStato() {
        return null;
    }

    public int getCibo() {
        return cibo;
    }

    public void setCibo(int cibo) {
        this.cibo = cibo;
    }

    public int getAcqua() {
        return acqua;
    }

    public void setAcqua(int acqua) {
        this.acqua = acqua;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public int getGiorniSenzaCibo() {
        return giorniSenzaCibo;
    }

    public void setGiorniSenzaCibo(int giorniSenzaCibo) {
        this.giorniSenzaCibo = giorniSenzaCibo;
    }

    public int getGiorniSenzaAcqua() {
        return giorniSenzaAcqua;
    }

    public void setGiorniSenzaAcqua(int giorniSenzaAcqua) {
        this.giorniSenzaAcqua = giorniSenzaAcqua;
    }

    public int getSaluteMentale() {
        return saluteMentale;
    }

    public void setSaluteMentale(int saluteMentale) {
        this.saluteMentale = saluteMentale;
    }

    public int getSalute() {
        return salute;
    }

    public void setSalute(int salute) {
        this.salute = salute;
    }
    
}
