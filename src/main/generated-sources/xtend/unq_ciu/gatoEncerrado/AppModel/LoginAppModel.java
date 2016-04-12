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
  
  public LoginAppModel(final Login l) {
    this.login = l;
    Usuario _usuario = new Usuario();
    this.usuario = _usuario;
  }
  
  public boolean validaUsuario() {
    boolean _xifexpression = false;
    boolean _or = false;
    String _username = this.usuario.getUsername();
    boolean _equals = Objects.equal(_username, null);
    if (_equals) {
      _or = true;
    } else {
      String _password = this.usuario.getPassword();
      boolean _equals_1 = Objects.equal(_password, null);
      _or = _equals_1;
    }
    if (_or) {
      throw new UserException("Debe ingresar un nombre de usuario");
    } else {
      String _username_1 = this.usuario.getUsername();
      String _password_1 = this.usuario.getPassword();
      _xifexpression = this.login.validarUsuario(_username_1, _password_1);
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
}
