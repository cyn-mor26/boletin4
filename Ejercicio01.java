package Boletin4;

import java.util.Scanner;

public class Ejercicio01 {

public static void main(String[] args) {
		// leer 5 numeros y mostrarlos en el mismo orden introducido
		  
	int cinco[]= new int [5];// hay 5 elementos de tipo float
			
	for( int m=0; m <5 ; m++ ) {
		System.out.println(" ingrese el numero " +(m+1));
		cinco[m]= new Scanner(System.in).nextInt();
	}
			
	for( int j=0; j<5; j++ ) {
		System.out.println(" los elementos son :" +cinco[j]);
				
	}

}
}
