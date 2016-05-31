package unq_ciu.gatoEncerrado.acciones;

import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Accion;
import unq_ciu.gatoEncerrado.Excepciones.NoEstaDisponibleEstaAccionException;
import unq_ciu.gatoEncerrado.Excepciones.NoSePuedeAgregarItemAlInventarioException;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Item;
import unq_ciu.gatoEncerrado.Jugador;
import unq_ciu.gatoEncerrado.acciones.ResultadoAccion;

@Accessors
@Observable
@SuppressWarnings("all")
public class Agarrar extends Accion {
  private String nombre;
  
  private Item item;
  
  public Agarrar(final Item item) {
    this.item = item;
    String _nombre = item.getNombre();
    String _plus = ("Agarrar " + _nombre);
    this.nombre = _plus;
  }
  
  public Agarrar(final int id, final Item item) {
    this.setId(id);
    String _nombre = item.getNombre();
    String _plus = ("Agarrar " + _nombre);
    this.nombre = _plus;
    this.item = item;
  }
  
  public Object ejecutar(final Habitacion h, final Jugador j) {
    try {
      List<Accion> _acciones = h.getAcciones();
      boolean _contains = _acciones.contains(this);
      if (_contains) {
        boolean _puedeAgregar = j.puedeAgregar();
        if (_puedeAgregar) {
          j.agregarAlInventario(this.item);
          h.quitarAccion(this);
        } else {
          throw new NoSePuedeAgregarItemAlInventarioException();
        }
      } else {
        throw new NoEstaDisponibleEstaAccionException();
      }
      List<Item> _inventario = j.getInventario();
      return new ResultadoAccion(_inventario, h, Boolean.valueOf(false));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Object execute() {
    return this;
  }
  
  @Pure
  public String getNombre() {
    return this.nombre;
  }
  
  public void setNombre(final String nombre) {
    this.nombre = nombre;
  }
  
  @Pure
  public Item getItem() {
    return this.item;
  }
  
  public void setItem(final Item item) {
    this.item = item;
  }
}
