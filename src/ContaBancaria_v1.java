import java.util.*;

public class ContaBancaria_v1 {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner entrada = new Scanner(System.in);

    double saldo = 0;
    double limite = 500;
    int limiteSaque = 3;
    String extrato = "";
    int numeroSaque = 0;

    while (true) {
      
      System.out.println("===========================");
      System.out.println("[d] Deposito");
      System.out.println("[s] Saque");
      System.out.println("[e] Extrato");
      System.out.println("[q] Sair");
      System.out.println("===========================");

      String menu = entrada.nextLine();

      if (menu.equals("d")) {
      System.out.println("Informe o valor do Depósito: R$");
      double valor = entrada.nextDouble();
      entrada.nextLine();
      
        if (valor > 0) {
        saldo = saldo + valor;
        extrato = extrato + "Depósito de R$ " + valor + "\n";
        System.out.printf("Depósito de R$ %.2f realizado %n", valor);
      } else {
        System.out.println("Operação falhou! O valor informado é inválido!");
      }
      
      } else if (menu.equals("s")) {
      System.out.println("Informe o valor do Saque: R$");
      double valor = entrada.nextDouble();
      entrada.nextLine();
      
      boolean excedeuSaldo = valor > saldo;
      boolean excedeuLimite = valor > limite;
      boolean excedeuSaque = numeroSaque >= limiteSaque;
      
      if (excedeuSaldo) {
        System.out.println("Operação falhou! Você não tem saldo suficiente!"); 

      } else if (excedeuLimite) {
        System.out.println("Operação falhou! O valor do saque excede o limite!");

      } else if (excedeuSaque) {
        System.out.println("Operação falhou! Número máximo de saques excedido!");

      } else if (valor > 0) {
        saldo = saldo + valor;
        extrato = extrato + "Saque de R$ " + valor + "\n";
        numeroSaque = numeroSaque + 1;
        System.out.printf("Saque de R$ %.2f realizado com sucesso! %n", valor);

      } else {
        System.out.println("Operação falhou! O valor informado é inválido.");
      }
      
      } else if (menu.equals("e")) {
      String mensagem = extrato.isEmpty() ? "Não foram realizadas movimentações." : extrato;
      
      System.out.println("============ EXTRATO ===============");
      System.out.println(mensagem);
      System.out.println();
      System.out.printf("Saldo: R$ %.2f %n", saldo);
      System.out.println("===================================");
      
      } else if (menu.equals("q")) {
      System.out.println("Obrigado pela Preferencia.");
        break;// Sai do loop se o usuário escolher "q"

      } else {
      System.out.println("Opção inválida! Por favor, tente novamente."); // Informa o usuário sobre a opção inválida
      }
    }
    entrada.close();
  }
  
}


// import java.util.Locale;
// import java.util.Scanner;

// public class ContaBancaria_v1 {
// 	public static void main(String[] args) {
// 		Locale.setDefault(Locale.US);
// 		Scanner sc = new Scanner(System.in);

// 		// 3 operações: depósito, saque e extrato, sair
// 		double saldo = 0;
// 		double limite = 500;
// 		int limiteSaques = 3;
// 		String extrato = "";
// 		int numeroSaques = 0;

// 		while (true) {
// 			System.out.println("========================");
// 			System.out.println("[d] Depósito");
// 			System.out.println("[s] Saque");
// 			System.out.println("[e] Extrato");
// 			System.out.println("[q] Sair");
// 			System.out.println("========================");
// 			String menu = sc.next();

// 			if (menu.equals("d")) {
// 				System.out.print("Informe o valor do depósito: R$");
// 				double valor = sc.nextDouble();

// 				if (valor > 0) {
// 					saldo = saldo + valor;
// 					extrato = extrato + "Depósito de R$ " + valor + "\n";
// 					System.out.printf("Deposito de R$ %.2f realizado %n", valor);

// 				} else {
// 					System.out.println("Operação falhou! O valor informado é inválido!");
// 				}

// 			} else if (menu.equals("s")) {
// 				System.out.println("Informe o valor do saque: R$");
// 				double valor = sc.nextDouble();

// 				Boolean excedeuSaldo = valor > saldo;
// 				Boolean excedeuLimite = valor > limite;
// 				Boolean excedeuSaques = numeroSaques >= limiteSaques;

// 				if (excedeuSaldo) {
// 					System.out.println("Operação falhou! Você não tem saldo suficiente!");

// 				} else if (excedeuLimite) {
// 					System.out.println("Operação falhou! O valor do saque excede o limite!");

// 				} else if (excedeuSaques) {
// 					System.out.println("Operação falhou! Número máximo de saques excedido!");

// 				} else if (valor > 0) {
// 					saldo = saldo + valor;
// 					extrato = extrato + "Saque de R$ " + valor + "\n";
// 					numeroSaques = numeroSaques + 1;
// 					System.out.printf("Saque de R$ %.2f realizado com sucesso! %n", valor);

// 				} else {
// 					System.out.println("Operação falhou! O valor informado é inválido.");
// 				} 
// 			} else if( menu.equals("e")) {
// 				String mensagem = extrato.isEmpty() ? "Não foram realizadas movimentações." : extrato;
// 				System.out.println("============ E X T R A T O ============");
// 				System.out.println(mensagem);
// 				System.out.println();
// 				System.out.printf("SALDO: R$ %.2f %n", saldo);
// 				System.out.println("=======================================");
				
// 			} else if ( menu.equals("q")) {
// 				System.out.println("Obrigado pela preferência !!!");
// 				break;
        
// 			} else {
// 				System.out.println("Opção inválida, por favor selecione novamente a operação desejada.");
// 			}

// 		}
    
//     sc.close();
// 	}
// }



