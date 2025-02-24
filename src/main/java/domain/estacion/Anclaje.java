package domain.estacion;

import domain.bicicleta.Bicicleta;

public class Anclaje {

    private int id;
    public Bicicleta biciID = null;
    private boolean ocupado = false;


    boolean isOcupado(){
        return this.ocupado;
    }

    void anclarBici(Bicicleta biciID){
        this.biciID = biciID;
        this.ocupado = true;
    }

    int getBici() {

        return biciID.getId();
    }
}
