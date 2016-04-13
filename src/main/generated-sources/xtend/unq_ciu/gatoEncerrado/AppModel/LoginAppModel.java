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
  
  public Object validaUsuario() {
    Object _xifexpression = null;
    boolean _and = false;
    String _username = this.usuario.getUsername();
    boolean _equals = Objects.equal(_username, null);
    if (!_equals) {
      _and = false;
    } else {
      String _password = this.usuario.getPassword();
      boolean _equals_1 = Objects.equal(_password, null);
      _and = _equals_1;
    }
    if (_and) {
      throw new UserException("Debe ingresar el usuario y la contraseña");
    } else {
      Object _xifexpression_1 = null;
      boolean _and_1 = false;
      String _username_1 = this.usuario.getUsername();
      boolean _equals_2 = Objects.equal(_username_1, null);
      if (!_equals_2) {
        _and_1 = false;
      } else {
        String _password_1 = this.usuario.getPassword();
        boolean _notEquals = (!Objects.equal(_password_1, null));
        _and_1 = _notEquals;
      }
      if (_and_1) {
        throw new UserException("Debe ingresar el usuario");
      } else {
        Object _xifexpression_2 = null;
        boolean _and_2 = false;
        String _username_2 = this.usuario.getUsername();
        boolean _notEquals_1 = (!Objects.equal(_username_2, null));
        if (!_notEquals_1) {
          _and_2 = false;
        } else {
          String _password_2 = this.usuario.getPassword();
          boolean _equals_3 = Objects.equal(_password_2, null);
          _and_2 = _equals_3;
        }
        if (_and_2) {
          throw new UserException("Debe ingresar el password");
        } else {
          String _username_3 = this.usuario.getUsername();
          String _password_3 = this.usuario.getPassword();
          _xifexpression_2 = this.login.validarUsuario(_username_3, _password_3);
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
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
