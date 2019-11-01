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
                    boolean edad_try= true;
                    int edad =0;
                    while (edad_try) {  
                        try{
                         System.out.println("Ingrese edad :");
                         edad = zelda.nextInt();
                         //edad_try = false;
                        }catch(InputMismatchException e){
                            System.out.println(e.getMessage());//"La edad solo puede ser numeros vuelva a ingresarla: ");
                            edad=zelda.nextInt();
                           // edad=zelda.nextInt();
                          // edad_try=false;
                        }
                    }
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
                    System.out.println("De que tipo quiere listar los amestros :");
                    System.out.println("1.- Aire");
                    System.out.println("2.- Agua");
                    System.out.println("3.- Tierra");
                    System.out.println("4.- Fuego");
                    int lista= zelda.nextInt();
                    switch (lista){
                        case 1:
                            for (int i = 0; i < Maestros.size(); i++) {
                                if (Maestros.get(i) instanceof MaestroAire){
                                    System.out.println(""+i+".- "+Maestros.get(i));
                                }
                            }
                            break;
                        case 2:
                            for (int i = 0; i < Maestros.size(); i++) {
                                if (Maestros.get(i) instanceof MaestroAgua){
                                    System.out.println(""+i+".- "+Maestros.get(i));
                                }
                            }
                            break;
                        case 3:
                            for (int i = 0; i < Maestros.size(); i++) {
                                if (Maestros.get(i) instanceof MaestroTierra){
                                    System.out.println(""+i+".- "+Maestros.get(i));
                                }
                            }
                            break;
                        case 4:
                            for (int i = 0; i < M_fuego.size(); i++) {
                                if (M_fuego.get(i) instanceof MaestroFuego){
                                    System.out.println(""+i+".- "+M_fuego.get(i));
                                }
                            }
                            break;
                    }
                    break;
                case 4:
                    break;
            }
            
            
            
            
            
            }catch(InputMismatchException e){
                System.out.println("Solo se pueden ingresar numeros");
            }
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
        
    public static void Pelea(ArrayList<Mestro> usuario, ArrayList<Mestro> M_Fuego, Avatar avatar) throws Exceptionss{
        
        if(usuario.size()<2)
            throw new Exceptionss("El usuario debe tener por lo menos 2 maestros");
        else if(M_Fuego.size()<4)
            throw new Exceptionss("Deben de haber por lo menos 4 maestros de fuego");
        else
        {
            while(usuario.size()>1 && M_Fuego.size()>1){
                
                System.out.println("Seleccione al maestro con el que desea atacar: ");
                
            }
        }
        
    }   
          
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
               
    
}
