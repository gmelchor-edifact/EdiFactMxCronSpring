package com.mx.edifact.scheduler;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.mx.edifact.model.Usuario;
import com.mx.edifact.service.UsuarioService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UsuarioScheduler {

	private static final Logger log = LogManager.getLogger(UsuarioScheduler.class);

	private final UsuarioService usuarioService;

	@Scheduled(cron = "0/10 * * * * ?")
	public void listarUsuarios() {
		log.info("🔹 Usuarios en la BD:");
		List<Usuario> usuarios = usuarioService.getAllUsuarios();

//		log.info("Numero de usuarios [{}]", usuarios.size());
		usuarios.forEach(usuario -> log.info("Usuario: [{}]", usuario));
	}
}
