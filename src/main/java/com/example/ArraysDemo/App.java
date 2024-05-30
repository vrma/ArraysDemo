package com.example.ArraysDemo;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
    	// Crear un array de estudiante
    	Estudiante[] estudiantes = {
    			Estudiante.builder().nombre("Adrian").totalAsignaturas(8).build(),
    			Estudiante.builder().nombre("Pablo").totalAsignaturas(6).build()
    	};
    	
    	// Recorrer con un for mejorado
    	for(Estudiante estudiante : estudiantes) 
    		System.out.println(estudiante.getNombre());
    	
    	// Crear un array de profesores
    	Profesor[] profesores = {
    			Profesor.builder().nombre("Mariano").departamento(Profesor.Dpto.RRHH).build(),
    			Profesor.builder().nombre("Maria").departamento(Profesor.Dpto.CONTABILIDAD).build()
    	};
    	
    	for(Profesor p : profesores) 
    		System.out.println(p);
    	
    	/* ¿Como crear un array que contenga tanto Estudiantes, como
    	 * profesores */
    	Object[] objetos = {
    			Estudiante.builder().nombre("Adrian").totalAsignaturas(8).build(),
    			Profesor.builder().nombre("Mariano").departamento(Profesor.Dpto.RRHH).build()
    	};
    	
    	for(Object o : objetos) {
    		if(o instanceof Estudiante estudiante) {
    			System.out.println(estudiante.getNombre());
    		} else if (o  instanceof Profesor profesor) {
      			System.out.println(profesor.getDepartamento());
    		}
    	}
    	
    }
}
