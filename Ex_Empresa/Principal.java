
package conta;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Conta c1, c2;
        int op;
        double valor;
        double transferir;
        double saque;
        
        c1 = CadastrarConta();
        c2 = CadastrarConta();
      do{
        System.out.println("\n***O que voce deseja fazer: ");
        System.out.println("1 : Depositar \n"
                + "2 : trasferencia\n"
                + "3 : Sacar\n"
                + "-1 : sair\n");
        op = teclado.nextInt();
      
      switch(op){
          case 1:
              System.out.println("Qual o valor a ser depositado:");
              valor = teclado.nextDouble();
              c1.depositarValor(valor);
              break;
              
          case 2:
              System.out.println("Qual o valor a ser transferido:");
               transferir = teclado.nextDouble();
              c1.transferirValor(transferir, c2);
                  break;
          case 3:
              System.out.println("Qual o valor a ser sacado:");
              saque = teclado.nextDouble();
              c1.sacarValor(saque);
              break;
          case -1:
          System.out.println("Sair");
          break;
      }
              
      }
      
      while (op != -1);
        System.out.println("bye");
         teclado.close();
    }
     public static Cliente CadastrarCliente(){
         Scanner teclado = new Scanner(System.in);
          Cliente cli1 = new Cliente();
        System.out.println("Informe o nome do cliente:");
        String nome = teclado.next();
        System.out.println("Informe o cpf: ");
        String cpf = teclado.next();
        
        
        cli1.setNome(nome);
        cli1.setCpf(cpf);
        
        return cli1;
         
    }
    public static Conta CadastrarConta(){
        
         Scanner teclado = new Scanner(System.in);
        
        Conta c = new Conta();
        System.out.println("***Cadastro da conta***");
        System.out.println("Informe o numero da conta: ");
        int numero = teclado.nextInt();
        System.out.println("Informe o saldo: ");
        double saldo = teclado.nextDouble();
        System.out.println("***Informe o titular da conta***");
        Cliente cli1 = CadastrarCliente();
        
        c.setTitular(cli1);
        c.setSaldo(saldo);
        c.setNumero(numero);
        
        
        return c;
    }
}

