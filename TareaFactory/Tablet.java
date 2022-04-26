package TareaFactory;

/**
 *
 * @author IZA MASTER
 */
public class Tablet implements Dispositivo {
    private String Marca;
    private int Precio;
    private int Camara;
    private int bateria;
    private int RAM;
    private int Largo;
    private int Ancho;

    public Tablet() {
    }

    public Tablet(String Marca, int Precio, int Camara, int bateria, int RAM, int Largo, int Ancho) {
        this.Marca = Marca;
        this.Precio = Precio;
        this.Camara = Camara;
        this.bateria = bateria;
        this.RAM = RAM;
        this.Largo = Largo;
        this.Ancho = Ancho;
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

    public int getLargo() {
        return Largo;
    }

    public void setLargo(int Largo) {
        this.Largo = Largo;
    }

    public int getAncho() {
        return Ancho;
    }

    public void setAncho(int Ancho) {
        this.Ancho = Ancho;
    }

    @Override
    public String toString() {
        return "Tablet{" + "Marca=" + Marca + ", Precio=" + Precio + ", Camara=" + Camara + ", bateria=" + bateria + ", RAM=" + RAM + ", Largo=" + Largo + ", Ancho=" + Ancho + '}';
    }
    
    
    
}

