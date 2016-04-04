package unq_ciu.gatoEncerrado;

import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Accion;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Jugador;
import unq_ciu.gatoEncerrado.Laberinto;

@Accessors
@Observable
@SuppressWarnings("all")
public class Juego {
  private Jugador jugador;
  
  private Laberinto laberinto;
  
  private Habitacion habitacionSeleccionada;
  
  public Juego() {
  }
  
  public Juego(final Jugador jugador, final Laberinto laberinto) {
    this.jugador = jugador;
    this.laberinto = laberinto;
  }
  
  /**
   * Devuelve la lista de acciones posibles dentro de la habitacion actual del juego.
   */
  public List<Accion> accionesPosibles() {
    Habitacion _habitacion = this.jugador.getHabitacion();
    return _habitacion.getAcciones();
  }
  
  @Pure
  public Jugador getJugador() {
    return this.jugador;
  }
  
  public void setJugador(final Jugador jugador) {
    this.jugador = jugador;
  }
  
  @Pure
  public Laberinto getLaberinto() {
    return this.laberinto;
  }
  
  public void setLaberinto(final Laberinto laberinto) {
    this.laberinto = laberinto;
  }
  
  @Pure
  public Habitacion getHabitacionSeleccionada() {
    return this.habitacionSeleccionada;
  }
  
  public void setHabitacionSeleccionada(final Habitacion habitacionSeleccionada) {
    this.habitacionSeleccionada = habitacionSeleccionada;
  }
}
