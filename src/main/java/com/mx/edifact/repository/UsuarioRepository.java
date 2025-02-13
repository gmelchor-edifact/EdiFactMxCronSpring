package com.mx.edifact.repository;

import java.util.List;

import com.mx.edifact.model.Usuario;

public interface UsuarioRepository {

	public void insert(Usuario usuario);

	public List<Usuario> findAll();

}
