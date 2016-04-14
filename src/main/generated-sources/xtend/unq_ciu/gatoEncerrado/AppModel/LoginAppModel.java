package unq_ciu.gatoEncerrado.AppModel;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Login.Login;
import unq_ciu.gatoEncerrado.Login.Usuario;

@Accessors
@Observable
@SuppressWarnings("all")
public class LoginAppModel {
  private Login login;
  
  private Usuario usuarioIngresado;
  
  private String claveIngresada;
  
  public LoginAppModel() {
  }
  
  public LoginAppModel(final Login l) {
    this.login = l;
    Usuario _usuario = new Usuario();
    this.usuarioIngresado = _usuario;
    this.claveIngresada = null;
  }
  
  /**
   * Validación de todos los campos dentro de la pantalla de login.
   */
  public void validarUsuarioYClave() {
    String _username = this.usuarioIngresado.getUsername();
    this.login.validarCamposVacios(_username, this.claveIngresada);
    String _username_1 = this.usuarioIngresado.getUsername();
    this.login.validarUsuario(_username_1);
    this.login.validarClave(this.claveIngresada);
  }
  
  @Pure
  public Login getLogin() {
    return this.login;
  }
  
  public void setLogin(final Login login) {
    this.login = login;
  }
  
  @Pure
  public Usuario getUsuarioIngresado() {
    return this.usuarioIngresado;
  }
  
  public void setUsuarioIngresado(final Usuario usuarioIngresado) {
    this.usuarioIngresado = usuarioIngresado;
  }
  
  @Pure
  public String getClaveIngresada() {
    return this.claveIngresada;
  }
  
  public void setClaveIngresada(final String claveIngresada) {
    this.claveIngresada = claveIngresada;
  }
}
