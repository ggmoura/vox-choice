package br.com.treinar.estudo.atividade.roger;

import java.util.Scanner;

public class Testexception {
	public static void main(String[] args) {
		Integer num = 0;
    
		Scanner s = new Scanner(System.in);	
		//try {
			System.out.println("digite um numero: ");
			num = s.nextInt();
		
		//} catch (InputMismatchException e) {
			// TODO: handle exception
		//}
    
   s.close();
    
		
		
	}
}
