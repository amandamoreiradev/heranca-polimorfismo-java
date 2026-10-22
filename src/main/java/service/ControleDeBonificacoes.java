package service;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cefet
 */
public class ControleDeBonificacoes import Funcionario{
    
    private double totalDeBonificacoes = 0;
    
    public void registra(Funcionario f){
    this.totalDeBonificacoes += f.getBonificacao();
    }
    
    public double getTotalDeBonificacoes(){
    return this.totaldeBonificacoes;
    }
    
}
