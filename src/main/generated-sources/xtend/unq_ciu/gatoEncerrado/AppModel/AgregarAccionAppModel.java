package unq_ciu.gatoEncerrado.AppModel;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Habitacion;

@Accessors
@Observable
@SuppressWarnings("all")
public class AgregarAccionAppModel {
  private Habitacion habitacionActual;
  
  public AgregarAccionAppModel(final Habitacion habitacion) {
    this.habitacionActual = habitacion;
  }
  
  @Pure
  public Habitacion getHabitacionActual() {
    return this.habitacionActual;
  }
  
  public void setHabitacionActual(final Habitacion habitacionActual) {
    this.habitacionActual = habitacionActual;
  }
}
