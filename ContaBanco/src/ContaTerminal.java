import java.util.Scanner;

public class ContaTerminal {
	public static void main(String [] args) {
		int numero;
		String agencia;
		String nomeCliente;
		float saldo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor digite o seu nome: ");
		nomeCliente = sc.nextLine();
		
		System.out.println("Por favor digite o numero da conta: ");
		numero = sc.nextInt();
		sc.nextLine(); //Consumir a quebra de linha restante
		
		System.out.println("Por favor digite a sua agencia: ");
		agencia = sc.nextLine();
		
		System.out.println("Quanto dinheiro você quer depositar?: ");
		saldo = sc.nextFloat();
		
		String mensagemBoasVindas = "Olá ";
		mensagemBoasVindas = mensagemBoasVindas.concat(nomeCliente);
		mensagemBoasVindas = mensagemBoasVindas.concat(", obrigado por criar uma conta em nosso banco, sua agência é ");
		mensagemBoasVindas = mensagemBoasVindas.concat(agencia);
		System.out.println(mensagemBoasVindas + ",conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
		sc.close();
	}
}
