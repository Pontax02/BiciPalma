package domain.bicicleta;

public class Bicicleta {

    private final int id;

    public Bicicleta(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return Integer.toString(getId());
    }
}

