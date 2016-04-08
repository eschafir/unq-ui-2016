package unq_ciu.gatoEncerrado;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
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
  }
  
  public Laberinto(final String nombre) {
    this.nombre = nombre;
    ArrayList<Habitacion> _arrayList = new ArrayList<Habitacion>();
    this.habitaciones = _arrayList;
  }
  
  public boolean agregarHabitacion(final Habitacion h) {
    return this.habitaciones.add(h);
  }
  
  public Object eliminarHabitacion(final Habitacion h) {
    Object _xifexpression = null;
    List<Habitacion> _habitaciones = this.getHabitaciones();
    boolean _contains = _habitaciones.contains(h);
    if (_contains) {
      List<Habitacion> _habitaciones_1 = this.getHabitaciones();
      _xifexpression = Boolean.valueOf(_habitaciones_1.remove(h));
    } else {
      String _nombre = h.getNombre();
      String _plus = ("No se encuentra la habitacion " + _nombre);
      _xifexpression = InputOutput.<String>println(_plus);
    }
    return ((Serializable)_xifexpression);
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
