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
  
  private Usuario usuario;
  
  private String claveIngresada;
  
  public LoginAppModel(final Login l) {
    this.login = l;
    Usuario _usuario = new Usuario();
    this.usuario = _usuario;
    this.claveIngresada = "";
  }
  
  public Object validaUsuario() {
    Object _xifexpression = null;
    String _password = this.usuario.getPassword();
    boolean _notEquals = (!Objects.equal(_password, this.claveIngresada));
    if (_notEquals) {
      throw new UserException("Password incorrecta");
    } else {
      String _username = this.usuario.getUsername();
      String _password_1 = this.usuario.getPassword();
      _xifexpression = this.login.validarUsuario(_username, _password_1);
    }
    return _xifexpression;
  }
  
  @Pure
  public Login getLogin() {
    return this.login;
  }
  
  public void setLogin(final Login login) {
    this.login = login;
  }
  
  @Pure
  public Usuario getUsuario() {
    return this.usuario;
  }
  
  public void setUsuario(final Usuario usuario) {
    this.usuario = usuario;
  }
  
  @Pure
  public String getClaveIngresada() {
    return this.claveIngresada;
  }
  
  public void setClaveIngresada(final String claveIngresada) {
    this.claveIngresada = claveIngresada;
  }
}
