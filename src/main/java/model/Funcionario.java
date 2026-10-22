package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cefet
 */
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }
    
    public abstract double getBonificacao();
    public abstract String getCargo();
    public String exibirDados(){
        return "cargo: " + getCargo() + 
           ", nome: " + this.nome + 
           ", cpf: " + this.cpf + 
           ", salario: " + this.salario + 
           ", bonificacao: " + getBonificacao();
}

    }
    

