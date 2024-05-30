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
    		
    		
    	}
    		
    	
    	// VARIANTE 2
        // ¿Como se declara un array?
    	
    	int[] numeros = {
    			0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14
    	};
    	
    	// Un array de nombres seria
    	String[] nombres = {
    			"Tamara", "Jessica", "Carlos", "Adrian", "Maria Lopez",
    			"Maria Jose", "Rosa", "Pablo", "Ivan", "Marly"
    	};
    	
    	// Para mostrar por consola los elementos del array de nombres
    	// VARIANTE # 1. Utilizando una funcion println, mostrar cada elemento del array
    	System.out.println(nombres[0]);
    	System.out.println(nombres[1]);
    	
    	// ... Y, como podran apreciar, la variante # 1 NO SIRVE para nada.
    	
    	
    	// VARIANTE # 2. Implica utilizar una sentencia de control de flujo, para recorrer el array y 
    	// lo veremos en la rama "sentenciasDeControlDeFlujo"
    	
    	// PRIMERO: Con una sentencia for de toda la vida, o clasica
//    	for(int i = 0; i < nombres.length; i++) {
//    		System.out.println(nombres[i]);
//    	}
    	
    	/* Ejercicio # 1. Solamente mostrar los nombres del array de nombres que tienen
    	 * mas de 4 caracteres */
    	for(int i = 0; i < nombres.length; i++) {
    		if (nombres[i].length() > 4) {
    			System.out.println(nombres[i]);
    		}     		
    	}
    	
    	/* ¿Que diferencia hay en utilizar el operador de autoincremento, o autodecremento, 
    	 * antes o despues? 
    	 * 
    	 * Para solucionar este problema, clasico de cuando uno empieza con un lenguaje de programacion
    	 * utilizaremos JSHELL, que es como un Shell, que es como un Shell de Python 
    	 * que antes Java no tenia .
    	 * 
    	 * RTA. El operador de autoincremento o autodecremento si esta solo en una sentencia,
    	 * da igual que vaya antes o despues, es decir, i++; o ++i; SON EXACTEMENTE LO MISMO, sin 
    	 * embargo, i + ++j no es lo mismo que i + j++*/
    	
    	/* NOTA MUY IMPORTANTE!!! ¿Cuando se utiliza el for clasico? 
    	 * Cuando nos interesa el indice. 
    	 * 
    	 * EJERCICIO  # 2. Por ejemplo, si queremos recorrer el array de numeros 
    	 * y solamente mostrar los elementos que son de indice par */
    	for(int i = 0; i < numeros.length; i++) {
    		if (i % 2 == 0) 
    			System.out.println("El elemeneto de indice " + i + ", es par");
    	}
    		
    	
    	
    	// SENGUNDO: Con un for mejorado, en ocasiones MAL llamado for each (por cada)
    	// y, digo mal llamado porque la sentencia forEach existe, como veran posteriomente
    	
    }
}
