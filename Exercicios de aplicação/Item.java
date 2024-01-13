
package estudo;

public class Item {
    int código;
    String descrição;
    int qntdcomp;
    double preco;
    double total;

    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getQntdcomp() {
        return qntdcomp;
    }

    public void setQntdcomp(int qntdcomp) {
        this.qntdcomp = qntdcomp;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getTotal() {
        this.total = qntdcomp * preco;
        return total;
    }
     public void status(){
         System.out.println("CODIGO:" +this.código);
         System.out.println("DESCRIÇÃO:"+this.descrição);
         System.out.println("PREÇO:"+this.preco);
         System.out.println("QUANTIDADE COMPRADA:" +this.qntdcomp);
         System.out.println("TOTAL:" +this.getTotal());
    }

    
    
}
