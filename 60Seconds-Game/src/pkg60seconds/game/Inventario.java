/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg60seconds.game;

/**
 *
 * @author nardi
 */
public class Inventario {

    private boolean libro;
    private boolean carteDaGioco;
    private boolean fotoDiFamiglia;
    private boolean fucile;
    private boolean ascia;
    private boolean lucchetto;
    private boolean radio;
    private boolean proiettili;
    private boolean sprayInsetticida;
    private boolean kitMedico;
    private boolean mascheraGas;
    private boolean libroGiovaniMarmotte;

    private int scatoleDiCibo;
    private int bottiglieDiAcqua;

    public abstract class Personaggio {

    protected Inventario inventario;

    public Personaggio(Inventario inventario) {
        this.inventario = inventario;
    }
    
    }
    
    public void setFucile(boolean fucile) { this.fucile = fucile; }
    public void setAscia(boolean ascia) { this.ascia = ascia; }
    public void setKitMedico(boolean kitMedico) { this.kitMedico = kitMedico; }
    public void setFotoDiFamiglia(boolean fotoDiFamiglia) { this.fotoDiFamiglia = fotoDiFamiglia; }
    public void setLibroGiovaniMarmotte(boolean libroGiovaniMarmotte) { this.libroGiovaniMarmotte = libroGiovaniMarmotte; }
    public void setCarteDaGioco(boolean carteDaGioco) { this.carteDaGioco = carteDaGioco; }
    public void setMascheraGas(boolean mascheraGas) { this.mascheraGas = mascheraGas; }
    public void setLucchetto(boolean lucchetto) { this.lucchetto = lucchetto; }

    public void setScatoleDiCibo(int scatoleDiCibo) { this.scatoleDiCibo = scatoleDiCibo; }
    public void setBottiglieDiAcqua(int bottiglieDiAcqua) { this.bottiglieDiAcqua = bottiglieDiAcqua; }
    
    public void usaOggetto() {
    }

    public void aggiungiOggetto() {
    }

    public void rimuoviOggetto() {
    }

    public void rompiOggetto() {
    }

    public void riparaOggetto() {
    }
    
}
