
package exercicios1;

public class Comissado extends Empregado {
    
    private double totalVenda;
    private double taxaComissao;
    
     public Comissado(String n, String sn, String doc, double tv, double tc){
         super(n, sn, doc);
         this.taxaComissao = tc;
         this.totalVenda = tv;
         
     }
    @Override
    public double vencimento() {
        return(this.totalVenda * this.taxaComissao);
    }
    
}
