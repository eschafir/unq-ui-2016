package unq_ciu.gatoEncerrado.AppModel;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.UserException;
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
  
  private Item itemSeleccionado;
  
  public AgregarAccionDeUsarElementoAppModel(final Laberinto lab, final Habitacion habitacion) {
    this.laberinto = lab;
    this.habitacion = habitacion;
  }
  
  public void validarItem() {
    boolean _equals = Objects.equal(this.itemSeleccionado, null);
    if (_equals) {
      throw new UserException("Por favor seleccione un item.");
    }
  }
  
  public List<Item> getItemsDisponibles() {
    final ArrayList<Item> lista = CollectionLiterals.<Item>newArrayList();
    List<Item> _itemsDisponibles = this.laberinto.getItemsDisponibles();
    for (final Item i : _itemsDisponibles) {
      String _nombre = i.getNombre();
      boolean _notEquals = (!Objects.equal(_nombre, null));
      if (_notEquals) {
        lista.add(i);
      }
    }
    return lista;
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
  public Item getItemSeleccionado() {
    return this.itemSeleccionado;
  }
  
  public void setItemSeleccionado(final Item itemSeleccionado) {
    this.itemSeleccionado = itemSeleccionado;
  }
}
