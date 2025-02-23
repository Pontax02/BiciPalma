package domain.tarjetausuario;

public class TarjetaUsuario {

    private final String id;
    private boolean activada;

    public TarjetaUsuario(String id, boolean activada) {
        this.id = id;
        this.activada = activada;
    }

    public String getID(){
        return this.id;
    }

    public boolean isActivada(){
        return this.activada;
    }
    public void setTarjeta(boolean activada){
        this.activada = activada;


    }


    }

