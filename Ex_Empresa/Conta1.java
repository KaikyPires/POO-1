
package conta;

import java.util.Scanner;

public class Conta1 {
    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
    
    Conta c1, c2;
    c1 = new Conta();
    c2 = new Conta();
    
    Cliente cliente1 = new Cliente();
    
    c1.titular = cliente1;
    c1.numero = 4321;
    c1.saldo = 1220;
    
    c1.titular.nome = "Claudio";
        System.out.println(c1.titular.nome);
    cliente1.cpf = "199.786.868-69";
    System.out.println(c1.titular.cpf);
    cliente1.fone = "(31) 4002-8922";    
    System.out.println(c1.titular.fone);
    
    //c2.titular = "Claudio";
    //c2.numero = 1234;
    //c1.saldo = 12000;
    
    
    




}
}


