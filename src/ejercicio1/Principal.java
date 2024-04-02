package ejercicio1;

import java.util.Scanner;

public class Principal {
	
	

	public static void main(String[] args) {
		
		int valorHour;
		int valorMin;
		int valorSeg;
		int opcion=0;
				
		Scanner sc = new Scanner (System.in);
		
		
		
		
		
	
			System.out.println("Ingrese el valor de Hora");
			valorHour = sc.nextInt();
						
		
		
			System.out.println("Ingrese el valor de Minutos");
			valorMin = sc.nextInt();
			
			
		
			System.out.println("Ingrese el valor de Segundos");
			valorSeg = sc.nextInt();
			
			
		
			
			
			
			Hora hora = new Hora(valorHour, valorMin);
			HoraExacta hexacta = new HoraExacta();
			hexacta.setSegundo(valorSeg);
			
			System.out.println("El valor ha sido actualizado");
			System.out.println(hexacta.toString());
	

	}

	
		
		

}
