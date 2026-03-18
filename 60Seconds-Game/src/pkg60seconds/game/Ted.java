/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg60seconds.game;

/**
 *
 * @author nardi
 */
public class Ted extends Personaggio {

    public Ted() {
        super(new Inventario());

        inventario.setFucile(true);
        inventario.setAscia(true);
        inventario.setScatoleDiCibo(6);
        inventario.setBottiglieDiAcqua(5);
        this.setSaluteMentale(saluteMentale);
    }
        @Override
   public void AbilitaSpeciale(){
       cibo+=5;
   }
   
}