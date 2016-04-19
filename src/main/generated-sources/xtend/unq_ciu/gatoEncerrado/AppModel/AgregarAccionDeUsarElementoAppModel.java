package unq_ciu.gatoEncerrado.AppModel;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.UserException;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Accion;
import unq_ciu.gatoEncerrado.AppModel.AgregarAccionDeAccionAppModel;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Item;
import unq_ciu.gatoEncerrado.Laberinto;

@Accessors
@Observable
@SuppressWarnings("all")
public class AgregarAccionDeUsarElementoAppModel extends AgregarAccionDeAccionAppModel {
  private Item itemSeleccionado;
  
  private Accion accion;
  
  public AgregarAccionDeUsarElementoAppModel(final Laberinto lab, final Habitacion habitacion, final Accion acc) {
    this.setLaberinto(lab);
    this.setHabitacion(habitacion);
    this.accion = acc;
  }
  
  @Override
  public Object agregarAccion() {
    return null;
  }
  
  public void validarItem() {
    boolean _equals = Objects.equal(this.itemSeleccionado, null);
    if (_equals) {
      throw new UserException("Por favor seleccione un item.");
    }
  }
  
  public List<Item> getItemsDisponibles() {
    final ArrayList<Item> lista = CollectionLiterals.<Item>newArrayList();
    Laberinto _laberinto = this.getLaberinto();
    List<Item> _itemsDisponibles = _laberinto.getItemsDisponibles();
    for (final Item i : _itemsDisponibles) {
      String _nombre = i.getNombre();
      boolean _notEquals = (!Objects.equal(_nombre, null));
      if (_notEquals) {
        lista.add(i);
      }
    }
    this.quitarDuplicados(lista);
    return lista;
  }
  
  public ArrayList<Item> quitarDuplicados(final ArrayList<Item> lista) {
    final HashSet<Item> hs = new HashSet<Item>();
    hs.addAll(lista);
    lista.clear();
    lista.addAll(hs);
    return lista;
  }
  
  @Pure
  public Item getItemSeleccionado() {
    return this.itemSeleccionado;
  }
  
  public void setItemSeleccionado(final Item itemSeleccionado) {
    this.itemSeleccionado = itemSeleccionado;
  }
  
  @Pure
  public Accion getAccion() {
    return this.accion;
  }
  
  public void setAccion(final Accion accion) {
    this.accion = accion;
  }
}
