package Oscurilandia;

import java.util.*;

public class tablerodos {
	public void mostrartablero1(){
	 
	int largo=16;
	int ancho=18;
	int i;
	int p;
	
	int tablero[][] = new int[largo][ancho];{
			System.out.println("¡HOlA!, elije un número de fila y columna para lanzar tu huevo");
			for (i=1;i<largo;i++) {			
				   
				if ((i==1) && (i<16)){
				
					System.out.println
					
					("     1   2   3   4   5   6   7   8   9  10  11  12  13  14  15");
    				
				}
				
				System.out.println(" ______________________________________________________________");
				
				
				for (p=1;p<ancho;p++) {				
						
						if (p==18) {
				
							System.out.print("|   |");					
						}
					
						else if((p==1) && (i<10)){
						
							System.out.print(" "+i);
						}
						
						else if((p==1) && (i>9 && i<16)){
						    System.out.print(i);
						}
						else {
						
							System.out.print(" |  ");
						}
							
					}
					
					System.out.println("");
				}
				System.out.println(" ______________________________________________________________"); 
			}
	
	}
	
}

	


	
	
	

 





