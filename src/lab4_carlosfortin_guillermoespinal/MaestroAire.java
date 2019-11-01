package lab4_carlosfortin_guillermoespinal;

/**
 *
 * @author Carlos Fortin
 */
public class MaestroAire extends Mestro{

    public MaestroAire() {
        super();
    }

    public MaestroAire(String nombre, String rango, int edad) {
        super(nombre, rango, edad);
        super.setPtos_Vida(125);
        super.setAtaque1(35);
        super.setAtaque2(42);
    }

    @Override
    public String toString() {
        return super.toString()+"MaestroAire{" + '}';
    }
    
    public int Ataque1(){
        return super.getAtaque1();
    }
    
    public int Ataque2(){
        return super.getAtaque2();
    }
    
}
