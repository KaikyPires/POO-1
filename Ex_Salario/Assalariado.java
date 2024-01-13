
package exercicios1;

public class Assalariado extends Empregado {

    private double salario;
    
    public Assalariado(String n, String sn, String doc, double s){
        super(n, sn, doc);
        this.salario = 0.0;
        
    }
    
    
    @Override
    public double vencimento() {
    return this.salario;
    }
    
}
