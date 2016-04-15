package unq_ciu.gatoEncerrado.Consecuencias;

import com.google.common.base.Objects;
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
  
  public AgregarAccionDeUsarUnElementoConsecuenciaAppModel(final Habitacion habitacion, final Item item, final Accion acc, final Laberinto lbo) {
    this.habitacion = habitacion;
    this.itemUtilizado = item;
    this.laberinto = lbo;
    this.accionConsecuencia = acc;
  }
  
  public boolean agregarAccionUsar() {
    boolean _xifexpression = false;
    boolean _equals = Objects.equal(this.itemSeleccionado, null);
    if (_equals) {
      throw new UserException("Por favor ingrese un item .");
    } else {
      Usar _usar = new Usar(this.itemUtilizado, this.accionConsecuencia);
      _xifexpression = this.habitacion.agregarAccion(_usar);
    }
    return _xifexpression;
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
