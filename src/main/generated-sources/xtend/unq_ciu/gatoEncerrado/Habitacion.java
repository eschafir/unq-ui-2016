package unq_ciu.gatoEncerrado;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Accion;
import unq_ciu.gatoEncerrado.Item;
import unq_ciu.gatoEncerrado.Juego;
import unq_ciu.gatoEncerrado.Laberinto;
import unq_ciu.gatoEncerrado.acciones.Agarrar;

@Accessors
@Observable
@SuppressWarnings("all")
public class Habitacion {
  private int id;
  
  private String nombre;
  
  private boolean esInicial;
  
  private boolean esFinal;
  
  private List<Accion> acciones;
  
  private String path;
  
  public Habitacion() {
    ArrayList<Accion> _arrayList = new ArrayList<Accion>();
    this.acciones = _arrayList;
  }
  
  public Habitacion(final String nombre, final boolean eI, final boolean eF) {
    this.nombre = nombre;
    this.esInicial = eI;
    this.esFinal = eF;
    ArrayList<Accion> _arrayList = new ArrayList<Accion>();
    this.acciones = _arrayList;
  }
  
  public Habitacion(final int id, final String nombre, final List<Accion> acciones, final String path) {
    this.nombre = nombre;
    this.id = id;
    this.path = path;
    this.acciones = acciones;
  }
  
  public Habitacion(final int id, final String nombre, final boolean eI, final boolean eF, final String path) {
    this.nombre = nombre;
    this.esInicial = eI;
    this.esFinal = eF;
    this.id = id;
    this.path = path;
    ArrayList<Accion> _arrayList = new ArrayList<Accion>();
    this.acciones = _arrayList;
  }
  
  /**
   * Agrega una accion a la lista de acciones permitidas en la habitacion.
   */
  public boolean agregarAccion(final Accion acc) {
    List<Accion> _acciones = this.getAcciones();
    return _acciones.add(acc);
  }
  
  /**
   * Quita una accion de la lista de acciones permitidas en la habitacion.
   */
  public boolean quitarAccion(final Accion acc) {
    boolean _xifexpression = false;
    List<Accion> _acciones = this.getAcciones();
    boolean _contains = _acciones.contains(acc);
    if (_contains) {
      List<Accion> _acciones_1 = this.getAcciones();
      _xifexpression = _acciones_1.remove(acc);
    }
    return _xifexpression;
  }
  
  /**
   * Indica si la habitacion tiene un item disponible para agarrar.
   */
  public boolean hayItem() {
    final Iterable<Agarrar> accionesAgarrar = Iterables.<Agarrar>filter(this.acciones, Agarrar.class);
    boolean _isEmpty = IterableExtensions.isEmpty(accionesAgarrar);
    return (!_isEmpty);
  }
  
  public List<Item> getItems() {
    final Function1<Accion, Item> _function = new Function1<Accion, Item>() {
      public Item apply(final Accion it) {
        return it.getItem();
      }
    };
    return ListExtensions.<Accion, Item>map(this.acciones, _function);
  }
  
  /**
   * Devuelve el laberinto en el cual está la habitación.
   */
  public Laberinto getLaberinto(final Juego juego) {
    List<Laberinto> _laberintos = juego.getLaberintos();
    for (final Laberinto l : _laberintos) {
      List<Habitacion> _habitaciones = l.getHabitaciones();
      boolean _contains = _habitaciones.contains(this);
      if (_contains) {
        return l;
      }
    }
    return null;
  }
  
  @Pure
  public int getId() {
    return this.id;
  }
  
  public void setId(final int id) {
    this.id = id;
  }
  
  @Pure
  public String getNombre() {
    return this.nombre;
  }
  
  public void setNombre(final String nombre) {
    this.nombre = nombre;
  }
  
  @Pure
  public boolean isEsInicial() {
    return this.esInicial;
  }
  
  public void setEsInicial(final boolean esInicial) {
    this.esInicial = esInicial;
  }
  
  @Pure
  public boolean isEsFinal() {
    return this.esFinal;
  }
  
  public void setEsFinal(final boolean esFinal) {
    this.esFinal = esFinal;
  }
  
  @Pure
  public List<Accion> getAcciones() {
    return this.acciones;
  }
  
  public void setAcciones(final List<Accion> acciones) {
    this.acciones = acciones;
  }
  
  @Pure
  public String getPath() {
    return this.path;
  }
  
  public void setPath(final String path) {
    this.path = path;
  }
}
