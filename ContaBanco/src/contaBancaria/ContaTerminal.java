package contaBancaria;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		int numeroConta;
		String agencia, nomeCliente;
		double saldo;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da conta: ");
        numeroConta = sc.nextInt();
        System.out.println("Agora, digite o número da agência: ");
        agencia = sc.next();
        System.out.println("Insira agora o seu nome: ");
        nomeCliente = sc.next();
        System.out.println("Por fim, insira o saldo da conta: ");
        saldo = sc.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque"); 
		
	}
	
}
