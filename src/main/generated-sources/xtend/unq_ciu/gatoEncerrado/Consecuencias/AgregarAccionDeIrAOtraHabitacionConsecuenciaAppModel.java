package unq_ciu.gatoEncerrado.Consecuencias;

import com.google.common.base.Objects;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.UserException;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Item;
import unq_ciu.gatoEncerrado.Laberinto;
import unq_ciu.gatoEncerrado.acciones.Mover;
import unq_ciu.gatoEncerrado.acciones.Usar;

@Accessors
@Observable
@SuppressWarnings("all")
public class AgregarAccionDeIrAOtraHabitacionConsecuenciaAppModel {
  private Laberinto laberinto;
  
  private Habitacion habitacion;
  
  private Habitacion habitacionSeleccionada;
  
  private Item item;
  
  public AgregarAccionDeIrAOtraHabitacionConsecuenciaAppModel(final Laberinto lab, final Habitacion hab, final Item item) {
    this.laberinto = lab;
    this.habitacion = hab;
    this.item = item;
  }
  
  public boolean agregarConsecuencia() {
    boolean _xifexpression = false;
    boolean _equals = Objects.equal(this.habitacionSeleccionada, null);
    if (_equals) {
      throw new UserException("Por favor seleccione una habitación.");
    } else {
      Mover _mover = new Mover(this.habitacionSeleccionada);
      Usar _usar = new Usar(this.item, _mover);
      _xifexpression = this.habitacion.agregarAccion(_usar);
    }
    return _xifexpression;
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
  
  @Pure
  public Habitacion getHabitacionSeleccionada() {
    return this.habitacionSeleccionada;
  }
  
  public void setHabitacionSeleccionada(final Habitacion habitacionSeleccionada) {
    this.habitacionSeleccionada = habitacionSeleccionada;
  }
  
  @Pure
  public Item getItem() {
    return this.item;
  }
  
  public void setItem(final Item item) {
    this.item = item;
  }
}
