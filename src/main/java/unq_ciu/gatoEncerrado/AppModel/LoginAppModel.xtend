package unq_ciu.gatoEncerrado.AppModel

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import unq_ciu.gatoEncerrado.Login.Login
import unq_ciu.gatoEncerrado.Login.Usuario
import org.uqbar.commons.model.UserException

@Accessors
@Observable
class LoginAppModel {
	
	Login login
	Usuario usuario

	new() {}
	
	def validarUsuario(String usernameIngresado, String passwordIngresado) {
		
		if (usuario.username == null || usuario.password == null) {
			
			throw new UserException("Debe ingresar un nombre de usuario")
		} 
		else {
				login.validarUsuario(usernameIngresado, passwordIngresado)
			}	
	}
}