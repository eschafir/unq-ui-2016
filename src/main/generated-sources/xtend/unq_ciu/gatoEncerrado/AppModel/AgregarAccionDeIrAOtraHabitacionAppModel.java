package unq_ciu.gatoEncerrado.AppModel;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Laberinto;

@Accessors
@SuppressWarnings("all")
public class AgregarAccionDeIrAOtraHabitacionAppModel {
  private Habitacion habitacionSeleccionada;
  
  private Laberinto laberinto;
  
  @Pure
  public Habitacion getHabitacionSeleccionada() {
    return this.habitacionSeleccionada;
  }
  
  public void setHabitacionSeleccionada(final Habitacion habitacionSeleccionada) {
    this.habitacionSeleccionada = habitacionSeleccionada;
  }
  
  @Pure
  public Laberinto getLaberinto() {
    return this.laberinto;
  }
  
  public void setLaberinto(final Laberinto laberinto) {
    this.laberinto = laberinto;
  }
}
