package unq_ciu.gatoEncerrado;

import java.io.Serializable;
import java.util.ArrayList;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.Pure;
import unq_ciu.gatoEncerrado.Habitacion;

@Accessors
@SuppressWarnings("all")
public class Laberinto {
  private String nombre;
  
  private ArrayList<Habitacion> habitaciones;
  
  public Laberinto(final String nombre, final ArrayList<Habitacion> habitaciones) {
    this.nombre = nombre;
    this.habitaciones = habitaciones;
  }
  
  public boolean agregarHabitacion(final Habitacion h) {
    ArrayList<Habitacion> _habitaciones = this.getHabitaciones();
    return _habitaciones.add(h);
  }
  
  public Object eliminarHabitacion(final Habitacion h) {
    Object _xifexpression = null;
    ArrayList<Habitacion> _habitaciones = this.getHabitaciones();
    boolean _contains = _habitaciones.contains(h);
    if (_contains) {
      ArrayList<Habitacion> _habitaciones_1 = this.getHabitaciones();
      _xifexpression = Boolean.valueOf(_habitaciones_1.remove(h));
    } else {
      String _nombre = h.getNombre();
      String _plus = ("No se encuentra la habitacion " + _nombre);
      _xifexpression = InputOutput.<String>println(_plus);
    }
    return ((Serializable)_xifexpression);
  }
  
  @Pure
  public String getNombre() {
    return this.nombre;
  }
  
  public void setNombre(final String nombre) {
    this.nombre = nombre;
  }
  
  @Pure
  public ArrayList<Habitacion> getHabitaciones() {
    return this.habitaciones;
  }
  
  public void setHabitaciones(final ArrayList<Habitacion> habitaciones) {
    this.habitaciones = habitaciones;
  }
}
