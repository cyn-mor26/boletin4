package Boletin4;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// leer 5 numeros y mostrarlos en inverso
		
		int cinco[]= new int [5];// hay 5 elementos de tipo int
		
		Scanner sc = new Scanner(System.in);
			
		for( int m=0; m <5 ; m++) {
			System.out.println(" ingrese el numero " +(m+1));
			cinco[m]= sc.nextInt();
		}
				
		for(int j=4; j>=0; j-- ) {
			System.out.println(" los elementos son :" +cinco[j]);
			}

}
}
