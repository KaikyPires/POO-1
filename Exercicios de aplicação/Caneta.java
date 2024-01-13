
package estudo2;

public class Caneta {
    public String cor;
    private float ponta;
    public boolean tampada;
    protected int carga;

    public Caneta(String cor, float ponta, boolean tampada, int carga) {
        this.cor = cor;
        this.setPonta(ponta);
        this.tampada = tampada;
        this.carga = carga;
    }

   

    public String getCor() {
        return cor;
    }

    public float getPonta() {
        return ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public int getCarga() {
        return carga;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
     public void destampar(){
       this.tampada = false;
    }

   public void tampar(){
       this.tampada = true;
    }
    public void status(){
        System.out.println("Sobre a canete:");
        System.out.println("A cor:  " +this.cor);
        System.out.println("Ponta:  " +this.ponta);
        System.out.println("esta tampada ? " + this.tampada);
        System.out.println("Carga : " + this.carga+ "%\n");
    }
  
}
