package Seguranca;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import Model.Usuario;
import Repository.UsuarioRepository;

@Service
public class UserDetailsServiceImplemente implements UserDetailsService {

	@Autowired
	private UsuarioRepository repositoryUsuario;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<Usuario> usuario = repositoryUsuario.findByEmail(email);
		usuario.orElseThrow(() -> new UsernameNotFoundException(email + "not found. "));

		return usuario.map(UserDetailsImplements::new).get();
	}

}
