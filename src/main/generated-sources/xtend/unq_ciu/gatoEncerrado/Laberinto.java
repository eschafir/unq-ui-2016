package unq_ciu.gatoEncerrado;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.UserException;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Habitacion;

@Accessors
@Observable
@SuppressWarnings("all")
public class Laberinto {
  private String nombre;
  
  private List<Habitacion> habitaciones;
  
  public Laberinto() {
    ArrayList<Habitacion> _arrayList = new ArrayList<Habitacion>();
    this.habitaciones = _arrayList;
  }
  
  public Laberinto(final String nombre) {
    this.nombre = nombre;
    ArrayList<Habitacion> _arrayList = new ArrayList<Habitacion>();
    this.habitaciones = _arrayList;
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
  
  public Object itemsDisponibles() {
    return null;
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
}
