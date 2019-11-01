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
public class Avatar {
    String nombre;
    int ptos_vida;
    int ataque1;
    int ataque2;
    int ataque3;
    int ataque4;
    int ataque5;
    int ataque6;
    int ataque7;
    int ataque8;

    public Avatar() {
    }

    public Avatar(String nombre) {
        this.nombre = nombre;
        this.ptos_vida = 350;
        this.ataque1=35;
        this.ataque2=42;
        this.ataque3=38;
        this.ataque4=45;
        this.ataque5=40;
        this.ataque6=52;
        this.ataque7=40;
        this.ataque8=45;
      
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPtos_vida() {
        return ptos_vida;
    }

    public void setPtos_vida(int ptos_vida) {
        this.ptos_vida = ptos_vida;
    }

    public int getAtaque1() {
        return ataque1;
    }

    public int getAtaque2() {
        return ataque2;
    }

    public int getAtaque3() {
        return ataque3;
    }

    public int getAtaque4() {
        return ataque4;
    }

    public int getAtaque5() {
        return ataque5;
    }

    public int getAtaque6() {
        return ataque6;
    }

    public int getAtaque7() {
        return ataque7;
    }

    public int getAtaque8() {
        return ataque8;
    }

    @Override
    public String toString() {
        return "Avatar{" + "nombre=" + nombre + ", ptos_vida=" + ptos_vida + ", ataque1=" + ataque1 + ", ataque2=" + ataque2 + ", ataque3=" + ataque3 + ", ataque4=" + ataque4 + ", ataque5=" + ataque5 + ", ataque6=" + ataque6 + ", ataque7=" + ataque7 + ", ataque8=" + ataque8 + '}';
    }
    public int Ataque1(){
        return this.ataque1;
    }
    public int Ataque2(){
        return this.ataque2;
    }
    public int Ataque3(){
        return this.ataque3;
    }
    public int Ataque4(){
        return this.ataque4;
    }
    public int Ataque5(){
        return this.ataque5;
    }
    public int Ataque6(){
        return this.ataque6;
    }
    public int Ataque7(){
        return this.ataque7;
    }
    public int Ataque8(){
        return this.ataque8;
    }
    
    
    
}
