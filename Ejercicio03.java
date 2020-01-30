package Boletin4;

import java.util.Scanner;

public class Ejercicio03 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//leer 5 numeros por teclado 
//y a continuacion realizar la media de los numeros positivos
//la media de los negativos y contar el numero de cero.

	int cinco[]= new int [5];// hay 5 elementos de tipo float
	int n = 0,sumap = 0, m=0; 
	int suman= 0; 
	int contp=0,contn=0;
	int sumac=0;
	sumap=sumap+n;
	suman=suman+n;
	sumac=sumac+n;
	for( int m1 =0; m <5 ; m++ ) {
		System.out.println(" ingrese el numero " +(m+1));
		cinco[m]= sc.nextInt();
	}
	
	
	for( int m1 =0; m <5 ; m++ ) {
		if (cinco[m]>0) {
		suman= suman+m;
		contp=contp+1;
		System.out.println("suma de positivos" +(suman+m));
		}else if (cinco[m]==0) {
			
		}else {
			
		}
	}
}
}

	