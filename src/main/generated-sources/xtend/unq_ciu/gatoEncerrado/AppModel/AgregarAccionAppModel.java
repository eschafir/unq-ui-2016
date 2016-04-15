package unq_ciu.gatoEncerrado.AppModel;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Accion;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Laberinto;

@Accessors
@Observable
@SuppressWarnings("all")
public class AgregarAccionAppModel {
  private Habitacion habitacionActual;
  
  private Laberinto laberinto;
  
  private Accion accion;
  
  public AgregarAccionAppModel(final Laberinto laberinto, final Habitacion habitacion, final Accion acc) {
    this.laberinto = laberinto;
    this.habitacionActual = habitacion;
    this.accion = acc;
  }
  
  @Pure
  public Habitacion getHabitacionActual() {
    return this.habitacionActual;
  }
  
  public void setHabitacionActual(final Habitacion habitacionActual) {
    this.habitacionActual = habitacionActual;
  }
  
  @Pure
  public Laberinto getLaberinto() {
    return this.laberinto;
  }
  
  public void setLaberinto(final Laberinto laberinto) {
    this.laberinto = laberinto;
  }
  
  @Pure
  public Accion getAccion() {
    return this.accion;
  }
  
  public void setAccion(final Accion accion) {
    this.accion = accion;
  }
}
