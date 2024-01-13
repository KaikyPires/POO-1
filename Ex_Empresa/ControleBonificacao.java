/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ponto2d;

/**
 *
 * @author 0076893
 */
public class ControleBonificacao {
    
    private  double totalBonificacao = 0;
    
    public  void registra(Funcionario f){
        if(!(f instanceof Diretor)){
              totalBonificacao += f.calculaBonificacao();
            
        }
      
        
    }

    public double getTotalBonificacao() {
        return totalBonificacao;
    }
    
    
    
}