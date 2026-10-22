package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cefet
 */
public class Diretor extends Gerente{

    public Diretor(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario, senha);
    }
    
    @Override
    public double getBonificacao(){
    return super.getBonificacao() + 1000.0;
    }
    
    @Override
    public String getCargo() {
        return "Diretor";
    }
}
