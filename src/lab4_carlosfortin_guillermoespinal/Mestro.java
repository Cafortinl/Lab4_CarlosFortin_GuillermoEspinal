package lab4_carlosfortin_guillermoespinal;

/**
 *
 * @author Carlos Fortin
 */
public class Mestro {
    
    private String nombre;
    private String rango;
    private int edad;
    private int ptos_Vida;
    private int ataque1;
    private int ataque2;

    public Mestro() {
    }

    public Mestro(String nombre, String rango, int edad) {
        this.nombre = nombre;
        this.rango = rango;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPtos_Vida() {
        return ptos_Vida;
    }

    public void setPtos_Vida(int ptos_Vida) {
        this.ptos_Vida = ptos_Vida;
    }

    public int getAtaque1() {
        return ataque1;
    }

    public void setAtaque1(int ataque1) {
        this.ataque1 = ataque1;
    }

    public int getAtaque2() {
        return ataque2;
    }

    public void setAtaque2(int ataque2) {
        this.ataque2 = ataque2;
    }

    @Override
    public String toString() {
        return "Mestro{" + "nombre=" + nombre + ", rango=" + rango + ", edad=" + edad + ", ptos_Vida=" + ptos_Vida + ", ataque1=" + ataque1 + ", ataque2=" + ataque2 + '}';
    }
    
    
    
}
