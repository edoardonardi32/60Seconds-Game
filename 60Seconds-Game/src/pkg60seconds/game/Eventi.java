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

    Personaggio M = new MaryJane();
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

  public String guadagnoScorte() {
    M.cibo += (int)(Math.random() * 4) + 2;
    M.acqua += (int)(Math.random() * 4) + 2;

    return "Hai trovato scorte!";
}

public String usaKitMedico() {
    M.salute = Math.min(100, M.salute + ((int)(Math.random() * 25) + 15));
    return "Hai usato un kit medico";
}

public String peggioraMalattia() {
    M.salute = Math.max(0, M.salute - ((int)(Math.random() * 10) + 5));
    return "La malattia peggiora";
}

public String statoCritico() {
    M.saluteMentale = Math.max(0, M.saluteMentale - ((int)(Math.random() * 10) + 5));
    return "Sei sotto stress";
}

public String ascoltaRadio() {
    String[] messaggi = {
        "Segnale debole...",
        "Voce alla radio!",
        "Solo rumore...",
        "Niente oggi"
    };

    return messaggi[(int)(Math.random() * messaggi.length)];
}

public String riparaRadio() {
    return (Math.random() < 0.6) ?
        "Radio riparata!" :
        "Non funziona ancora...";
}

public String inviaSegnale() {
    return (Math.random() < 0.7) ?
        "Segnale inviato!" :
        "Nessuna risposta...";
}

public String bussanoAllaPorta() {
    String[] eventi = {
        "Qualcuno bussa...",
        "Colpi alla porta!",
        "Una voce fuori...",
        "Rumori strani..."
    };

    return eventi[(int)(Math.random() * eventi.length)];
}

public String apriPorta() {
    double r = Math.random();

    if (r < 0.5) return guadagnoScorte();
    if (r < 0.85) return effettuaScambio();
    return subisciFurto();
}

public String effettuaScambio() {
    M.cibo = Math.max(0, M.cibo - 1);
    M.acqua += (int)(Math.random() * 3) + 2;

    return "Scambio fatto";
}

public String subisciFurto() {
    M.cibo = Math.max(0, M.cibo - ((int)(Math.random() * 2) + 1));
    return "Hai subito un furto";
}

public String ignoraPorta() {
    return "Hai ignorato la porta";
}

public String riceviSegnale() {
    return (Math.random() < 0.6) ?
        "Segnale ricevuto!" :
        "Niente risposta";
}

public String controllaCondizioneVittoria() {
    if (M.salute <= 0) return attivaFinaleMorte();
    if (M.saluteMentale <= 0) return attivaFinaleFollia();
    if (Math.random() > 0.9) return attivaFinaleSalvataggio();

    return "Sopravvivi...";
}

public String attivaFinaleSalvataggio() {
    return "Sei stato salvato!";
}

public String attivaFinaleFollia() {
    return "Sei impazzito!";
}

public String attivaFinaleMorte() {
    return "Sei morto!";
}

public String attivaFinaleSopravvivenzaLunga() {
    return "Hai resistito a lungo!";
}
}