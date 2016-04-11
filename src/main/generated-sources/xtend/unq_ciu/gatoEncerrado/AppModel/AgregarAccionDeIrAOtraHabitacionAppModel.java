package unq_ciu.gatoEncerrado.AppModel;

import com.google.common.base.Objects;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.UserException;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Laberinto;
import unq_ciu.gatoEncerrado.acciones.Mover;

@Accessors
@Observable
@SuppressWarnings("all")
public class AgregarAccionDeIrAOtraHabitacionAppModel {
  private Habitacion habitacion;
  
  private Habitacion habitacionSeleccionada;
  
  private Laberinto laberinto;
  
  public AgregarAccionDeIrAOtraHabitacionAppModel(final Laberinto laberinto, final Habitacion habitacion) {
    this.laberinto = laberinto;
    this.habitacion = habitacion;
  }
  
  public boolean agregarAccion() {
    boolean _xifexpression = false;
    boolean _equals = Objects.equal(this.habitacionSeleccionada, null);
    if (_equals) {
      throw new UserException("Por favor seleccione una habitación.");
    } else {
      Mover _mover = new Mover(this.habitacionSeleccionada);
      _xifexpression = this.habitacion.agregarAccion(_mover);
    }
    return _xifexpression;
  }
  
  @Pure
  public Habitacion getHabitacion() {
    return this.habitacion;
  }
  
  public void setHabitacion(final Habitacion habitacion) {
    this.habitacion = habitacion;
  }
  
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
