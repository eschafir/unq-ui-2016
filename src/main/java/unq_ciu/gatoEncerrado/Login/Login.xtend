package unq_ciu.gatoEncerrado.Login

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable

@Accessors
@Observable
class Login {

	String username
	String password

	new(String user, String passwd) {
		this.username = user
		this.password = passwd
	}
}
