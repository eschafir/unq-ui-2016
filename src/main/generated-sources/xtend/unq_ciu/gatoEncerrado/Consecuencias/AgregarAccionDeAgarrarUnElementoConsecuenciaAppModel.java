package unq_ciu.gatoEncerrado.Consecuencias;

import com.google.common.base.Objects;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.UserException;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Item;
import unq_ciu.gatoEncerrado.acciones.Agarrar;
import unq_ciu.gatoEncerrado.acciones.Usar;

@Accessors
@Observable
@SuppressWarnings("all")
public class AgregarAccionDeAgarrarUnElementoConsecuenciaAppModel {
  private Habitacion habitacion;
  
  private Item itemDisponibleComoConsecuencia;
  
  private Item itemUtilizado;
  
  public AgregarAccionDeAgarrarUnElementoConsecuenciaAppModel(final Habitacion habitacion, final Item itemUtilizado) {
    this.habitacion = habitacion;
    this.itemUtilizado = itemUtilizado;
    Item _item = new Item();
    this.itemDisponibleComoConsecuencia = _item;
  }
  
  public boolean agregarAccionUsar() {
    boolean _xifexpression = false;
    String _nombre = this.itemDisponibleComoConsecuencia.getNombre();
    boolean _equals = Objects.equal(_nombre, null);
    if (_equals) {
      throw new UserException("Por favor ingrese un nombre para el elemento.");
    } else {
      Agarrar _agarrar = new Agarrar(this.itemDisponibleComoConsecuencia);
      Usar _usar = new Usar(this.itemUtilizado, _agarrar);
      _xifexpression = this.habitacion.agregarAccion(_usar);
    }
    return _xifexpression;
  }
  
  @Pure
  public Habitacion getHabitacion() {
    return this.habitacion;
  }
  
  public void setHabitacion(final Habitacion habitacion) {
    this.habitacion = habitacion;
  }
  
  @Pure
  public Item getItemDisponibleComoConsecuencia() {
    return this.itemDisponibleComoConsecuencia;
  }
  
  public void setItemDisponibleComoConsecuencia(final Item itemDisponibleComoConsecuencia) {
    this.itemDisponibleComoConsecuencia = itemDisponibleComoConsecuencia;
  }
  
  @Pure
  public Item getItemUtilizado() {
    return this.itemUtilizado;
  }
  
  public void setItemUtilizado(final Item itemUtilizado) {
    this.itemUtilizado = itemUtilizado;
  }
}
