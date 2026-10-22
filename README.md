# heranca-polimorfismo-java

# Funcionários da Empresa – Herança e Polimorfismo
## Descrição
Programa que cadastra funcionários de diferentes cargos e calcula
a bonificação de fim de ano de cada um usando polimorfismo.
## Hierarquia de classes
Funcionario (abstract)
├── Programador
├── Estagiario
├── Gerente
└── Diretor
## Como executar
1. Compile o programa
2. Execute a classe ProgramaFuncionario
## Respostas
#1. O que significa dizer que “todo Diretor é um Gerente” e que “todo Gerente é um
Funcionario”?

significa que a classe "Diretor" herda todas as características e comportamentos da classe "Gerente" e a classe "Gerente" herda todas as características e comportamentos da classe "Funcionario"

2. Qual é a diferença entre super(...) e super.getBonificacao()?
3. 
o super(...) é default enquanto o super.getBonificacao()

4. O método registra() da classe ControleDeBonificacoes recebe um
Funcionario. Como ele sabe qual regra de bonificação usar? Isso é decidido na
compilação ou na execução?

é decidido na execuçao, pois o compilador aceita o tipo genérico Funcionario, mas quando o programa roda, olha para o objeto real que está na memória e chama o método getBonificacao() correto e sobrescrito daquela classe filha

6. Se a empresa criar um novo cargo (por exemplo, Analista), será necessário alterar a
classe ControleDeBonificacoes? Por quê?

não, pois a classe ControleDeBonificacoes foi programada para receber a classe mãe Funcionario. Entao desde que o novo cargo de Analista herde de Funcionario e faça a sua própria sobrescrita do método de bonificação, o método registra vai aceitá-lo automaticamente sem precisar alterar código nele

8. Por que não é possível instanciar uma classe abstrata? Então, para que ela serve?

 ela serve de molde para garantir uma estrutura padrao com atributos e métodos comuns que todas as classes filhas obrigatoriamente devem herdar e implementar

## Tecnologias
- Java
## Autor
Amanda Moreira Costa

