package unq_ciu.gatoEncerrado.Login;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Usuario {
  private String username;
  
  private String password;
  
  public Usuario(final String u, final String p) {
    this.username = u;
    this.password = p;
  }
  
  @Pure
  public String getUsername() {
    return this.username;
  }
  
  public void setUsername(final String username) {
    this.username = username;
  }
  
  @Pure
  public String getPassword() {
    return this.password;
  }
  
  public void setPassword(final String password) {
    this.password = password;
  }
}
