package unq_ciu.gatoEncerrado.AppModel;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Item;

@Accessors
@Observable
@SuppressWarnings("all")
public class AgregarAccionDeAgarrarElementoAppModel {
  private Habitacion habitacion;
  
  private Item item;
  
  /**
   * Ver si lleva contructor
   */
  public AgregarAccionDeAgarrarElementoAppModel(final Habitacion habitacion) {
    this.habitacion = habitacion;
  }
  
  @Pure
  public Habitacion getHabitacion() {
    return this.habitacion;
  }
  
  public void setHabitacion(final Habitacion habitacion) {
    this.habitacion = habitacion;
  }
  
  @Pure
  public Item getItem() {
    return this.item;
  }
  
  public void setItem(final Item item) {
    this.item = item;
  }
}
