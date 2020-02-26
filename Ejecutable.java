
package Oscurilandia;
import java.util.*;
	public class Ejecutable {

		public static void main(String[] args) {
		
			
			tablerodos tablerito = new tablerodos();
			System.out.println("==================================");
			System.out.println("¡Bienvenido al simulador de ataque!");
			System.out.println("==================================");
			System.out.println("¿qué deseas hacer?");
			System.out.println("");
			System.out.println("Si deseas jugar presiona [1]\n Si deseas salir presiona [2]");
			Scanner opciones = new Scanner(System.in);
			int a = opciones.nextInt();
			
			switch (a) {
			case 1: 
					tablerito.mostrartablero1();
					break;
			case 2: System.out.println("Hasta la proxima :)");		
		
			}
		}
	}