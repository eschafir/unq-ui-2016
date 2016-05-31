package unq_ciu.gatoEncerrado.acciones;

import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.UserException;
import unq_ciu.gatoEncerrado.Accion;
import unq_ciu.gatoEncerrado.Excepciones.NoHayItemNecesarioException;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Item;
import unq_ciu.gatoEncerrado.Jugador;
import unq_ciu.gatoEncerrado.acciones.ResultadoAccion;

@Accessors
@SuppressWarnings("all")
public class Usar extends Accion {
  private Item item;
  
  private Accion accionConsecuencia;
  
  public Usar(final int id, final Item i, final Accion acc) {
    super(id, ("Usar " + i.getNombre()));
    this.item = i;
    this.accionConsecuencia = acc;
  }
  
  public Item getItem() {
    return this.accionConsecuencia.getItem();
  }
  
  public Object ejecutar(final Habitacion h, final Jugador j) {
    try {
      List<Accion> _acciones = h.getAcciones();
      boolean _contains = _acciones.contains(this);
      if (_contains) {
        boolean _tiene = j.tiene(this.item);
        if (_tiene) {
          h.quitarAccion(this);
          h.agregarAccion(this.accionConsecuencia);
          j.quitarDelInventario(this.item);
        } else {
          throw new NoHayItemNecesarioException();
        }
      } else {
        throw new UserException("No existe esta accion en la habitacion");
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
  
  public void setItem(final Item item) {
    this.item = item;
  }
  
  @Pure
  public Accion getAccionConsecuencia() {
    return this.accionConsecuencia;
  }
  
  public void setAccionConsecuencia(final Accion accionConsecuencia) {
    this.accionConsecuencia = accionConsecuencia;
  }
}
