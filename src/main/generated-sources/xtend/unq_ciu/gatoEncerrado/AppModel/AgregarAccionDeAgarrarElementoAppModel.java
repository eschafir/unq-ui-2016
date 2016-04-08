package unq_ciu.gatoEncerrado.AppModel;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Item;
import unq_ciu.gatoEncerrado.acciones.Agarrar;

@Accessors
@Observable
@SuppressWarnings("all")
public class AgregarAccionDeAgarrarElementoAppModel {
  private Habitacion habitacion;
  
  private Item item;
  
  public AgregarAccionDeAgarrarElementoAppModel(final Habitacion habitacion) {
    this.habitacion = habitacion;
    Item _item = new Item();
    this.item = _item;
  }
  
  public boolean agregarAcccionAgarrar() {
    Agarrar _agarrar = new Agarrar(this.item);
    return this.habitacion.agregarAccion(_agarrar);
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
