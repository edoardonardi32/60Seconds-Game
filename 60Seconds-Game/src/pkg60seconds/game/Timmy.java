/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg60seconds.game;

/**
 *
 * @author nardi
 */
public class Timmy extends Personaggio {

    public Timmy() {
        super(new Inventario());

        inventario.setLibroGiovaniMarmotte(true);
        inventario.setCarteDaGioco(true);
        inventario.setScatoleDiCibo(6);
        inventario.setBottiglieDiAcqua(6);
    }    
   @Override
   public void AbilitaSpeciale(){
       inventario.setLucchetto(true);
   }
    
   
   
}
