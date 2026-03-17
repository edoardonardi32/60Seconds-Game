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
    protected int stamina = 100;
    protected Inventario inventario;
    protected int giorniSenzaCibo;
    protected int giorniSenzaAcqua;
    protected int saluteMentale = 100;
    protected int salute = 100;
    protected boolean vivo = true;

    
    
    public abstract void  AbilitaSpeciale();
    public Personaggio(Inventario inventario) {
        this.inventario = inventario;
    }

    // ===== AZIONI =====

    public String bevi() {
        if (acqua > 0) {
            acqua--;
            giorniSenzaAcqua = 0;
            return "Ha bevuto, ne aveva proprio bisogno";
        } else {
            giorniSenzaAcqua++;
            return "Non hai acqua";
        }
    }

    public String mangia() {
        if (cibo > 0) {
            cibo--;
            giorniSenzaCibo = 0;
            return "Ha mangiato, ne aveva proprio bisogno";
        } else {
            giorniSenzaCibo++;
            return "Non hai cibo";
        }
    }

    public void ammalati() {
        salute -= 20;
        if (salute < 0) salute = 0;
    }

    public void guarisci() {
        salute += 20;
        if (salute > 100) salute = 100;
    }

    public void perdiSanitaMentale() {
        saluteMentale -= 20;
        if (saluteMentale < 0) saluteMentale = 0;
    }

    public void recuperaSanitaMentale() {
        saluteMentale = 100;
    }

    public void muori() {
        vivo = false;
        salute = 0;
    }

    public boolean isVivo() {
        return vivo;
    }

    // ===== LOGICA DI GIOCO =====

    public void consumaRisorse() {
        giorniSenzaCibo++;
        giorniSenzaAcqua++;

        if (giorniSenzaCibo > 3) {
            salute -= 10;
        }

        if (giorniSenzaAcqua > 2) {
            salute -= 20;
        }

        if (salute <= 0) {
            muori();
        }
    }

    public void aggiornaStato() {
        if (salute < 30) {
            perdiSanitaMentale();
        }

        if (saluteMentale <= 0) {
            muori();
        }
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