package br.qxd.ufc.musician_estore_center.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import br.qxd.ufc.musician_estore_center.model.Usuario;
import br.qxd.ufc.musician_estore_center.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public void adicionarUsuario(Usuario usuario) {
		//usuario.setSenha(new BCryptPasswordEncoder().encode(usuario.getSenha()));
		usuario.setNome("teste");
		usuarioRepository.save(usuario);
	}
	
	public List<Usuario> retornarTodosOsUsuarios(){
		return usuarioRepository.findAll();
	}
	
	public Usuario procurarPorId(Long id) {
		return usuarioRepository.getOne(id);
	}
	
	public void removerUsuario(Long id) {
		usuarioRepository.deleteById(id);
	}
}
