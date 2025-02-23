package edu.estatuas;


import domain.tarjetausuario.TarjetaUsuario;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.BeforeClass;

public class TarjetaTest{

    private static TarjetaUsuario tarjeta;

    @BeforeClass
    public static void setUpBeforeClass(){

        tarjeta = new TarjetaUsuario("123456789",true);


    }
    @Test
    public void ConstructorTarjetaTest(){

        boolean estadoTarjeta = true;
        String idExpected = "123456789";

        assertEquals(idExpected, tarjeta.getID());
        assertEquals(estadoTarjeta, tarjeta.isActivada());



    }
    @Test
    public void consultarEstadoTarjetaTest(){
        boolean estadoTarjeta = true;

        assertEquals(estadoTarjeta, tarjeta.isActivada());

    }

}
