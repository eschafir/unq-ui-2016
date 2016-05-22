package unq_ciu.gatoEncerrado;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Item;
import unq_ciu.gatoEncerrado.Juego;

@Accessors
@Observable
@SuppressWarnings("all")
public class Accion {
  private int id;
  
  private String nombre;
  
  public Accion() {
  }
  
  public Accion(final int id, final String nombre) {
    this.id = id;
    this.nombre = nombre;
  }
  
  public void ejecutar(final Juego juego) {
  }
  
  public Item getItem() {
    return null;
  }
  
  @Pure
  public int getId() {
    return this.id;
  }
  
  public void setId(final int id) {
    this.id = id;
  }
  
  @Pure
  public String getNombre() {
    return this.nombre;
  }
  
  public void setNombre(final String nombre) {
    this.nombre = nombre;
  }
}
