/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;
import java.util.Random;
/**
 *
 * @author Wiston Rivas
 * @author Emanuel Gomez
 */
public class GeneradorAleatorio {
    private static final Random rand = new Random();

    public static int generar(int min, int max) {
        return rand.nextInt(max - min + 1) + min;
    }

    public static int aplicarModificador(int base, double modificador) {
        return (int) (base + base * modificador);
    }
}