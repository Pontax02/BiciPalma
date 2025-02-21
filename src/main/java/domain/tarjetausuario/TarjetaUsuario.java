package domain.tarjetausuario;

public class TarjetaUsuario {

    private final String id;
    private boolean activada;

    TarjetaUsuario(String id, boolean activada) {
        this.id = id;
        this.activada = false;
    }

}
