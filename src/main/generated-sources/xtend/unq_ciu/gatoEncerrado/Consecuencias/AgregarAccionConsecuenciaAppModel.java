package unq_ciu.gatoEncerrado.Consecuencias;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Accion;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Item;
import unq_ciu.gatoEncerrado.Laberinto;

@Accessors
@Observable
@SuppressWarnings("all")
public class AgregarAccionConsecuenciaAppModel {
  private Laberinto laberinto;
  
  private Habitacion habitacion;
  
  private Item item;
  
  private Accion accion;
  
  public AgregarAccionConsecuenciaAppModel(final Laberinto l, final Habitacion h, final Item i, final Accion acc) {
    this.laberinto = l;
    this.habitacion = h;
    this.item = i;
    this.accion = acc;
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
  public Item getItem() {
    return this.item;
  }
  
  public void setItem(final Item item) {
    this.item = item;
  }
  
  @Pure
  public Accion getAccion() {
    return this.accion;
  }
  
  public void setAccion(final Accion accion) {
    this.accion = accion;
  }
}
