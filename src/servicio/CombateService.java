/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;
import modelo.*;
import java.util.Scanner;
/**
 *
 * @author qadri
 */

public class CombateService {
    public void iniciarCombate(Jugador j1, Jugador j2) {
        Scanner sc = new Scanner(System.in);
        int turno = 1;

        while (j1.personaje.vida > 0 && j2.personaje.vida > 0) {
            System.out.println("\nTurno " + turno);
            ejecutarTurno(j1, j2, sc);
            if (j2.personaje.vida <= 0) break;
            ejecutarTurno(j2, j1, sc);
            turno++;
        }

        String ganador = (j1.personaje.vida > 0) ? j1.nombre : j2.nombre;
        System.out.println("\n🏆 ¡Ganador: " + ganador + "!");
    }

    private void ejecutarTurno(Jugador atacante, Jugador defensor, Scanner sc) {
    System.out.println(atacante.personaje.nombre + ", elige acción: 1-Atacar  2-Sanar");
    int opcion = sc.nextInt();

    if (opcion == 1) {
        int daño = atacante.personaje.atacar();
        defensor.personaje.vida -= daño;
        System.out.println(atacante.personaje.nombre + " ataca con " + atacante.personaje.arma.nombre + ". Daño: " + daño);
    } else {
        atacante.personaje.sanar();
    }

    if (atacante.personaje instanceof Orco) {
        ((Orco) atacante.personaje).aplicarCuracionExtra();
    }

    System.out.println(defensor.personaje.nombre + " tiene " + defensor.personaje.vida + " de vida.");
}
    }
