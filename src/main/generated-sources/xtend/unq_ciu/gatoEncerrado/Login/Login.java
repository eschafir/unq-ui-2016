package unq_ciu.gatoEncerrado.Login;

import java.util.ArrayList;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
import unq_ciu.gatoEncerrado.Login.Usuario;

@Accessors
@Observable
@SuppressWarnings("all")
public class Login {
  private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
  
  public Login() {
  }
  
  public boolean validarUsuario(final String usernameIngresado, final String passwordIngresado) {
    final Function1<Usuario, Boolean> _function = new Function1<Usuario, Boolean>() {
      public Boolean apply(final Usuario it) {
        boolean _and = false;
        String _username = it.getUsername();
        boolean _equals = _username.equals(usernameIngresado);
        if (!_equals) {
          _and = false;
        } else {
          String _password = it.getPassword();
          boolean _equals_1 = _password.equals(passwordIngresado);
          _and = _equals_1;
        }
        return Boolean.valueOf(_and);
      }
    };
    return IterableExtensions.<Usuario>exists(this.usuarios, _function);
  }
  
  @Pure
  public ArrayList<Usuario> getUsuarios() {
    return this.usuarios;
  }
  
  public void setUsuarios(final ArrayList<Usuario> usuarios) {
    this.usuarios = usuarios;
  }
}
