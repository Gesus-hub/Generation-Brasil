package Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.UserLogin;
import Model.Usuario;
import Service.UsuarioService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*") 
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService serviceUsuario;
	
	
	@PostMapping("/logar")
	public ResponseEntity<UserLogin> Autentication(@RequestBody Optional<UserLogin> userLogin){
		
		return serviceUsuario.logarUsuario(userLogin)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	};
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Usuario> Autentication(@RequestBody Usuario usuario){
		
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(serviceUsuario.CadastrarUsuario(usuario));
	};

}
