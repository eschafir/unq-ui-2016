package unq_ciu.gatoEncerrado;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.TransactionalAndObservable;
import unq_ciu.gatoEncerrado.Accion;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Jugador;
import unq_ciu.gatoEncerrado.Laberinto;

@Accessors
@TransactionalAndObservable
@SuppressWarnings("all")
public class Juego {
  private Jugador jugador;
  
  private List<Laberinto> laberintos;
  
  public Juego() {
    Jugador _jugador = new Jugador();
    this.jugador = _jugador;
    ArrayList<Laberinto> _arrayList = new ArrayList<Laberinto>();
    this.laberintos = _arrayList;
  }
  
  public Juego(final Jugador jugador) {
    this.jugador = jugador;
    ArrayList<Laberinto> _arrayList = new ArrayList<Laberinto>();
    this.laberintos = _arrayList;
  }
  
  /**
   * Devuelve la lista de acciones posibles dentro de la habitacion actual del juego.
   */
  public List<Accion> accionesPosibles() {
    Habitacion _habitacion = this.jugador.getHabitacion();
    return _habitacion.getAcciones();
  }
  
  /**
   * Agrega un laberinto al juego.
   * @params lab : laberinto a agregar.
   */
  public boolean agregarLaberinto(final Laberinto lab) {
    List<Laberinto> _laberintos = this.getLaberintos();
    return _laberintos.add(lab);
  }
  
  /**
   * Remueve un laberinto del juego.
   * @params lab : laberinto a quitar.
   */
  public boolean quitarLaberinto(final Laberinto lab) {
    boolean _xifexpression = false;
    boolean _contains = this.laberintos.contains(lab);
    if (_contains) {
      _xifexpression = this.laberintos.remove(lab);
    }
    return _xifexpression;
  }
  
  @Pure
  public Jugador getJugador() {
    return this.jugador;
  }
  
  public void setJugador(final Jugador jugador) {
    this.jugador = jugador;
  }
  
  @Pure
  public List<Laberinto> getLaberintos() {
    return this.laberintos;
  }
  
  public void setLaberintos(final List<Laberinto> laberintos) {
    this.laberintos = laberintos;
  }
}
