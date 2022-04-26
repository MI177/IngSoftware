package TareaFactory;

import java.util.Scanner;

/**
 *
 * @author IZA MASTER
 */
public class TestDispositivoFactory {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;
        
        System.out.println("Que dispositivo desea comprar?: ");
        System.out.println(Dispositivo.COMPUTADORA + ")Computadora / Ordenador");
        System.out.println(Dispositivo.SMARTPHONE + ")Smartphone / Celular");
        System.out.println(Dispositivo.TABLET + ")Tablet");
        
        try {
            System.out.print("Elige el numero del dispositivo: ");
            eleccion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("No capturaste un numero");
        }
        
        Dispositivo dispositivo = DispositivoFactory.createDispositivo(eleccion);
        System.out.println(dispositivo.toString());
    }
}

