
package estudo;

public class Funcionario {
   String nome;
   String sobrenome;
   double salario;
   double salariot;

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSalario(double salario) {
        
        this.salario = salario;
        
    }

    public double getSalario() {
        this.salario = salario * 12;
       
        return salario;
    }
     
    public void status(){
        System.out.print(this.nome);
        System.out.println(this.sobrenome);
        System.out.println(this.getSalario());
        System.out.println(this.getSalariot());
        
    }

    public double getSalariot() {
        this.salariot = salario + (salario * 0.10);
        return salariot;
    }

    public void setSalariot(double salariot) {
        
        this.salariot = salariot;
    }
   
 
   
}
