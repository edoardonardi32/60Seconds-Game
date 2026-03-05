/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg60seconds.game;

/**
 *
 * @author nardi
 */
public class MaryJane extends Personaggio {

    public MaryJane() {
        super(new Inventario());

        inventario.setMascheraGas(true);
        inventario.setLucchetto(true);
        inventario.setScatoleDiCibo(8);
        inventario.setBottiglieDiAcqua(4);
    }
}
