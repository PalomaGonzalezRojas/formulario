/**
 * 
 */
package com.unab;
import java.util.Scanner;
/**
 * @author nashmiagonzalezrojas
 *
 */
public class ejercicioFormulario {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("- - - - - - - - - - -");
		System.out.println("LLENAR EL SIGUIENTE FORMULARIO");
		System.out.println("- - - - - - - - - - -");
		//Creamos un scanner
		Scanner entrada = new Scanner(System.in);
		
		//creamos las variables que utilizaremos
		String nombres,apellidos, direccion, comuna,afp, telefono,salud;
		int  edad, sistemaSalud,rut;
		
		while(true) {
			System.out.println("Nombres: ");
			nombres = entrada.nextLine();
			int largo = nombres.length();
			if (largo !=0){
				break;
			}
		}
		
		while(true) {
			
			System.out.println("Apellidos: ");
			apellidos = entrada.nextLine();
			int largoAp = apellidos.length();
			if (largoAp !=0){
				break;
			}
		}
		
		while(true) {
			System.out.println("Dirección: ");
			direccion = entrada.nextLine();
			int largoDir = direccion.length();
			if (direccion.length() >=50) {
				System.out.println("No más de 50 caracteres porfavor");
			}else if(largoDir !=0){
				break;
			}
		}
		
		System.out.println("Comuna: ");
		comuna = entrada.nextLine();
		
		System.out.println("Teléfono: ");
		telefono = entrada.nextLine();
		if (!telefono.matches("[0-9]{8,15}")){
			System.out.println("Ingresar un numero telefonico entre 8 y 15 numeros");
			telefono = "Numero ingresado incorrecto";
		}
		
		System.out.println("AFP: ");
		afp = entrada.nextLine();
		
		System.out.println("Edad: ");
		edad = entrada.nextInt();
		if (edad >120) {
			System.out.println("Edad incorrecta");
		}
		
		System.out.println("Rut: ");
		rut = entrada.nextInt();
		if (rut <0 || rut > 99999999) {
			System.out.println("numero de un rut invalido en Chile");
		}
		
		System.out.println("Ingrese 1 para Fonasa o 2 para Isapre ");
		sistemaSalud = entrada.nextInt();
		salud = "Opción invalida";
		if (sistemaSalud == 1) {
			salud = "FONASA";
		}
		else if(sistemaSalud == 2){
			salud = "ISAPRE";
		}
		else {
			System.out.println("Ingresar una opción valida");
		}
		
		
		System.out.println("- - - - - - - - - - -");
		System.out.println("- - - - - - - - - - -");
		System.out.println("Datos rescatados:");
		System.out.println("Rut: "+rut);
		System.out.println("Nombres: "+nombres);
		System.out.println("Apellidos: "+apellidos);
		System.out.println("Edad: "+edad);
		System.out.println("Telefono: "+telefono);
		System.out.println("Afp: "+afp);
		System.out.println("Sistema de salud: "+salud);
		System.out.println("Dirección: "+direccion);
		System.out.println("Comuna: "+comuna);
		
		
		
		
		
	}

}