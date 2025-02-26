package domain.estacion;

import java.util.concurrent.ThreadLocalRandom;

public class Anclajes {

    private Anclaje[] anclajes;

    private void crearAnclajes() {
        for (int i=0 ; i <anclajes.length ; i++) {
            this.anclajes[i] = new Anclaje();
        }
    }

    Anclajes(int numAnclajes) {
        this.anclajes = new Anclaje[numAnclajes];
        crearAnclajes();
    }
    Anclaje[] anclajes() {
        return this.anclajes;
    }

    int numAnclajes(){
        return this.anclajes.length;
    }

    boolean isAnclajeOcupado(int posicion){
        return this.anclajes[posicion].isOcupado();
    }

    int seleccionarAnclaje(){
        Integer idAnclaje = ThreadLocalRandom.current().nextInt(0, numAnclajes());
        return idAnclaje;
    }

    int getBiciAt(int posicion) {
        return this.anclajes[posicion].getBici();
    }

    void liberarAnclaje(int posicion) {
        this.anclajes[posicion].liberarBici();
    }
}
