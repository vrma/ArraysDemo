package com.example.ArraysDemo;

/**
 * Hello world!
 *
 */
public class App 
{
	private static int ARRAY_SIZE;
	private static String nombre;
	
    public static void main( String[] args )
    {
    	// Las variables que se declaran dentro de metodos son locales
    	// y no se inicializan a un valor por defecto de forma implicita
    	String otroNombre = null;
    	
    	/* Manejo de los argumentos que recibe el metodo main, es decir, la App cuando se ejecuta.
    	 * Porque la App cuando se ejecuta recibe como parametro un array de argumentos de tipo 
    	 * String (String[] args). 
    	 * ¿Donde se especifican los argumentos que recibe la App en el IDE Eclipse?
    	 * Rta. En la configuracion de las opciones de ejecucion */
    	
    	// Primero hay que comprobar si la App esta recibiendo los 
    	// argumentos esperados
    	if( args.length == 0) {
    		System.out.println("No se han recibido los argumentos esperados");
    	} else if (args.length != 3) {
    		System.out.println("No se han recibido tres argumentos");
    	} else {
    		// Mostrar o manejar los argumentos recibidos.
    		System.out.println("SE HAN RECIBIDO LOS SIGUIENTES ARGUMENTOS");
    		for(String argumento : args) 
    			System.out.println(argumento);
    		
    		ARRAY_SIZE = Integer.parseInt(args[1]); // "20"
    		
    		System.out.println("El tamaño del array es : " + ARRAY_SIZE);
    		
    		  		
    	}
    		
    	
  
    }
}
