package edu.estatuas;

import domain.bicicleta.Bicicleta;
import domain.estacion.Estacion;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.BeforeClass;

public class BiciTest {
    private static Estacion estacion;
    private static Bicicleta bici = null;

    @BeforeClass
    public static void setup(){

        estacion = new Estacion(1, "Manacor", 6);
    }
    @BeforeClass
    public static void setupBicicleta() {
        bici = new Bicicleta( 101);
    }

        @Test
    public void consultarEstacionTest(){
    assertEquals(1, estacion.getID());
    assertEquals("Manacor", estacion.getDireccion());
    assertEquals(6, estacion.getAnclajes());

    }

    @Test 
    public void ConstructorBicicletaTest(){

        int idExpected = 101;

        Bicicleta bici = new Bicicleta(101);

        assertEquals(idExpected, bici.getId());
    }

















}
