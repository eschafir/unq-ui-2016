package unq_ciu.gatoEncerrado.AppModel;

import java.util.Arrays;
import java.util.List;
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
  
  private Item itemSeleccionado;
  
  /**
   * Ver si lleva contructor
   */
  public AgregarAccionDeAgarrarElementoAppModel(final Habitacion habitacion) {
    this.habitacion = habitacion;
  }
  
  public List<Item> getItemsPosibles() {
    Item[] _values = Item.values();
    return Arrays.<Item>asList(_values);
  }
  
  @Pure
  public Habitacion getHabitacion() {
    return this.habitacion;
  }
  
  public void setHabitacion(final Habitacion habitacion) {
    this.habitacion = habitacion;
  }
  
  @Pure
  public Item getItemSeleccionado() {
    return this.itemSeleccionado;
  }
  
  public void setItemSeleccionado(final Item itemSeleccionado) {
    this.itemSeleccionado = itemSeleccionado;
  }
}
