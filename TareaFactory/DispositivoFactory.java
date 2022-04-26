
package TareaFactory;

/**
 *
 * @author IZA MASTER
 */
public class DispositivoFactory {
    public static Dispositivo createDispositivo(int tipo){
        switch (tipo) {
            case Dispositivo.COMPUTADORA:
                return new Computadora("Toshiba", "NVIDIA",5000 ,100, 16 ,8 );
                
            case Dispositivo.SMARTPHONE:
                return new Smartphone("Samsung",2000 ,100 ,100,8 );
                
            case Dispositivo.TABLET:
                return new Tablet("Apple",3000 ,50 ,100, 8, 80, 50 );
                
            default:
                throw new AssertionError();
        }
    }
}

