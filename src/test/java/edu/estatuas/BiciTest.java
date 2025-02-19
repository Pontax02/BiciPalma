package edu.estatuas;

import domain.estacion.Estacion;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.BeforeClass;

public class BiciTest {
    private static Estacion estacion;
    @BeforeClass
    public static void setup(){
        estacion = new Estacion(1, "Manacor", 6);
    }


    @Test
    public void consultarEstacionTest(){
    assertEquals(1, estacion.getID());
    assertEquals("Manacor", estacion.getDireccion());
    assertEquals(6, estacion.getAnclajes());

    }



















}
