package unq_ciu.gatoEncerrado.Login;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.UserException;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Login.Usuario;

@Accessors
@Observable
@SuppressWarnings("all")
public class Login {
  private List<Usuario> usuarios;
  
  public Login() {
    ArrayList<Usuario> _arrayList = new ArrayList<Usuario>();
    this.usuarios = _arrayList;
  }
  
  public boolean agregarUsuario(final Usuario user) {
    return this.usuarios.add(user);
  }
  
  public void validarUsuarioYClave(final String usernameIngresado, final String clave) {
    for (final Usuario u : this.usuarios) {
      String _username = u.getUsername();
      boolean _notEquals = (!Objects.equal(_username, usernameIngresado));
      if (_notEquals) {
        throw new UserException("Usuario incorrecto o inexistente");
      } else {
        String _password = u.getPassword();
        boolean _notEquals_1 = (!Objects.equal(_password, clave));
        if (_notEquals_1) {
          throw new UserException("Clave Incorrecta");
        }
      }
    }
  }
  
  public void validarCamposVacios(final String usuarioIngresado, final String claveIngresada) {
    boolean _equals = Objects.equal(usuarioIngresado, null);
    if (_equals) {
      throw new UserException("Ingrese el usuario.");
    } else {
      boolean _equals_1 = Objects.equal(claveIngresada, null);
      if (_equals_1) {
        throw new UserException("Ingrese la contraseña.");
      }
    }
  }
  
  @Pure
  public List<Usuario> getUsuarios() {
    return this.usuarios;
  }
  
  public void setUsuarios(final List<Usuario> usuarios) {
    this.usuarios = usuarios;
  }
}
