package unq_ciu.gatoEncerrado;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
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
   * Agrega un laberinto al juego. Además se incluye en la lista de laberintos del jugador.
   * @params lab : laberinto a agregar.
   */
  public boolean agregarLaberinto(final Laberinto lab) {
    boolean _xblockexpression = false;
    {
      String _nombre = lab.getNombre();
      this.validarNombre(_nombre);
      List<Laberinto> _laberintos = this.getLaberintos();
      _laberintos.add(lab);
      List<Laberinto> _laberintos_1 = this.jugador.getLaberintos();
      _xblockexpression = _laberintos_1.add(lab);
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
      boolean _xblockexpression = false;
      {
        this.laberintos.remove(lab);
        List<Laberinto> _laberintos = this.jugador.getLaberintos();
        _xblockexpression = _laberintos.remove(lab);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  /**
   * Valida si el nombre de un laberinto ya se encuentra en uso en la lista de laberintos del juego.
   * @params laberinto : el laberinto al cual se va a verificar el nombre.
   */
  public void validarNombre(final String nuevoNombre) {
    final Function1<Laberinto, Boolean> _function = new Function1<Laberinto, Boolean>() {
      public Boolean apply(final Laberinto it) {
        String _nombre = it.getNombre();
        return Boolean.valueOf(_nombre.equals(nuevoNombre));
      }
    };
    boolean _exists = IterableExtensions.<Laberinto>exists(this.laberintos, _function);
    if (_exists) {
      throw new UserException(("Ya existe un laberinto con el nombre " + nuevoNombre));
    }
    boolean _equals = Objects.equal(nuevoNombre, "");
    if (_equals) {
      throw new UserException("Ingrese un nombre para el laberinto.");
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
