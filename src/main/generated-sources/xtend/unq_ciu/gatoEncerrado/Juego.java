package unq_ciu.gatoEncerrado;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.UserException;
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
    boolean _xblockexpression = false;
    {
      this.validarNombre(lab);
      List<Laberinto> _laberintos = this.getLaberintos();
      _xblockexpression = _laberintos.add(lab);
    }
    return _xblockexpression;
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
  
  /**
   * Valida si el nombre de un laberinto ya se encuentra en uso en la lista de laberintos del juego.
   * @params laberinto : el laberinto al cual se va a verificar el nombre.
   */
  public void validarNombre(final Laberinto laberinto) {
    final ArrayList<String> nombresLaberintos = new ArrayList<String>();
    for (final Laberinto l : this.laberintos) {
      String _nombre = l.getNombre();
      nombresLaberintos.add(_nombre);
    }
    String _nombre_1 = laberinto.getNombre();
    boolean _contains = nombresLaberintos.contains(_nombre_1);
    if (_contains) {
      String _nombre_2 = laberinto.getNombre();
      String _plus = ("Ya existe un laberinto con el nombre " + _nombre_2);
      throw new UserException(_plus);
    }
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
