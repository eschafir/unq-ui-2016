package unq_ciu.gatoEncerrado.AppModel;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Item;
import unq_ciu.gatoEncerrado.Laberinto;

@Accessors
@Observable
@SuppressWarnings("all")
public class AgregarAccionDeUsarElementoAppModel {
  private Laberinto laberinto;
  
  private Habitacion habitacion;
  
  private Item itemSeleccinado;
  
  public AgregarAccionDeUsarElementoAppModel(final Habitacion habitacion) {
    this.habitacion = habitacion;
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
  public Item getItemSeleccinado() {
    return this.itemSeleccinado;
  }
  
  public void setItemSeleccinado(final Item itemSeleccinado) {
    this.itemSeleccinado = itemSeleccinado;
  }
}
