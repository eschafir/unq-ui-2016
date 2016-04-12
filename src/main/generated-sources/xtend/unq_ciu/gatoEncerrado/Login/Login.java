package unq_ciu.gatoEncerrado.Login;

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
  
  public void validarUsuario(final String usernameIngresado, final String passwordIngresado) {
    final Function1<Usuario, Boolean> _function = new Function1<Usuario, Boolean>() {
      public Boolean apply(final Usuario it) {
        String _username = it.getUsername();
        return Boolean.valueOf(_username.equals(usernameIngresado));
      }
    };
    boolean _exists = IterableExtensions.<Usuario>exists(this.usuarios, _function);
    if (_exists) {
      throw new UserException("Se ha logueado correctamente");
    } else {
      throw new UserException("Usuario inexistente");
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
