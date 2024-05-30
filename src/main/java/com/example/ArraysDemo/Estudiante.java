package com.example.ArraysDemo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Estudiante {
	
	private String nombre;
	private int totalAsignaturas;

}
