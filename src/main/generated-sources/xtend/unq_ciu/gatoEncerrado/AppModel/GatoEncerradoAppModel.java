package unq_ciu.gatoEncerrado.AppModel;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Accion;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Juego;
import unq_ciu.gatoEncerrado.Laberinto;

@Accessors
@Observable
@SuppressWarnings("all")
public class GatoEncerradoAppModel {
  private Juego juego;
  
  private Laberinto laberintoSeleccionado;
  
  private Habitacion habitacionSeleccionada;
  
  private Accion accionSeleccionada;
  
  public GatoEncerradoAppModel(final Juego juego) {
    this.juego = juego;
  }
  
  public GatoEncerradoAppModel() {
  }
  
  public boolean eliminarLaberinto() {
    return this.juego.quitarLaberinto(this.laberintoSeleccionado);
  }
  
  public Object eliminarHabitacion() {
    return this.laberintoSeleccionado.eliminarHabitacion(this.habitacionSeleccionada);
  }
  
  public boolean quitarAccion() {
    return this.habitacionSeleccionada.quitarAccion(this.accionSeleccionada);
  }
  
  @Pure
  public Juego getJuego() {
    return this.juego;
  }
  
  public void setJuego(final Juego juego) {
    this.juego = juego;
  }
  
  @Pure
  public Laberinto getLaberintoSeleccionado() {
    return this.laberintoSeleccionado;
  }
  
  public void setLaberintoSeleccionado(final Laberinto laberintoSeleccionado) {
    this.laberintoSeleccionado = laberintoSeleccionado;
  }
  
  @Pure
  public Habitacion getHabitacionSeleccionada() {
    return this.habitacionSeleccionada;
  }
  
  public void setHabitacionSeleccionada(final Habitacion habitacionSeleccionada) {
    this.habitacionSeleccionada = habitacionSeleccionada;
  }
  
  @Pure
  public Accion getAccionSeleccionada() {
    return this.accionSeleccionada;
  }
  
  public void setAccionSeleccionada(final Accion accionSeleccionada) {
    this.accionSeleccionada = accionSeleccionada;
  }
}
