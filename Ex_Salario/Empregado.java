
package exercicios1;

public abstract class Empregado {
    
        private String nome;
        private String sobrenome;
        private String cpf;

    public Empregado(String n, String sn, String doc) {
        this.nome = n;
        this.sobrenome = sn;
         this.cpf = doc;
    }

    public abstract double vencimento();
        
        
       
        
        
        
        
    }


