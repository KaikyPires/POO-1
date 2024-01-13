/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ponto2d;

/**
 *
 * @author 0076893
 */
public class Funcionario {
    
    protected String nome;
    private String cpf;
    protected double salario;
    
    
    public Funcionario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = 0.0;
        
    }
    
    public  double calculaBonificacao(){
        
        return (this.salario * 1.20);
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
            
    
}
