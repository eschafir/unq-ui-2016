package unq_ciu.gatoEncerrado;

import unq_ciu.gatoEncerrado.Jugador;
import unq_ciu.gatoEncerrado.Laberinto;

/* @Accessors
 */@SuppressWarnings("all")
public class Juego {
  private Jugador jugador;
  
  private Laberinto laberinto;
  
  public Juego(final Jugador jugador, final Laberinto laberinto) {
    this.jugador = jugador;
    this.laberinto = laberinto;
  }
}
