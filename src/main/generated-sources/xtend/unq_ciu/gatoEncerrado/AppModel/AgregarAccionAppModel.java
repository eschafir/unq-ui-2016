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
public class AgregarAccionAppModel {
  private Habitacion habitacionActual;
  
  public List<Item> getItemsPosibles() {
    Item[] _values = Item.values();
    return Arrays.<Item>asList(_values);
  }
  
  @Pure
  public Habitacion getHabitacionActual() {
    return this.habitacionActual;
  }
  
  public void setHabitacionActual(final Habitacion habitacionActual) {
    this.habitacionActual = habitacionActual;
  }
}
