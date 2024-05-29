package com.example.ArraysDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // ¿Como se declara un array?
    	
    	int[] numeros; // Declaramos que numeros es un array de valores enteros
    	
    	//  ¿Como añadir valores al array de numeros?
    	// PRIMERAMENTE hay que reservar memoria para los elementos del array
    	
    	numeros = new int[10];
    	
    	numeros[0] = 1;
    	numeros[1] = 2;
    	numeros[2] = 3;
    	
    	// Y asi, hasta el indice 9, porque del cero al nueve hay 10 elementos.
    }
}
