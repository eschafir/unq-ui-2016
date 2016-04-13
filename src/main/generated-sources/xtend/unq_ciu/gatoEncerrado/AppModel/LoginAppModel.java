package unq_ciu.gatoEncerrado.AppModel;

import com.google.common.base.Objects;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.UserException;
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
  
  public LoginAppModel(final Login l) {
    this.login = l;
    Usuario _usuario = new Usuario();
    this.usuarioIngresado = _usuario;
    this.claveIngresada = null;
  }
  
  public void validaUsuario() {
    boolean _and = false;
    boolean _equals = Objects.equal(this.usuarioIngresado, null);
    if (!_equals) {
      _and = false;
    } else {
      boolean _equals_1 = Objects.equal(this.claveIngresada, null);
      _and = _equals_1;
    }
    if (_and) {
      throw new UserException("Debe ingresar el usuario y la contraseña");
    } else {
      boolean _equals_2 = Objects.equal(this.usuarioIngresado, null);
      if (_equals_2) {
        throw new UserException("Debe ingresar el usuario");
      } else {
        boolean _equals_3 = Objects.equal(this.claveIngresada, null);
        if (_equals_3) {
          throw new UserException("Ingrese la clave");
        } else {
          String _username = this.usuarioIngresado.getUsername();
          this.login.validarUsuario(_username);
        }
      }
    }
  }
  
  public void validarClave() {
    String _username = this.usuarioIngresado.getUsername();
    this.login.validarClave(_username, this.claveIngresada);
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
