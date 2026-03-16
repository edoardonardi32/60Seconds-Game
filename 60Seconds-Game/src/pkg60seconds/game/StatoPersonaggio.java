/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg60seconds.game;

/**
 *
 * @author nardi
 */
public class StatoPersonaggio {
    Personaggio p;
    public StatoPersonaggio(Personaggio personaggio) {
        p = personaggio;
    }

    public String bevi(int bottiglieDiAcqua) {
        if(bottiglieDiAcqua>0){
            bottiglieDiAcqua--;
            return "Ha bevuto,ne aveva proprio bisogno";
        }
        else{
        return "Non hai acqua";
        }
    }

    public String mangia(int scatoleDiCibo) {
         if(scatoleDiCibo>0){
            scatoleDiCibo--;
            return "ha mangiato,ne aveva proprio bisogno";
        }
        else{
        return "Non hai cibo";
        }
    }

    public void ammalati() {
    }

    public void guarisci() {
    
    
    }

    public void perdiSanitaMentale() {
        p.setSaluteMentale(-20);
    }

    public void recuperaSanitaMentale() {
        p.setSaluteMentale(100);
    }

    public void muori() {
        
    }

    public boolean isVivo() {
        return false;
    }
}