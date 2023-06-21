/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.ups.practicaestructura;

import Controlador.ControladorTienda;
import Vista.VistaTienda;
import java.util.Scanner;

/**
 *
 * @author JUAN ALVAREZ
 */
public class PracticaEstructura {

    public static void main(String[] args) {
        ControladorTienda controlador = new ControladorTienda();
        VistaTienda vista = new VistaTienda(controlador);

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        
        while (opcion != 4) {
            System.out.println("1. Guardar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Vender producto");
            System.out.println("4. Salir");
            System.out.print("Elija una opcion: ");
            opcion = scanner.nextInt();
            
             switch (opcion) {
                case 1:
                    vista.guardarProducto();
                    vista.mostrarInventario();
                    break;
                case 2:
                    vista.eliminarProducto();
                    vista.mostrarInventario();
                    break;
                case 3:
                    vista.venderProducto();
                    vista.mostrarInventario();
                    vista.mostrarElHistorialDeTransacciones();
                    break;
                case 4:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion invalida no existe.");
                    break;
            }
        }
    }
}
