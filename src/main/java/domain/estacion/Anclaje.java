package domain.estacion;

public class Anclaje {

    private int id;
    private Integer biciID = null;
    private boolean ocupado = false;

    Anclaje(int id) {
        this.id = id;
    }
    boolean isOcupado(){
        return this.ocupado;
    }

    void anclarBici(int biciID){
        this.biciID = biciID;
        this.ocupado = true;
    }


}
