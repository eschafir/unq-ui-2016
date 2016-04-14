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
  
  /**
   * Agrega un usuario a la "base de datos" del juego.
   */
  public boolean agregarUsuario(final Usuario user) {
    return this.usuarios.add(user);
  }
  
  /**
   * Valida que el nombre de usuario esté en la "Base de Datos" del programa.
   * @params usuario : nombre del usuario. Ingresado en el campo "Usuario".
   */
  public void validarUsuario(final String usuario) {
    final Function1<Usuario, Boolean> _function = new Function1<Usuario, Boolean>() {
      public Boolean apply(final Usuario it) {
        String _username = it.getUsername();
        return Boolean.valueOf(Objects.equal(_username, usuario));
      }
    };
    boolean _exists = IterableExtensions.<Usuario>exists(this.usuarios, _function);
    boolean _not = (!_exists);
    if (_not) {
      throw new UserException("Usuario incorrecto o inexistente");
    }
  }
  
  /**
   * Valida que la clave ingresada sea la correspondiente con el usuario ingresado. Este método debe ser llamado inmediatamente luego de validarUsuario().
   * @params clave : la clave que se va a validad en la base de datos.
   */
  public void validarClave(final String clave) {
    final Function1<Usuario, Boolean> _function = new Function1<Usuario, Boolean>() {
      public Boolean apply(final Usuario it) {
        String _password = it.getPassword();
        return Boolean.valueOf(Objects.equal(_password, clave));
      }
    };
    boolean _exists = IterableExtensions.<Usuario>exists(this.usuarios, _function);
    boolean _not = (!_exists);
    if (_not) {
      throw new UserException("Clave Incorrecta");
    }
  }
  
  /**
   * Valida que ninguno de los campos de credenciales esté vacío.
   */
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
