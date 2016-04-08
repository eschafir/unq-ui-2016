package unq_ciu.gatoEncerrado.AppModel;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Laberinto;

@Accessors
@Observable
@SuppressWarnings("all")
public class CrearHabitacionAppModel {
  private Laberinto laberinto;
  
  private Habitacion habitacion;
  
  public CrearHabitacionAppModel(final Laberinto laberinto) {
    this.laberinto = laberinto;
    Habitacion _habitacion = new Habitacion();
    this.habitacion = _habitacion;
  }
  
  public boolean agregarHabitacion() {
    return this.laberinto.agregarHabitacion(this.habitacion);
  }
  
  @Pure
  public Laberinto getLaberinto() {
    return this.laberinto;
  }
  
  public void setLaberinto(final Laberinto laberinto) {
    this.laberinto = laberinto;
  }
  
  @Pure
  public Habitacion getHabitacion() {
    return this.habitacion;
  }
  
  public void setHabitacion(final Habitacion habitacion) {
    this.habitacion = habitacion;
  }
}
