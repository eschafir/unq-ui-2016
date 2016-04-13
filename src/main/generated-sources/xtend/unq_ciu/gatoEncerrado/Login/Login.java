package unq_ciu.gatoEncerrado.Login;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
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
  
  public void validarUsuario(final String usernameIngresado) {
    final Function1<Usuario, Boolean> _function = new Function1<Usuario, Boolean>() {
      public Boolean apply(final Usuario it) {
        String _username = it.getUsername();
        return Boolean.valueOf(_username.equals(usernameIngresado));
      }
    };
    boolean _exists = IterableExtensions.<Usuario>exists(this.usuarios, _function);
    boolean _not = (!_exists);
    if (_not) {
      throw new UserException("Usuario inexistente");
    }
  }
  
  public void validarClave(final String usernameIngresado, final String clave) {
    for (final Usuario u : this.usuarios) {
      String _username = u.getUsername();
      boolean _equals = Objects.equal(_username, usernameIngresado);
      if (_equals) {
        String _password = u.getPassword();
        boolean _notEquals = (!Objects.equal(_password, clave));
        if (_notEquals) {
          throw new UserException("Clave Incorrecta");
        }
      }
    }
  }
  
  public boolean agregarUsuario(final Usuario user) {
    return this.usuarios.add(user);
  }
  
  @Pure
  public List<Usuario> getUsuarios() {
    return this.usuarios;
  }
  
  public void setUsuarios(final List<Usuario> usuarios) {
    this.usuarios = usuarios;
  }
}
