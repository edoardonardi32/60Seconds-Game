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
    protected int stamina;
    protected StatoPersonaggio stato;
    protected Inventario inventario;
    protected int giorniSenzaCibo;
    protected int giorniSenzaAcqua;

    public Personaggio(Inventario inventario) {
    }

    public void consumaRisorse() {
    }

    public void aggiornaStato() {
    }

    public StatoPersonaggio getStato() {
        return null;
    }
}
