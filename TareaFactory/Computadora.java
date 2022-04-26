package TareaFactory;

/**
 *
 * @author IZA MASTER
 */
public class Computadora implements Dispositivo{
    private String Marca;
    private String Grafica;
    private int Precio;
    private int bateria;
    private int RAM;
    private int ROM;

    public Computadora() {
    }

    public Computadora(String Marca, String Grafica, int Precio, int bateria, int RAM, int ROM) {
        this.Marca = Marca;
        this.Grafica = Grafica;
        this.Precio = Precio;
        this.bateria = bateria;
        this.RAM = RAM;
        this.ROM = ROM;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getGrafica() {
        return Grafica;
    }

    public void setGrafica(String Grafica) {
        this.Grafica = Grafica;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getROM() {
        return ROM;
    }

    public void setROM(int ROM) {
        this.ROM = ROM;
    }

    @Override
    public String toString() {
        return "Computadora{" + "Marca=" + Marca + ", Grafica=" + Grafica + ", Precio=" + Precio + ", bateria=" + bateria + ", RAM=" + RAM + ", ROM=" + ROM + '}';
    }

    
    
}

