package unq_ciu.gatoEncerrado;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Excepciones.YaHayUnaHabitacionInicialEnElLaberinto;
import unq_ciu.gatoEncerrado.Habitacion;

@Accessors
@Observable
@SuppressWarnings("all")
public class Laberinto {
  private String nombre;
  
  private List<Habitacion> habitaciones;
  
  private Boolean tieneHabInicial;
  
  public Laberinto() {
    ArrayList<Habitacion> _arrayList = new ArrayList<Habitacion>();
    this.habitaciones = _arrayList;
    this.tieneHabInicial = Boolean.valueOf(false);
  }
  
  public Laberinto(final String nombre) {
    this.nombre = nombre;
    ArrayList<Habitacion> _arrayList = new ArrayList<Habitacion>();
    this.habitaciones = _arrayList;
    this.tieneHabInicial = Boolean.valueOf(false);
  }
  
  public Boolean agregarHabitacion(final Habitacion h) {
    try {
      Boolean _xifexpression = null;
      boolean _isEsInicial = h.isEsInicial();
      if (_isEsInicial) {
        Boolean _xifexpression_1 = null;
        Boolean _tieneHabInicial = this.getTieneHabInicial();
        if ((_tieneHabInicial).booleanValue()) {
          throw new YaHayUnaHabitacionInicialEnElLaberinto();
        } else {
          Boolean _xblockexpression = null;
          {
            List<Habitacion> _habitaciones = this.getHabitaciones();
            _habitaciones.add(h);
            _xblockexpression = this.tieneHabInicial = Boolean.valueOf(true);
          }
          _xifexpression_1 = _xblockexpression;
        }
        _xifexpression = _xifexpression_1;
      } else {
        List<Habitacion> _habitaciones = this.getHabitaciones();
        _xifexpression = Boolean.valueOf(_habitaciones.add(h));
      }
      return _xifexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Boolean eliminarHabitacion(final Habitacion h) {
    Boolean _xifexpression = null;
    List<Habitacion> _habitaciones = this.getHabitaciones();
    boolean _contains = _habitaciones.contains(h);
    if (_contains) {
      Boolean _xifexpression_1 = null;
      boolean _isEsInicial = h.isEsInicial();
      if (_isEsInicial) {
        Boolean _xblockexpression = null;
        {
          List<Habitacion> _habitaciones_1 = this.getHabitaciones();
          _habitaciones_1.remove(h);
          _xblockexpression = this.tieneHabInicial = Boolean.valueOf(false);
        }
        _xifexpression_1 = _xblockexpression;
      } else {
        List<Habitacion> _habitaciones_1 = this.getHabitaciones();
        _xifexpression_1 = Boolean.valueOf(_habitaciones_1.remove(h));
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
  
  @Pure
  public Boolean getTieneHabInicial() {
    return this.tieneHabInicial;
  }
  
  public void setTieneHabInicial(final Boolean tieneHabInicial) {
    this.tieneHabInicial = tieneHabInicial;
  }
}
