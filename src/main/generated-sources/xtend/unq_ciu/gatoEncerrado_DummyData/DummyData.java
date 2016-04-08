package unq_ciu.gatoEncerrado_DummyData;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Juego;
import unq_ciu.gatoEncerrado.Jugador;
import unq_ciu.gatoEncerrado.Laberinto;

/**
 * Esta clase es simplemente un utils para crear objetos tontos
 * que sirva de ejemplo para mostrar en las ventanas.
 * 
 * NO es ningun patron, NO es una practica recomendada, pero
 * cuando queremos mostrar un ejemplo nos interesa que tenga datos.
 * 
 * Es solo UNA forma de crearlos.
 */
@Observable
@SuppressWarnings("all")
public class DummyData {
  public Juego crearJuegoDummy() {
    Juego _juego = new Juego();
    final Procedure1<Juego> _function = new Procedure1<Juego>() {
      public void apply(final Juego it) {
        final Habitacion entrada = new Habitacion("Entrada principal", true, false);
        final Habitacion cocina = new Habitacion("Cocina", false, false);
        final Habitacion comedor = new Habitacion("Comedor", false, false);
        final Habitacion pasillo = new Habitacion("Pasillo", false, false);
        final Habitacion sotano = new Habitacion("Sótano", false, false);
        final Habitacion patio = new Habitacion("Patio", false, true);
        final Laberinto laberinto = new Laberinto("Casa Abandonada");
        Jugador _jugador = new Jugador("Esteban", entrada);
        it.setJugador(_jugador);
        laberinto.agregarHabitacion(entrada);
        laberinto.agregarHabitacion(cocina);
        laberinto.agregarHabitacion(comedor);
        laberinto.agregarHabitacion(pasillo);
        laberinto.agregarHabitacion(sotano);
        laberinto.agregarHabitacion(patio);
        it.agregarLaberinto(laberinto);
      }
    };
    return ObjectExtensions.<Juego>operator_doubleArrow(_juego, _function);
  }
}
