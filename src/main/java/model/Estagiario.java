package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cefet
 */
public class Estagiario extends Funcionario {
    
    private String instituicaoDeEnsino;

    public Estagiario(String nome, String cpf, double salario, String instituicaoDeEnsino) {
        super(nome, cpf, salario);
        this.instituicaoDeEnsino = instituicaoDeEnsino;
    }
    
     @Override
     public double getBonificacao(){
     return 200.0;    
     }
     
     @Override
     public String getCargo(){
     return "estagiario";
     }
     
     @Override
     public String exibirDados(){
     return super.exibirDados() + "instituicao de ensino: " + this.instituicaoDeEnsino;
     }
    
    
    
}
