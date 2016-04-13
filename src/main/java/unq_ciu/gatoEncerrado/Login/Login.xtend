package unq_ciu.gatoEncerrado.Login

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import java.util.List
import java.util.ArrayList
import org.uqbar.commons.model.UserException

@Accessors
@Observable
class Login {
	
	//Lista de usuarios
	List<Usuario> usuarios
	val Usuario ui = new Usuario("ui2016","123456")
	
	new() {
		this.usuarios = new ArrayList<Usuario>
		this.usuarios.add(ui)
		
	}
	
	def validarUsuario(String usernameIngresado, String passwordIngresado){
		
		
		//Valida que el usuario y la contraseña sean correctos
		//return (this.usuarios.exists[(it.username.equals(usernameIngresado)) && (it.password.equals(passwordIngresado))])
		
		if (this.usuarios.exists[(it.username.equals(usernameIngresado))])
			 {
				//Aca tiene que levantar una ventana
				//throw new UserException("Se ha logueado correctamente")
			}
		
		else {
			throw new UserException("Usuario inexistente")
		}
	}
}
