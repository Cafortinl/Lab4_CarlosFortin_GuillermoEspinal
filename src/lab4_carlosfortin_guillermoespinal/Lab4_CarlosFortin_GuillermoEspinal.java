package lab4_carlosfortin_guillermoespinal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab4_CarlosFortin_GuillermoEspinal {
    public static Scanner zelda = new Scanner(System.in);

    public static void main(String[] args) {
        //yo empiezo el menu de creacion al avatar y a los maestros
        ArrayList<Mestro> Maestros = new ArrayList();
        ArrayList<Mestro> M_fuego = new ArrayList();
        ArrayList<Mestro> Usuario = new ArrayList();
        int resp = 1;
        while (resp!=0){
            try{
            System.out.println("1.- Crear avatar");
            System.out.println("2.- Crear maestros (Agua,Fuego,Aire,Tierra)");
            System.out.println("3.- Listar maestros por tipo");
            System.out.println("4.- Pelear");
            System.out.println("0.- Salir");
            resp = zelda.nextInt();
            switch (resp){
                case 1 :
                    System.out.println("Ingrese nombre del avatar: ");
                    zelda.nextLine();
                    String nombreA= zelda.nextLine();
                    Avatar avatar = new Avatar(nombreA);
                    break;
                case 2:
                    System.out.println("Ingrese nombre :");
                    zelda.nextLine();
                    String nombreM= zelda.nextLine();
                    System.out.println("Ingrese edad :");
                    int edad = zelda.nextInt();
                    System.out.println("Ingrese rango :");
                    String rango = zelda.next();
                    System.out.println("Ingrese de que tipo :");
                    System.out.println("1.- Maestro Aire");
                    System.out.println("2.- Maestro Agua");
                    System.out.println("3.- Maestro Tierra");
                    System.out.println("4.- Maestro Fuego");
                    int tipo = zelda.nextInt();
                    switch (tipo){
                        case 1:
                            Maestros.add(new MaestroAire(nombreM, rango, edad));
                        break;
                        case 2:
                             Maestros.add(new MaestroAgua(nombreM, rango, edad));
                            break;
                        case 3 :
                             Maestros.add(new MaestroTierra(nombreM, rango, edad));
                            break;
                        case 4:
                             M_fuego.add(new MaestroFuego(nombreM, rango, edad));
                            break;
                    }
                    
                    break;
                case 3 :
                    break;
            }
            
            
            
            
            
            }catch(InputMismatchException e){
                System.out.println("Solo se pueden ingresar numeros");
            }
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
        
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
               
    
}
