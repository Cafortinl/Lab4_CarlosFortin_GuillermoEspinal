
package lab4_carlosfortin_guillermoespinal;


public class MaestroTierra extends Mestro{

    public MaestroTierra() {
    }

    public MaestroTierra(String nombre, String rango, int edad) {
        super(nombre, rango, edad);
        super.setPtos_Vida(200);
        super.setAtaque1(40);
        super.setAtaque2(52);
    }

    @Override
    public String toString() {
        return super.toString()+"MaestroTierra{" + '}';
    }
    
    public int Ataque1(){
        return super.getAtaque1();
    }
    public int Ataque2(){
        return super.getAtaque2();
    }
}
