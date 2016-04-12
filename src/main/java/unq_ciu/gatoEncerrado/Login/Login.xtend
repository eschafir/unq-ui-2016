package unq_ciu.gatoEncerrado.Login

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import java.util.ArrayList

@Accessors
@Observable
class Login {
	
	//Lista de usuarios
	ArrayList<Usuario> usuarios = new ArrayList<Usuario>()

	new() {}
	
	def validarUsuario(String usernameIngresado, String passwordIngresado){
		
		//Valida que el usuario y la contraseña sean correctos
		return (this.usuarios.exists[(it.username.equals(usernameIngresado)) && (it.password.equals(passwordIngresado))])	
	}
}
