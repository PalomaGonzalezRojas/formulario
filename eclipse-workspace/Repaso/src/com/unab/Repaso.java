package com.unab;

import java.util.Scanner;

public class Repaso {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		String a1= "";
		String a2= "";
		String a3= "";
		String b1= "";
		String b2= "";
		String b3= "";
		String c1= "";
		String c2= "";
		String c3= "";
		String respuesta= "";
		
		System.out.println(a1 + "I" + a2 + "I" + a3 + "I");
		System.out.println("_I_I_");
		
		System.out.println(b1 + "I" + b2 +"I" + b3 + "I");
		System.out.println("_I_I_");
		System.out.println(c1 + "I" + c2 + "I" + c3 +"I");
		
		System.out.println("Ingrese 1, ingrese casilla (fila columnas) "); 
		
		respuesta = entrada.nextLine();
		
		switch (respuesta) { 
		
		case "a1":
			a1 = "X";
			
			break;
			
		case "a2":
			a2 = "X";
			
			break;
			
		case "a3":
			a3 = "X";
			
			break;
			
		case "b1":
			b1 = "X";
			
			break;
			
		case "b2":
			b2 = "X";
			
			break;
			
		case "b3":
			b3 = "X";
			
			break;
		
		case "c1":
			c1 = "X";
			
			break;
			
		case "c2":
			c2 = "X";
			
			break;
			
		case "c3":
			c3 = "X";
			
			break;
			
		
		}
		
		
		
		

	}

}
