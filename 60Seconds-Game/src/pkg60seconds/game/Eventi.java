/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg60seconds.game;

/**
 *
 * @author nardi
 */
public class Eventi {

    public String generaInfestazione() {
        String[] messaggi = {
        "Oh no! La cucina è invasa dagli scarafaggi!",
        "Attenzione! Gli scarafaggi hanno preso il sopravvento!",
        "Un terribile sciame di scarafaggi corre sulle pareti!",
        "Scorri più veloce! Gli scarafaggi stanno ovunque!",
        "Che disgrazia! La tua casa è infestata da scarafaggi!"
    };
    
    int indice = (int) (Math.random() * messaggi.length);
    return messaggi[indice];
    }

    public String eliminaInfestazione() {
        String[] messaggi = {
        "Missione compiuta! Nessuno scarafaggio rimane, la cucina è finalmente sicura.",
        "Gli ultimi scarafaggi sono stati annientati! La vittoria è tua!",
        "Casa sicura e pulita! Non rimane nemmeno un insetto.",
        "Trionfo totale! L’infestazione è finita e la tua casa è finalmente libera.",
        "Hai liberato completamente la casa dagli scarafaggi! Che sollievo!"
    };
    
    int indice = (int) (Math.random() * messaggi.length);
    return messaggi[indice];
    }

    public void perditaScorte() {
    }

    public void guadagnoScorte() {
    }

    public void usaKitMedico() {
    }

    public void peggioraMalattia() {
    }

    public void statoCritico() {
    }

    public void ascoltaRadio()  {
    }

    public void riparaRadio() {
    }

    public void inviaSegnale() {
    }

    public void bussanoAllaPorta() {
    }

    public void apriPorta() {
    }

    public void effettuaScambio() {
    }

    public void subisciFurto() {
    }

    public void ignoraPorta() {
    }

    public void riceviSegnale() {
    }

    public void controllaCondizioneVittoria() {
    }

    public void attivaFinaleSalvataggio() {
    }

    public void attivaFinaleFollia() {
    }

    public void attivaFinaleMorte() {
    }

    public void attivaFinaleSopravvivenzaLunga() {
    }
}
