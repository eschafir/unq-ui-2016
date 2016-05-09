package unq_ciu.gatoEncerrado.AppModel;

import com.google.common.base.Objects;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.ObservableUtils;
import org.uqbar.commons.model.UserException;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Accion;
import unq_ciu.gatoEncerrado.Habitacion;
import unq_ciu.gatoEncerrado.Juego;
import unq_ciu.gatoEncerrado.Laberinto;
import unq_ciu.gatoEncerrado.Login.Usuario;

@Accessors
@Observable
@SuppressWarnings("all")
public class GatoEncerradoAppModel {
  private Juego juego;
  
  private Usuario usuario;
  
  private Laberinto laberintoSeleccionado;
  
  private Habitacion habitacionSeleccionada;
  
  private Accion accionSeleccionada;
  
  public GatoEncerradoAppModel(final Juego juego, final Usuario usuario) {
    this.juego = juego;
    this.usuario = usuario;
  }
  
  public GatoEncerradoAppModel() {
  }
  
  public void setHabitacionSeleccionada(final Habitacion h) {
    this.habitacionSeleccionada = h;
    ObservableUtils.firePropertyChanged(this, "nombreHabitacion");
  }
  
  public void setLaberintoSeleccionado(final Laberinto l) {
    this.laberintoSeleccionado = l;
    ObservableUtils.firePropertyChanged(this, "nombreLaberinto");
  }
  
  public boolean eliminarLaberinto() {
    return this.juego.quitarLaberinto(this.laberintoSeleccionado);
  }
  
  public boolean eliminarHabitacion() {
    return this.laberintoSeleccionado.eliminarHabitacion(this.habitacionSeleccionada);
  }
  
  public boolean quitarAccion() {
    return this.habitacionSeleccionada.quitarAccion(this.accionSeleccionada);
  }
  
  public void verificar() {
    boolean _equals = Objects.equal(this.habitacionSeleccionada, null);
    if (_equals) {
      throw new UserException("Por favor seleccione una habitación.");
    }
  }
  
  public String getNombreHabitacion() {
    String _xifexpression = null;
    boolean _equals = Objects.equal(this.habitacionSeleccionada, null);
    if (_equals) {
      _xifexpression = "";
    } else {
      _xifexpression = this.habitacionSeleccionada.getNombre();
    }
    return _xifexpression;
  }
  
  public void setNombreHabitacion(final String nuevoNombre) {
    this.laberintoSeleccionado.validarNombre(nuevoNombre);
    this.habitacionSeleccionada.setNombre(nuevoNombre);
  }
  
  public String getNombreLaberinto() {
    return this.laberintoSeleccionado.getNombre();
  }
  
  public void setNombreLaberinto(final String nuevoNombre) {
    this.juego.validarNombre(nuevoNombre);
    this.laberintoSeleccionado.setNombre(nuevoNombre);
  }
  
  @Pure
  public Juego getJuego() {
    return this.juego;
  }
  
  public void setJuego(final Juego juego) {
    this.juego = juego;
  }
  
  @Pure
  public Usuario getUsuario() {
    return this.usuario;
  }
  
  public void setUsuario(final Usuario usuario) {
    this.usuario = usuario;
  }
  
  @Pure
  public Laberinto getLaberintoSeleccionado() {
    return this.laberintoSeleccionado;
  }
  
  @Pure
  public Habitacion getHabitacionSeleccionada() {
    return this.habitacionSeleccionada;
  }
  
  @Pure
  public Accion getAccionSeleccionada() {
    return this.accionSeleccionada;
  }
  
  public void setAccionSeleccionada(final Accion accionSeleccionada) {
    this.accionSeleccionada = accionSeleccionada;
  }
}
