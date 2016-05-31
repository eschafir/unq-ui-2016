package unq_ciu.gatoEncerrado.acciones;

import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Item;

@Accessors
@SuppressWarnings("all")
public class ResultadoAccion {
  private List<Item> inventario;
  
  private Habitacion habitacion;
  
  private Boolean ganaste;
  
  public ResultadoAccion(final List<Item> inventario, final Habitacion habitacion, final Boolean ganaste) {
    this.inventario = inventario;
    this.habitacion = habitacion;
    this.ganaste = ganaste;
  }
  
  @Pure
  public List<Item> getInventario() {
    return this.inventario;
  }
  
  public void setInventario(final List<Item> inventario) {
    this.inventario = inventario;
  }
  
  @Pure
  public Habitacion getHabitacion() {
    return this.habitacion;
  }
  
  public void setHabitacion(final Habitacion habitacion) {
    this.habitacion = habitacion;
  }
  
  @Pure
  public Boolean getGanaste() {
    return this.ganaste;
  }
  
  public void setGanaste(final Boolean ganaste) {
    this.ganaste = ganaste;
  }
}
