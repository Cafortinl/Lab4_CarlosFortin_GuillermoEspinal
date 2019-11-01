/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_carlosfortin_guillermoespinal;

/**
 *
 * @author admin
 */
public class MaestroFuego extends Mestro{

    public MaestroFuego() {
        
    }

    public MaestroFuego(String nombre, String rango, int edad) {
        super(nombre, rango, edad);
        super.setPtos_Vida(160);
        super.setAtaque1(40);
        super.setAtaque2(45);
    }
    

    @Override
    public String toString() {
        return super.toString()+"MaestroFuego{" + '}';
    }
    public int Ataque1 (){
        return super.getAtaque1();
    }
    public int Ataque2(){
        return super.getAtaque2();
    }
}
