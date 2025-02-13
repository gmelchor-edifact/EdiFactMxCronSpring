package com.mx.edifact.model;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * 
 * @author German Melchor
 */

@Data
public class Usuario {

	private Long id;
	private String nombre;
	private String email;
	private LocalDateTime fechaCreacion;

}
