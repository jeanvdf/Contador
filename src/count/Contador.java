package count;

import java.util.Scanner;

import except.ParametrosInvalidosException;

public class Contador {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int primeiroValor = 0;
		
		int segundoValor = 0;
		
		boolean isValido = false;
		
		while(!isValido) {
			try {
				System.out.println("Digite o primeiro valor: ");
				primeiroValor = scan.nextInt(); 
				isValido = true;
			} catch (Exception e) {
				System.out.println("Valor inválido! Insira um numero inteiro válido. ");
				scan.next();
			}
		} 
		isValido = false;
		
		while(!isValido) {
			try {
				System.out.println("Digite o segundo valor: ");
				segundoValor = scan.nextInt(); 
				isValido = true;
			} catch (Exception e) {
				System.out.println("Valor inválido! Insira um numero inteiro válido. ");
				scan.next();
			}
		}
		
		try {
			contar(primeiroValor, segundoValor);
		} catch (ParametrosInvalidosException e) {
			e.printStackTrace();
		}
	}
	
	static void contar(int primeiroValor, int segundoValor) throws ParametrosInvalidosException {
		
		if(primeiroValor > segundoValor) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		for (int i = 1; i <= segundoValor - primeiroValor; i++) {
			System.out.println("Imprimindo o número " + i);
		}
		
	}
	
	
	
	
}
