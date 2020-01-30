package Boletin4;

import java.util.Scanner;

public class Ejercicio08 {
		// TODO Auto-generated method stub
private static Scanner sc;
public static void main(String[] args) {
				 //Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los números están
				 //ordenados de forma creciente, decreciente, o si están desordenados.
		     int  numeross[];
		     int n=0;
		    // crecientes num de menor a mayor
		    // decrecientes num de mayor a menor
		     sc= new Scanner(System.in);
		    numeross = new int [10];
		    boolean creciente = false;
		    boolean decreciente = false;
		    System.out.println("Serie");
		    for(int i = 0; i<10; i++);{
		    	int i=0;
				System.out.println("número :");
		    	numeross[i]=sc.nextInt();
		    }
		    for(int i = 0; i<9;n++) {
		    	if (numeross[i]> numeross[i+1]) {
		    		decreciente=true;
				if (numeross[i]< numeross[i+1])
					creciente=true;
			  }
			if (creciente ==true && decreciente ==false) //numeros en orden creciente y no es decreciente
				 System.out.println("Serie creciente.");
				 if (creciente ==false && decreciente ==true) // todas la parejas están en orden decreciente
				 System.out.println("Serie decreciente.");
				 if (creciente ==true && decreciente ==true) // si ha tenido momentos creciente y decrecientes
				 System.out.println("Serie desordenada.");
				 if (creciente ==false && decreciente ==false) // no hay parejas crecientes ni decrecientes
				 System.out.println("Todos los números iguales.");
			}
		}
		
	}


