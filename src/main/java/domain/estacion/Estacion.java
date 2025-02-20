package domain.estacion;


public class Estacion {

    private int id;
    private final String direccion;
    private int[] anclajesLibres;
    private final Anclajes anclajes;

    public Estacion(int id, String direccion, int numAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.anclajesLibres = new int[6];
        this.anclajes = new Anclajes(numAnclajes);
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
        return this.anclajes.numAnclajes();
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

    public void anclarBicicleta(int biciID) {
        int posicion = 0;
        int numeroAnclaje = posicion + 1;

        for (Anclaje anclaje : this.anclajes.anclajes()) {
            if (!anclaje.isOcupado()) {
                anclaje.anclarBici(biciID);
                mostrarAnclaje(biciID, posicion + 1);
                return;
            }
            posicion++;
        }
    }
    private void mostrarAnclaje(int biciID, int numeroAnclaje) {
        System.out.println("bicicleta " + biciID
                + " anclada en el anclaje " + numeroAnclaje);
    }
}






