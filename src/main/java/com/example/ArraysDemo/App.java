package com.example.ArraysDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
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
