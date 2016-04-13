package unq_ciu.gatoEncerrado.Login

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import java.util.List
import java.util.ArrayList
import org.uqbar.commons.model.UserException

@Accessors
@Observable
class Login {

	List<Usuario> usuarios

	new() {
		this.usuarios = new ArrayList<Usuario>

	}

	def validarUsuarioYClave(String usernameIngresado, String clave) {
		for (Usuario u : usuarios) {
			if (u.username != usernameIngresado) {
				throw new UserException("Usuario incorrecto o inexistente")
			} else if (u.password != clave) {
				throw new UserException("Clave Incorrecta")
			}
		}
	}

	def validarCamposVacios(String usuarioIngresado, String claveIngresada) {

		if (usuarioIngresado == null || claveIngresada == null) {

			throw new UserException("Debe ingresar el usuario y la contraseña")
		}
	}

	def agregarUsuario(Usuario user) {
		usuarios.add(user)
	}
}
