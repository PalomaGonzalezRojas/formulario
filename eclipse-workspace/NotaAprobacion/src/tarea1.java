import java.util.Scanner;

public class tarea1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		String nombre, apellido, direccion, comuna, numero_de_telefono, afp,salud;
		
		int rut, edad, sistema_de_salud;
		
		while(true) {
		
		System.out.println("Ingrese su nombre");
		nombre = entrada.nextLine();
		int largo = nombre.length();
		if (largo!=0) {
			break;
		}
		
		while (true) {
		System.out.println("afp");
		afp= entrada.nextLine();
		
		
		while (true ) {
		
		System.out.println("Ingrese su apellido");
		apellido = entrada.nextLine();
		int largoap= apellido.length();
		break;
		
		
		System.out.println("Ingrese su direccion");
		direccion = entrada.nextLine();
		if (direccion.length()>=50) {
		System.out.println("sobrepasa_50_caracteres");
		}
		
		System.out.println("Ingrese su comuna");
		comuna = entrada.nextLine();
		
			
		System.out.println("Teléfono: ");
		numero_de_telefono = entrada.nextLine();
		if (!numero_de_telefono.matches("[0-9]{8,15}")){
			System.out.println("Ingresar un numero telefonico entre 8 a 15 caracteres");
			numero_de_telefono= (" numero de telefono incorrecto");
		}
		
		System.out.println("Ingrese su rut");
		rut = entrada.nextInt();
		if (rut<0|| rut > 99999999) {
			System.out.println("rut incorrecto");
		}
		
		
		
		System.out.println("edad");
		edad= entrada.nextInt();
		if (edad > 120) {	
		System.out.println("edad_incorrecta");
		}
		
		System.out.println("sistema_de_salud 1 para Fonsa o 2 para isapre");
		sistema_de_salud=entrada.nextInt();
		salud="opcion invalida";
		if (sistema_de_salud==1) {
		salud="Fonasa";
		}
		else if (sistema_de_salud==2) {
		salud="Isapre";
		}
		else {
		System.out.println("ingresar una opcion valida");
		}
			
		
		System.out.println("nombre: "+nombre);
		System.out.println("apellido:"+apellido);
		System.out.println("direccion:"+direccion);
		System.out.println("comuna"+comuna);
		System.out.println("rut "+rut);
		System.out.println("numero_de_telefono "+numero_de_telefono);
		System.out.println("afp"+afp);
		System.out.println("edad "+edad);
		System.out.println("sistema_de_salud "+salud);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
