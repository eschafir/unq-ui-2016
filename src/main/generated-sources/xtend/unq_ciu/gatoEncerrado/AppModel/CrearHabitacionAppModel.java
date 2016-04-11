package unq_ciu.gatoEncerrado.AppModel;

import com.google.common.base.Objects;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.UserException;
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
    boolean _xifexpression = false;
    String _nombre = this.habitacion.getNombre();
    boolean _equals = Objects.equal(_nombre, null);
    if (_equals) {
      throw new UserException("Debe ingresar un nombre para la habitación.");
    } else {
      _xifexpression = this.laberinto.agregarHabitacion(this.habitacion);
    }
    return _xifexpression;
  }
  
  public void verificar() {
    boolean _equals = Objects.equal(this.laberinto, null);
    if (_equals) {
      throw new UserException("Por favor seleccione un laberinto.");
    }
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
