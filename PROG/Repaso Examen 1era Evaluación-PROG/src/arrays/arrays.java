package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
	
		Scanner leer = new Scanner(System.in);
		/*
		int array []= new int[3];
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("Ingrese dato:");
			
			array[i] = leer.nextInt();
			
		}
		
		int suma=0;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("-------------------------------");
			System.out.println();
			System.out.println(array[i]);
			suma = suma + array[i];
		}
		
		System.out.println("La suma total es: " + suma);
		
		
		
		int mayor, menor, sumaPositivo=0, sumaNegativo=0;
		
		
		
		int array1 []=  {1,2,3,5, -4, -3};
		
		mayor = menor = array1 [0];

		for (int i = 0; i < array1.length; i++) {
			if (array1[i]>mayor) {
				mayor = array1[i];
			}
			if (array1[i]<menor) {
				menor = array1[i];
			}
		}
		
		System.out.println(mayor);
		System.out.println(menor);
		
		
		for (int i = 0; i < array1.length; i++) {
			if (array1[i]>=0) {
				sumaPositivo += array1[i];
			}else {
				sumaNegativo += array1[i];
			}
		}
		
		System.out.println("La suma de los posi es: " + sumaPositivo);
		System.out.println("La suma de los neagt es: " + sumaNegativo);
		
		
		
		
		System.out.println("Dime el tamaño del array: ");
		int tam = leer.nextInt();
		
		System.out.println("Dime un numero: ");
		int num = leer.nextInt();
		
		
		int array[] = new int [tam];
		
		for (int i = 0; i < array.length; i++) {
			array[i]= num;
			System.out.println("Posicion "+(i+1)+"-"+ array[i]);
		}
		
		   */
	
		 // Calculamos cuantos números tiene la secuencia
        int cuantos = 0;
        for (int i = 1; i <= 10; i++) {
            cuantos += i;
        }


        // Creamos el vector
        int valores[] = new int[cuantos];

        // Posición donde insertar los números
        int pos = 0;
        
        // Para cada número n del 1 al 10
        for (int n = 1; n <= 10; n++) {
            
           // Introducimos n veces 'n' en la posición 'pos'
            Arrays.fill(valores, pos, pos + n, n);
            
            // Actualizamos pos
            pos += n;
            
        }
        
        // Mostramos el array
        String arrayStr = Arrays.toString(valores);
        System.out.println("Array: " + arrayStr);
     
		
		
        
		
		
		
		
		
		
		
		
	}
}
