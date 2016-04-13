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
	Usuario usuarioIngresado
	String claveIngresada

	new(Login l) {
		this.login = l
		this.usuarioIngresado = new Usuario()
		this.claveIngresada = null
	}


	def validarCamposVacios() {
		
		if (usuarioIngresado.username.empty) {
			
			throw new UserException("Complete el campo usuario")
		}
		
	}


	def validaUsuario() {

		if (usuarioIngresado == null && claveIngresada == null) {

			throw new UserException("Debe ingresar el usuario y la contraseña")

		} else if (usuarioIngresado == null) {

			throw new UserException("Debe ingresar el usuario")


		} else {
			login.validarUsuario(usuarioIngresado.username)
		}
	}

	def validarUsuarioYClave() {
		//login.validarCamposVacios(usuarioIngresado.username, claveIngresada)
		login.validarUsuarioYClave(usuarioIngresado.username, claveIngresada)
	}
}
