package Boletin4;

import java.util.Scanner;

public class Ejercicio07 {

	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A[]= new int [4];
		int B[]= new int [4];
		int C[]= new int [8];// contiene arreglo a y b
		System.out.println("Tabla A : ");
		for(int n=0; n<4; n++) {
			System.out.println("ingrese "+(n+1)+"° numero de A : " );
	        A[n]=sc.nextInt();
		}	
		System.out.println("Tabla B : ");
		for(int i=0; i<4; i++) {
			System.out.println("ingrese "+(i+1)+"° numero de B : ");
			B[i]=sc.nextInt();	
		}
		System.out.println("=================================");
		System.out.println("Tablaa A : ");
		for(int j1=0; j1<4;j1++) {
			System.out.print(A[j1]+" - ");
			}	
		
		System.out.println("Tabla b : ");
		for(int j1=0; j1<4;j1++) {
			System.out.print(B[j1]+" - ");
			}	
		// i = a y b / j=c
			int j=0;
		for(int i=0; i<4; i++) {//imprimo
			C[j]= A[i];
			j++;
			C[j]= B[i];
			j++;
		}
		System.out.println("numeros de C :");//muestro arreglo C
		for(int j1=0; j1<8;j1++) {
		System.out.print(C[j1]+" - ");
		}	
	}
	}


