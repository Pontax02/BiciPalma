package domain.estacion;

import domain.bicicleta.Bicicleta;
import domain.tarjetausuario.TarjetaUsuario;
import edu.estatuas.BiciPalma;

public class Estacion {

    private int id;
    private final String direccion;
    private final Anclajes anclajes;

    public Estacion(int id, String direccion, int numAnclajes) {
        this.id = id;
        this.direccion = direccion;
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
        for (Anclaje anclaje : this.anclajes.anclajes()) {
            anclajesLibres = anclaje.isOcupado()? anclajesLibres: ++anclajesLibres;
        }
        return anclajesLibres;
    }

    public void anclarBicicleta(Bicicleta biciID) {
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

    private void mostrarAnclaje(Bicicleta biciID, int numeroAnclaje) {
        System.out.println("bicicleta " + biciID
                + " anclada en el anclaje " + numeroAnclaje);
    }

    public void consultarAnclajes() {

        int posicion = 0;
        int numeroAnclaje= 0;

        for (Anclaje anclaje : this.anclajes.anclajes()) {

            numeroAnclaje = posicion + 1;
            posicion++;
            if (anclaje.isOcupado()) {
                System.out.println("Anclaje " + numeroAnclaje + " " + anclaje.biciID);
            } else {System.out.println("Anclaje " + numeroAnclaje + " " + " libre");
            }
        }
    }
    public boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario) {

            return tarjetaUsuario.isActivada();



    }



}






