package domain.estacion;

public class Estacion {

    private int id;
    private final String direccion;
    private int anclajes;


    public Estacion(int id, String direccion, int anclajes) {
        this.id = id;
        this.direccion = direccion;
        this.anclajes = anclajes;
    }

    public void  consultarEstacion(){
        System.out.println("id: " + getID() + "\nEstacion: " + getDireccion() + "\nanclaje: " + getAnclajes());
    }

    public int getID(){
    return this.id;

    }
    public String getDireccion(){
        return this.direccion;

    }

    public int getAnclajes(){
        return this.anclajes;
    }
}

