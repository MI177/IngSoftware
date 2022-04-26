package TareaFactory;

/**
 *
 * @author IZA MASTER
 */
public class Smartphone implements Dispositivo{
    private String Marca;
    private int Precio;
    private int Camara;
    private int bateria;
    private int RAM;

    public Smartphone() {
    }

    public Smartphone(String Marca, int Precio, int Camara, int bateria, int RAM) {
        this.Marca = Marca;
        this.Precio = Precio;
        this.Camara = Camara;
        this.bateria = bateria;
        this.RAM = RAM;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getCamara() {
        return Camara;
    }

    public void setCamara(int Camara) {
        this.Camara = Camara;
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

    @Override
    public String toString() {
        return "Smartphone{" + "Marca=" + Marca + ", Precio=" + Precio + ", Camara=" + Camara + ", bateria=" + bateria + ", RAM=" + RAM + '}';
    }
    
    
}

