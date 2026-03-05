/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg60seconds.game;

/**
 *
 * @author nardi
 */
public class Dolores extends Personaggio {

    public Dolores() {
        super(new Inventario());

        inventario.setKitMedico(true);
        inventario.setFotoDiFamiglia(true);
        inventario.setScatoleDiCibo(4);
        inventario.setBottiglieDiAcqua(7);
    }
}
