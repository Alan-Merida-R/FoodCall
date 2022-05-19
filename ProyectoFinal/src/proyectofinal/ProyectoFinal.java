package proyectofinal;

//ZONA DE IMPORTACIONES
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import proyectofinal.Controlador.BaseDeDatos;
import proyectofinal.modelo.Menu;
import proyectofinal.modelo.Platillo;

/**
 * Clase principal.
 * @author Foodcall
 */
public class ProyectoFinal {
    
    //MÉTODO PRINCIPAL
    public static void main(String[] args) throws IOException {
       
        //CREACIÓN DEL MENÚ
        //crearMenu();
        /*Menu elMenu = new Menu();
        elMenu.crearMenu();
        elMenu.mostrarMenu(1);
        //BIENVENIDA
        System.out.println("\nBienvenido a Foodcall.");
        
        //INICIAR SESIÓN, REGISTRARSE
        System.out.println("Teclee el número de la opción que desea realizar:\n");
        int opcion = 0;//VARIABLES QUE GUARDA LA OPCIÓN TECLEADA
        Scanner entrada = new Scanner(System.in);
        
        do {
            System.out.println("1. Iniciar sesión.");
            System.out.println("2. Registrar nuevo usuario.");
            opcion=Integer.parseInt(entrada.next());
        } while ( opcion < 1 || opcion > 2 );
        
        cls();
        
        System.out.println(opcion);
        switch(opcion){
            case 1:
                //INICIAR SESIÓN
                System.out.println("Teclee el número de usuario que es usted:\n");
                int opcion2 = 0;
                 do {
                    System.out.println("1. Cliente.");
                    System.out.println("2. Empleado.");
                    opcion2=Integer.parseInt(entrada.next());
                } while ( opcion2 < 1 || opcion2 > 2 );
                switch(opcion2){
                    case 1:
                        break;
                    case 2:
                        
                        break;
                }
                
                break;
            case 2:
                //REGISTRAR NUEVO USUARIO
                int opcion3 = 0;
                
                break;
        }*/
        Platillo plat=new Platillo(111,"Comida 0", 50, "Comida .5 descripcion", 5);
        BaseDeDatos bd=new BaseDeDatos("Prueba3", 5);
        bd.creearBaseDeDatos();
        /*for (int i = 0; i < 10; i++) {
            plat=new Platillo(i,"Comida nombre", i*100, "Comida descripcion", i+10);
            bd.agregar(plat);
        }*/
        //bd.eliminar(4);
        //System.out.println(bd.dameElNumeroLaFila(1));
        //System.out.println(bd.busqueda(1,6)+" mian");
        //bd.modificar(4, plat);
        //bd.modificar(3, "25,Comida 0, 2500, Comida 0 descripcion, 35");
        Menu menu3 = new Menu();
        menu3.crearMenu();
        ArrayList<Object> menusito3=new ArrayList<Object>(); 
        menusito3.addAll(menu3.getMenu());
        bd.agregarBaseDeDatosCompleta(menusito3);
    }
    
    //MÉTODOS DEFINIDOS POR EL PROGRAMADOR
    
    //LIMPIAR PANTALLA
    public static void cls()throws IOException{
        System.out.println("\nLimpiando pantalla.\n");
    }    
}