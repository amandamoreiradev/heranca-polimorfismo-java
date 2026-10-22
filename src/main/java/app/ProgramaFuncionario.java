package app;

import Scanner;
import Funcionario;
import Programador;
import Estagiario;
import Gerente;
import Diretor;
import ControleDeBonificacoes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cefet
 */
public class ProgramaFuncionario {

public static void main(String[] args) {
    
     System.out.println("---cadastro de programador---");
     Scanner scanner = new Scanner(System.in);
    
    System.out.println("nome: ");
    String nomeProg = Scanner.nextline();

    System.out.println("cpf: ");
    String cpfprog = Scanner.nextLine();

    System.out.println("salario: ");
    String salariotextoprog = Scanner.nextline();
    Double salarioProg = Double.parseDouble(salariotextoprog);

    System.out.println("linguagem: ");
    String linguagemProg = scanner.nextLine();

    Funcionario prog = new programador(nomeProg, cpfProg, salarioProg, linguagemProg);
} 

        System.out.println("\n---cadastro de estagiario---");
        System.out.print("nome: ");
        String nomeEst = scanner.nextLine();
        System.out.print("cpf: ");
        String cpfEst = scanner.nextLine();
        System.out.print("salario: ");
        double salarioEst = Double.parseDouble(scanner.nextLine());
        System.out.print("instituicao de ensino: ");
        String instEst = scanner.nextline();

        Funcionario est = new Estagiario(nomeEst, cpfEst, salarioEst, instEst);
        
         System.out.println("\n---cadastro de gerente---");
        System.out.print("nome: ");
        String nomeGer = scanner.nextLine();
        System.out.print("cpf: ");
        String cpfGer = scanner.nextLine();
        System.out.print("salario: ");
        double salarioGer = Double.parseDouble(scanner.nextLine());
        System.out.print("senha (inteiro): ");
        int senhaGer = Integer.parseInt(scanner.nextline());
        
        Gerente ger = new Gerente(nomeGer, cpfGer, salarioGer, senhaGer);
        
        System.out.println("\n---cadastro de diretor---");
        System.out.print("nome: ");
        String nomeDir = scanner.nextLine();
        System.out.print("cpf: ");
        String cpfDir = scanner.nextLine();
        System.out.print("salario: ");
        double salarioDir = Double.parseDouble(scanner.nextLine());
        System.out.print("senha (inteiro): ");
        int senhaDir = (scanner.nextLine());

        Funcionario dir = new Diretor(nomeDir, cpfDir, salarioDir, senhaDir);

        System.out.println("\n---autenticacao do gerente---");
        System.out.print("digite a senha do gerente para teste: ");
        int senhaTentativa = (scanner.nextLine());

        if (ger.autentica(senhaTentativa)) {
            System.out.println("acesso permitido");
        } else {
            System.out.println("acesso negado");
        }


        ControleDeBonificacoes controle = new ControleDeBonificacoes();
        controle.registra(prog);
        controle.registra(est);
        controle.registra(ger);
        controle.registra(dir);


        System.out.println("\n=====RELATORIO=====");
        

        prog.exibirDados();
        System.out.println();
        est.exibirDados();
        System.out.println();
        ger.exibirDados();
        System.out.println();
        dir.exibirDados();
        System.out.println();

        System.out.println("total de bonificacoes pagas pela empresa: R$ " + controle.getTotalDeBonificacoes());

        scanner.close();
    }
}

}
