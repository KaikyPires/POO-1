
package POO;

class Conta {
      
    int numero;
    String titular;
    double saldo;
    
    // metodos
    
    void consultarSaldo(){
        System.out.println("O saldo é " + this.saldo);
    }
    boolean sacarValor(double valorSaque){            
        if (valorSaque > this.saldo) {
            System.out.println("Não tem como sacar esse saldo.");
            return false;
        }
        else{
            this.saldo -= valorSaque;
            System.out.println("Saldo em sua conta : " + this.saldo);
            return true;
        }
    }
    void depositarValor(double valorDepositar){
        this.saldo += valorDepositar;
        System.out.println("Saldo em sua conta : " + this.saldo);
    }
    void transferirValor(double valorTransferir, Conta destino){
       boolean retirou = this.sacarValor(valorTransferir);
        if (retirou == false) {
            System.out.println("Saldo Insuficiente. Impossível Transferir!");
        }else{
            destino.depositarValor(valorTransferir);
        }
    }
}
