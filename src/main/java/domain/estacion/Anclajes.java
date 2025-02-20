package domain.estacion;

public class Anclajes {

    private final Anclaje[] anclajes;

    Anclajes(int numAnclajes) {
        this.anclajes = new Anclaje[numAnclajes];
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
