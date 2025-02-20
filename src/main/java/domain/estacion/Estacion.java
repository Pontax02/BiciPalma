package domain.estacion;

public class Estacion {

    private int id;
    private final String direccion;
    private int anclajes;
    private int[] anclajesLibres;


    public Estacion(int id, String direccion, int anclajes) {
        this.id = id;
        this.direccion = direccion;
        this.anclajes = anclajes;
        this.anclajesLibres = new int[6];
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

    public int anclajesLibres() {

        int anclajesLibres = 0;

        for (int i = 0; i < this.anclajesLibres.length; i++) {
            if (this.anclajesLibres[i] == 0) {
                anclajesLibres++;
            }
        }
        return anclajesLibres;
    }



}
