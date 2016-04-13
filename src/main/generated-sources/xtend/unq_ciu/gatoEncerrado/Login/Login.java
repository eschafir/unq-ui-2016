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
  
  private final Usuario ui = new Usuario("ui2016", "123456");
  
  public Login() {
    ArrayList<Usuario> _arrayList = new ArrayList<Usuario>();
    this.usuarios = _arrayList;
    this.usuarios.add(this.ui);
  }
  
  public Object validarUsuario(final String usernameIngresado, final String passwordIngresado) {
    Object _xifexpression = null;
    final Function1<Usuario, Boolean> _function = new Function1<Usuario, Boolean>() {
      public Boolean apply(final Usuario it) {
        String _username = it.getUsername();
        return Boolean.valueOf(_username.equals(usernameIngresado));
      }
    };
    boolean _exists = IterableExtensions.<Usuario>exists(this.usuarios, _function);
    if (_exists) {
      _xifexpression = null;
    } else {
      throw new UserException("Usuario inexistente");
    }
    return _xifexpression;
  }
  
  @Pure
  public List<Usuario> getUsuarios() {
    return this.usuarios;
  }
  
  public void setUsuarios(final List<Usuario> usuarios) {
    this.usuarios = usuarios;
  }
  
  @Pure
  public Usuario getUi() {
    return this.ui;
  }
}
