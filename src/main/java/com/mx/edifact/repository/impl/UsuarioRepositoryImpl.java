package com.mx.edifact.repository.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mx.edifact.model.Usuario;
import com.mx.edifact.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UsuarioRepositoryImpl implements UsuarioRepository {

	private final NamedParameterJdbcTemplate jdbcTemplate;
	

	@Override
	public void insert(Usuario usuario) {
		String sql = "INSERT INTO usuario (nombre, email) VALUES (:nombre, :email)";
        MapSqlParameterSource params = new MapSqlParameterSource()
                .addValue("nombre", usuario.getNombre())
                .addValue("email", usuario.getEmail());
		jdbcTemplate.update(sql, params);
	}

	@Override
	public List<Usuario> findAll() {
		String sql = "SELECT * FROM usuario";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}

}
