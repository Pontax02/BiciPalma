package domain.tarjetausuario;

public class TarjetaUsuario {

    private final int id;
    private boolean activada;

    public TarjetaUsuario(int id, boolean activada) {
        this.id = id;
        this.activada = false;
    }

    public int getID(){
        return this.id;

    }
    }

