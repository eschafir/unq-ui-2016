package unq_ciu.gatoEncerrado.Consecuencias;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.UserException;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Accion;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Item;
import unq_ciu.gatoEncerrado.Laberinto;
import unq_ciu.gatoEncerrado.acciones.Usar;

@Accessors
@Observable
@SuppressWarnings("all")
public class AgregarAccionDeUsarUnElementoConsecuenciaAppModel {
  private Laberinto laberinto;
  
  private Habitacion habitacion;
  
  private Accion accionConsecuencia;
  
  private Item itemSeleccionado;
  
  private Item itemUtilizado;
  
  public AgregarAccionDeUsarUnElementoConsecuenciaAppModel(final Habitacion habitacion, final Item item, final Laberinto lbo) {
    this.habitacion = habitacion;
    this.itemUtilizado = item;
    this.laberinto = lbo;
  }
  
  public boolean agregarAccionUsar() {
    boolean _xifexpression = false;
    boolean _equals = Objects.equal(this.itemSeleccionado, null);
    if (_equals) {
      throw new UserException("Por favor ingrese un item .");
    } else {
      Accion _accion = new Accion();
      Usar _usar = new Usar(this.itemSeleccionado, _accion);
      Usar _usar_1 = new Usar(this.itemUtilizado, _usar);
      _xifexpression = this.habitacion.agregarAccion(_usar_1);
    }
    return _xifexpression;
  }
  
  public List<Item> getItemsDisponibles() {
    final ArrayList<Item> lista = new ArrayList<Item>();
    List<Item> _itemsDisponibles = this.laberinto.getItemsDisponibles();
    for (final Item i : _itemsDisponibles) {
      String _nombre = i.getNombre();
      boolean _notEquals = (!Objects.equal(_nombre, null));
      if (_notEquals) {
        lista.add(i);
      }
    }
    this.quitarDuplicadosYElementoUtilizado(lista);
    return lista;
  }
  
  public boolean quitarDuplicadosYElementoUtilizado(final ArrayList<Item> items) {
    boolean _xblockexpression = false;
    {
      final HashSet<Item> hs = new HashSet<Item>();
      hs.addAll(items);
      items.clear();
      items.addAll(hs);
      _xblockexpression = items.remove(this.itemUtilizado);
    }
    return _xblockexpression;
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
  public Accion getAccionConsecuencia() {
    return this.accionConsecuencia;
  }
  
  public void setAccionConsecuencia(final Accion accionConsecuencia) {
    this.accionConsecuencia = accionConsecuencia;
  }
  
  @Pure
  public Item getItemSeleccionado() {
    return this.itemSeleccionado;
  }
  
  public void setItemSeleccionado(final Item itemSeleccionado) {
    this.itemSeleccionado = itemSeleccionado;
  }
  
  @Pure
  public Item getItemUtilizado() {
    return this.itemUtilizado;
  }
  
  public void setItemUtilizado(final Item itemUtilizado) {
    this.itemUtilizado = itemUtilizado;
  }
}
