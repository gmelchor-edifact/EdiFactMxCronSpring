package com.mx.edifact.service;

import java.util.List;

import com.mx.edifact.model.Usuario;

public interface UsuarioService {

	void addUsuario(Usuario usuario);

	List<Usuario> getAllUsuarios();
	
}
