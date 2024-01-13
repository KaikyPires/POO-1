
package exercicios1;

public class Horista extends Empregado{

    private double precoHora;
    private double horasTrabalhadas;
    
        public Horista(String n, String sn, String doc, double ph, double ht){
        super(n,sn,doc);
        this.horasTrabalhadas = ht;
        this.precoHora = ph;
        
    }
    
    
    
    @Override
    public double vencimento() {
        return()
    }
    
    
    
}
