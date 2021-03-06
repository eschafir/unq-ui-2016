package unq_ciu.gatoEncerrado;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang.math.RandomUtils;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.UserException;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Estado;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Item;

@Accessors
@Observable
@SuppressWarnings("all")
public class Laberinto {
  private int id;
  
  private String nombre;
  
  private List<Habitacion> habitaciones;
  
  private String path;
  
  private Estado estado;
  
  public Laberinto() {
    ArrayList<Habitacion> _arrayList = new ArrayList<Habitacion>();
    this.habitaciones = _arrayList;
    this.estado = Estado.NO_RESUELTO;
  }
  
  public Laberinto(final String nombre) {
    int _nextInt = RandomUtils.nextInt();
    this.id = _nextInt;
    this.nombre = nombre;
    ArrayList<Habitacion> _arrayList = new ArrayList<Habitacion>();
    this.habitaciones = _arrayList;
    this.path = "";
    this.estado = Estado.NO_RESUELTO;
  }
  
  public Laberinto(final String nombre, final int id) {
    this.nombre = nombre;
    ArrayList<Habitacion> _arrayList = new ArrayList<Habitacion>();
    this.habitaciones = _arrayList;
    this.id = id;
    this.path = "";
    this.estado = Estado.NO_RESUELTO;
  }
  
  public Laberinto(final int id, final String nombre, final String path) {
    this.id = id;
    this.nombre = nombre;
    ArrayList<Habitacion> _arrayList = new ArrayList<Habitacion>();
    this.habitaciones = _arrayList;
    this.path = path;
    this.estado = Estado.NO_RESUELTO;
  }
  
  public Laberinto(final int id, final String nombre, final String path, final List<Habitacion> habitaciones) {
    this.id = id;
    this.nombre = nombre;
    this.habitaciones = habitaciones;
    this.path = path;
    this.estado = Estado.NO_RESUELTO;
  }
  
  public boolean agregarHabitacion(final Habitacion h) {
    boolean _xblockexpression = false;
    {
      boolean _and = false;
      boolean _isEsInicial = h.isEsInicial();
      if (!_isEsInicial) {
        _and = false;
      } else {
        Boolean _tieneHabInicial = this.getTieneHabInicial();
        _and = (_tieneHabInicial).booleanValue();
      }
      if (_and) {
        throw new UserException("Ya existe una habitacion inicial en este laberinto.");
      }
      String _nombre = h.getNombre();
      this.validarNombre(_nombre);
      List<Habitacion> _habitaciones = this.getHabitaciones();
      _xblockexpression = _habitaciones.add(h);
    }
    return _xblockexpression;
  }
  
  public Boolean getTieneHabInicial() {
    final Function1<Habitacion, Boolean> _function = new Function1<Habitacion, Boolean>() {
      public Boolean apply(final Habitacion it) {
        return Boolean.valueOf(it.isEsInicial());
      }
    };
    return Boolean.valueOf(IterableExtensions.<Habitacion>exists(this.habitaciones, _function));
  }
  
  public void validarNombre(final String nuevoNombre) {
    final Function1<Habitacion, Boolean> _function = new Function1<Habitacion, Boolean>() {
      public Boolean apply(final Habitacion it) {
        String _nombre = it.getNombre();
        return Boolean.valueOf(_nombre.equals(nuevoNombre));
      }
    };
    boolean _exists = IterableExtensions.<Habitacion>exists(this.habitaciones, _function);
    if (_exists) {
      throw new UserException(("Ya existe una habitacion con el nombre " + nuevoNombre));
    }
    boolean _equals = Objects.equal(nuevoNombre, "");
    if (_equals) {
      throw new UserException("Ingrese un nombre para la habitacion");
    }
  }
  
  public boolean eliminarHabitacion(final Habitacion h) {
    boolean _xifexpression = false;
    List<Habitacion> _habitaciones = this.getHabitaciones();
    boolean _contains = _habitaciones.contains(h);
    if (_contains) {
      boolean _xifexpression_1 = false;
      boolean _isEsInicial = h.isEsInicial();
      if (_isEsInicial) {
        List<Habitacion> _habitaciones_1 = this.getHabitaciones();
        _xifexpression_1 = _habitaciones_1.remove(h);
      } else {
        List<Habitacion> _habitaciones_2 = this.getHabitaciones();
        _xifexpression_1 = _habitaciones_2.remove(h);
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  /**
   * Guarda en un ArrayList de todas las habitaciones los items disponibles
   */
  public List<Item> getItemsDisponibles() {
    List<Habitacion> _habitaciones = this.getHabitaciones();
    final Function1<Habitacion, List<Item>> _function = new Function1<Habitacion, List<Item>>() {
      public List<Item> apply(final Habitacion h) {
        return h.getItems();
      }
    };
    List<List<Item>> _map = ListExtensions.<Habitacion, List<Item>>map(_habitaciones, _function);
    Iterable<Item> _flatten = Iterables.<Item>concat(_map);
    return IterableExtensions.<Item>toList(_flatten);
  }
  
  public String getGetHabitacionInicial() {
    for (final Habitacion h : this.habitaciones) {
      boolean _isEsInicial = h.isEsInicial();
      if (_isEsInicial) {
        return h.getNombre();
      }
    }
    return null;
  }
  
  public String getGetHabitacionFinal() {
    for (final Habitacion h : this.habitaciones) {
      boolean _isEsFinal = h.isEsFinal();
      if (_isEsFinal) {
        return h.getNombre();
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
  public List<Habitacion> getHabitaciones() {
    return this.habitaciones;
  }
  
  public void setHabitaciones(final List<Habitacion> habitaciones) {
    this.habitaciones = habitaciones;
  }
  
  @Pure
  public String getPath() {
    return this.path;
  }
  
  public void setPath(final String path) {
    this.path = path;
  }
  
  @Pure
  public Estado getEstado() {
    return this.estado;
  }
  
  public void setEstado(final Estado estado) {
    this.estado = estado;
  }
}
