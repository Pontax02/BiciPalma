package domain.estacion;

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


}
