package unq_ciu.gatoEncerrado;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Juego;

@Accessors
@Observable
@SuppressWarnings("all")
public abstract class Accion {
  private String nombre;
  
  public void ejecutar(final Juego juego) {
  }
  
  @Pure
  public String getNombre() {
    return this.nombre;
  }
  
  public void setNombre(final String nombre) {
    this.nombre = nombre;
  }
}
