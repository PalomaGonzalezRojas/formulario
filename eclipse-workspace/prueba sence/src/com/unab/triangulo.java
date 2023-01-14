package com.unab;

import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		
		int base,altura, resultado; 
		
		System.out.println("ingrese el valor de la base: ");
		base= entrada. nextInt();
		
		System.out.println("ingrese el valor de la altura");
		altura= entrada.nextInt();
		
		resultado= base*altura/2;
		System.out.println(resultado);
		
		
		
	}

}
