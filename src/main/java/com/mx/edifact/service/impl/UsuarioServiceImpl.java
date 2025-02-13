package com.mx.edifact.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mx.edifact.model.Usuario;
import com.mx.edifact.repository.UsuarioRepository;
import com.mx.edifact.service.UsuarioService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

	private final UsuarioRepository repository;

	@Override
	public void addUsuario(Usuario usuario) {
		repository.insert(usuario);
	}

	@Override
	public List<Usuario> getAllUsuarios() {
		return repository.findAll();
	}

}
