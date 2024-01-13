/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ponto2d;

import java.util.ArrayList;
import java.util.Iterator;

public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Maria", "0102");
        Gerente g = new Gerente(1234, "Joao", "0304");
        Diretor d = new Diretor("Paula", "0706", 5678);
        
        ControleBonificacao controle = new ControleBonificacao();
        
        ArrayList<Funcionario> listaFun = new ArrayList<Funcionario>();
        listaFun.add(f1);
        listaFun.add(1,g);
        listaFun.add(d);
        
       /* for(int i=0; i < listaFun.size(); i++){
            
            Funcionario f = listaFun.get(i);
            System.out.println("Nome: "+f.getNome()+
                    " CPF: "+f.getCpf());
         
        }*/
       
       Iterator<Funcionario> it = listaFun.iterator();
       
       while(it.hasNext()){
           Funcionario f2 = it.next();
           if ( f2 instanceof Gerente) {
                Gerente g1 = (Gerente)f2;
               System.out.println("Senha: "+g1.getSenha());
           }
           
           
           
           
           
           System.out.println("Nome: "+f2.getNome()+
                    " CPF: "+f2.getCpf());
        }
        
        //Funcionario f = (Funcionario)listaFun.get(2);
        Gerente f = (Gerente)listaFun.get(1);
        System.out.println(f.getSenha());

      
       
        
        f1.setSalario(1500.0);
        g.setSalario(5000.0);
        d.setSalario(15000);
        
        controle.registra(f1);
        System.out.println(f1.calculaBonificacao());
        controle.registra(g);
        System.out.println(g.calculaBonificacao());
        controle.registra(d);
        System.out.println(d.calculaBonificacao());
        
        System.out.println("Total de Bonus pago: "+controle.getTotalBonificacao());

        
        
        
        /*Funcionario f2 = d;
        
             
        
        if (f2 instanceof Gerente) {
            f2.calculaBonificacao();
            System.out.println("Minha boificacao eh: " + f2.calculaBonificacao());
        }else{
            System.out.println("Não funcionou!");
        }*/

        /*System.out.println("Eu sou o(a): " + f1.getNome() + " e meu salario eh: "+
                f1.getSalario());
        System.out.println("Sou um funcionario(a) e meu bonus eh: "
                + f1.calculaBonificacao());
        System.out.println("Eu sou o(a): " + g.nome+ " e meu salario eh: "+
                g.getSalario());
        System.out.println("Sou um gerente e meu bonus eh: "
                + g.calculaBonificacao());
        
        System.out.println("Eu sou o(a): " + d.getNome());

        boolean resul = g.validaSenha(12345);

        if (resul) {
            System.out.println("Acesso Permitido!");
        } else {
            System.out.println("Acesso Negado!");
        }
         */
    }

}

