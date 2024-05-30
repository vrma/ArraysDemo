package com.example.ArraysDemo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Profesor {
	
	private String nombre;
	private Dpto departamento;
	
	enum Dpto {
		RRHH, CONTABILIDAD
	}
}
