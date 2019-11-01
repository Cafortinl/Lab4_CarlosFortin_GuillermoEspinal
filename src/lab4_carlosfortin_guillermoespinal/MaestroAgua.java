package lab4_carlosfortin_guillermoespinal;

/**
 *
 * @author Carlos Fortin
 */
public class MaestroAgua extends Mestro{

    public MaestroAgua() {
        super();
    }

    public MaestroAgua(String nombre, String rango, int edad) {
        super(nombre, rango, edad);
        super.setPtos_Vida(145);
        super.setAtaque1(38);
        super.setAtaque2(45);
    }

    @Override
    public String toString() {
        return super.toString()+"MaestroAgua{" + '}';
    }
    
    public int Ataque1(){
        return super.getAtaque1();
    }
    
    public int Ataque2(){
        return super.getAtaque2();
    }
    
}
