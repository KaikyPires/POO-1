package POO;


public class ContaPessoal {
     
public static void main (String[] args){
    
    Conta c1;
    c1 = new Conta();
    
    c1.titular = "Maria";
    c1.numero = 4321;
    c1.saldo = 1220;
    
    boolean consegui;
    System.out.println("A conta "+c1.numero+" e do(a)titular" +c1.titular+ "");
            
    c1.consultarSaldo();
    
    consegui = c1.sacarValor(2000.0);
    
    if(consegui){
        System.out.println("***Saldo suficiente. Por isso conseguiu realizar o saque");
    }
    else{
        System.out.println("***Saldo insuficiente. Por isso nao e realizar o saque");
    }
    c1.depositarValor(100);
    c1.consultarSaldo();
    




}
}

